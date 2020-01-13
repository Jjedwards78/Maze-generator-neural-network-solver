package game;

import javax.swing.JFrame;

public class Game implements Runnable {

    private JFrame frame;


    public void run() {
        
    }

    public synchronized void start() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public synchronized void stop() {

    }
}