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
        frame.setSize(800, 450);
        frame.setVisible(true);

    }

    public synchronized void stop() {

    }

    public void update() {

    }

    public void render() {

    }

    public JFrame getFrame() {
        return frame;
    }
}