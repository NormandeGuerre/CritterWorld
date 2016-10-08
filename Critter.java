import java.awt.Color;
import java.util.Random;

public class Critter {
    private int xpos = 0;
    private int ypos = 0;
    private int age = 0;
    private int energy = 0;
    private Color color = Color.GREEN;
    private int [] gene = {1,2,3,4,5,6,7,8};

    private static final int MAX_X = 876/4;
    private static final int MAX_Y = 396/4;

    private int getNewRandom (int max, int min) {
        Random rand = new Random();
        return (rand.nextInt((max - min) + 1) + min);
    }

    public Critter() {
        energy = 1000;
        xpos = (getNewRandom(MAX_X, 0)) * 4;
        ypos = (getNewRandom(MAX_Y, 0)) * 4;
        age = 0;
        color = Color.GREEN;
    }

    public void moveCritter (int x, int y) {
        this.xpos += x;
        if (this.xpos > 876) {
            this.xpos = 0;
        }
        if (this.xpos < 0) {
            this.xpos = 876;
        }

        this.ypos += y;
        if (this.ypos > 396) {
            this.ypos = 0;
        }
        if (this.ypos < 0) {
            this.ypos = 396;
        }
    }


    public int getXPos() {
        return (xpos);
    }

    public int getYPos() {
        return (ypos);
    }

    public void putXPos(int num) {
        this.xpos = num;
    }

    public void putYPos(int num) {
        this.ypos = num;
    }

    public int getEnergy() {
        return (energy);
    }

    public void putEnergy(int num) {
        this.energy = num;
    }

    public void addEnergy(int num) {
        this.energy += num;
    }

    public void subtractEnergy(int num) {
        this.energy -= num;
    }

    public int getAge() {
        return (age);
    }

    public void putAge(int num) {
        this.age = num;
    }

    public void addAge() {
        this.age++;
    }

    public void setColor(Color newcolor) {
        this.color = newcolor;
    }

    public Color getColor() {
        return (color);
    }

    public int getGene(int num) {
        return (this.gene[num]);
    }

    public void putGene(int num, int val) {
        this.gene[num] = val;
    }

}
