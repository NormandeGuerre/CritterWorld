import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class CritterList extends ArrayList<Critter> {

    public CritterList () {
    }

    public boolean checkCritterList (Critter aCritter) {
        for (Critter clist : this) {
            if ((clist.getXPos() == aCritter.getXPos()) &&
                    (clist.getYPos() == aCritter.getYPos())) {
                return (false);
                    }
        }
        return (true);
    }

    public void addCritter (int num) {
        int cnt = 0;
        while (cnt < num) {
            Critter newCritter = new Critter();
            if (checkCritterList (newCritter)) {
                this.add(newCritter);
                cnt ++;
            }
        }
    }

    public void removeCritter (Critter theCritter) {
        remove (theCritter);
    }

    public int getNumOfCritters() {
        return (size());
    }

    private int getNewRandom (int max, int min) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }


    public void moveCritters () {
        Critter aCritter;
        ListIterator <Critter> CI = this.listIterator();


        while (CI.hasNext()) {
            aCritter = CI.next();
            int i = 0;
            int j = 0;
//            int direction = getNewRandom(7,0);
            int move = getNewRandom(aCritter.getGene(7),0);
            for (i = 0; move > aCritter.getGene(i); ++i)
                ;
            int direction = i;
            //System.out.println("This is direction: " + direction);
            switch (direction) {
                case 0:     aCritter.moveCritter(0,4);
                            break;
                case 1:     aCritter.moveCritter(0,-4);
                            break;
                case 2:     aCritter.moveCritter(4,0);
                            break;
                case 3:     aCritter.moveCritter(4,4);
                            break;
                case 4:     aCritter.moveCritter(4,-4);
                            break;
                case 5:     aCritter.moveCritter(-4,0);
                            break;
                case 6:     aCritter.moveCritter(-4,4);
                            break;
                case 7:     aCritter.moveCritter(-4,-4);
                            break;
                default:    aCritter.moveCritter(-4,-4);
                            break;
            }
            aCritter.addAge();
            if (Top.OLD_AGE_KILLS) {
                if (aCritter.getAge() > Top.getDeathAge()){
                    CI.remove();
                }
            }
            //EATING
            int numm = World.myFL.checkFoodList(aCritter.getXPos(), aCritter.getYPos());
            aCritter.addEnergy(numm * Top.getFoodValue());
            // subtract energy
            aCritter.subtractEnergy(Top.getMoveCost());
            if (aCritter.getEnergy() < 0) {
                CI.remove();
            }
            if (aCritter.getEnergy() < 300){
                aCritter.setColor(Color.RED);
            } else {
                aCritter.setColor(Color.GREEN);
            }
//            if (aCritter.getAge() > 900) {
//                aCritter.setColor(Color.WHITE);
//            }
//            if (aCritter.getEnergy() > 4000) {
//                aCritter.setColor(Color.BLUE);
//            }


            if ((Top.getAgeOfRepro() < aCritter.getAge()) && (Top.getCostOfRepro() < (aCritter.getEnergy()/3))){
                aCritter.putAge (0);

                aCritter.subtractEnergy(Top.getCostOfRepro());
                aCritter.subtractEnergy(aCritter.getEnergy()/2);
                Critter newCritter = new Critter();
                newCritter.putEnergy(aCritter.getEnergy());
                newCritter.putXPos(aCritter.getXPos());
                newCritter.putYPos(aCritter.getYPos());
                // give child same genes as parent
                for (j = 0; j < 8; j++) {
                    newCritter.putGene (j, aCritter.getGene(j));
                }
                // mutate genes - Child max mutate should equal 4
                int MAX_MUTATE = 4;
                j = getNewRandom(7,0); 
                newCritter.putGene (j, newCritter.getGene(j)+ getNewRandom(MAX_MUTATE,0));

                // mutate genes - Parent
//                j = getNewRandom(7,0);
//                aCritter.putGene (j, aCritter.getGene(j)+ getNewRandom(7,0));

                CI.add(newCritter);
            }
        }
    }
}
