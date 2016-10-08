import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class World extends javax.swing.JPanel implements ActionListener {

    static CritterList myCL    = new CritterList();
    static NewFoodList myFL    = new NewFoodList();


    private Timer timer;

    public World() {
    }

    void SleepyTime (int delay) {
        int base = 5;
        try {
            Thread.sleep (base*delay);
        } catch (InterruptedException ie) {
            System.out.println("YOU CAUGHT AN EXCEPTION  --  SEE A DOCTOR");
        }
    }

    public void kluge() {
        final Graphics g;
        g = this.getGraphics();

        timer = new Timer(12, this);
        timer.start();
        // do initial stuff here
        myFL.addFood(Top.getInitFoodCnt());
        myCL.addCritter(Top.getInitCritterCnt());
        repaint();
        while (myCL.getNumOfCritters() > 0) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    if (!Top.pauseStatus){
                        myCL.moveCritters();
                        myFL.addFood();
                        Top.displayNumCritters();
                        Top.displayFoodCount();
                        Top.displayYear();
                    }
                }
            });
            SleepyTime(Top.getDelay());
            //repaint();
        }
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        myFL.drawFood(g);
        for (Critter critterinlist : myCL) {
            g.setColor(critterinlist.getColor());
            g.fillRect(critterinlist.getXPos(), critterinlist.getYPos(), 4, 4);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        this.getToolkit().sync();
    }
}
