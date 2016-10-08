import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class NewFoodList {
    public boolean foodlist[][] = new boolean[880][400];
    public int xpos = 0;
    public int ypos = 0;

    public NewFoodList () {
        for (int i = 0; i < 880; i++){
            for (int j = 0; j < 400; j++){
                foodlist[i][j] = false;
            }
        }
    }

    private static final int MAX_X = 878/2;
    private static final int MAX_Y = 398/2;

    private int getNewRandom(int max, int min){
        Random rand = new Random();
        return (rand.nextInt((max-min)+1) + min);
    }

    public int checkFoodList (int x, int y) {
        int cnt = 0;
        for (int i = x; i < x+4; i++){
            for (int j = y; j < y+4; j++){
                if ((i >= 880) || (j >= 400)){
                    System.out.println("Out of Bounds: " + i + "  " + j);
                } else {
                    if (foodlist[i][j]){
                        cnt++;
                        foodlist[i][j] = false;
                    }
                }
            }
        }
        return (cnt);
    }


    public void addFood(int num){
        int cnt  = 0;
        int xpos = 0;
        int ypos = 0;

        while (cnt < num) {
            xpos = (getNewRandom(MAX_X, 0)) * 2;
            ypos = (getNewRandom(MAX_Y, 1)) * 2;

            if (!foodlist [xpos] [ypos]){
                foodlist [xpos] [ypos] = true;
                cnt ++;
            }
        }
    }

    public void addFood(){
        int cnt = 0;
        int num = 0;
        int xpos = 0;
        int ypos = 0;


        if ((getAmtofFood() + Top.getFoodGrowthRate()) < Top.getMaxFood()){
            num = Top.getFoodGrowthRate();
        } else {
            num = (Top.getMaxFood() - getAmtofFood());
        }

        while (cnt < num) {
            xpos = (getNewRandom(MAX_X, 0)) * 2;
            ypos = (getNewRandom(MAX_Y, 1)) * 2;

            if (!foodlist [xpos] [ypos]){
                foodlist [xpos] [ypos] = true;
                cnt ++;
            }
        }
    }

    public void drawFood(Graphics g){
        g.setColor(Color.WHITE);
        for (int i = 0; i < 880; i++){
            for (int j = 0; j < 400; j++){
                if (foodlist [i][j]) {
                    g.fillRect(i, j, 1, 1);
                }
            }
        }
    }

    public int getAmtofFood(){
        int size = 0;
        for (int i = 0; i < 880; i++){
            for (int j = 0; j < 400; j++){
                if (foodlist[i][j]) {
                    size++;
                }
            }
        }
        return(size);
    }
}
