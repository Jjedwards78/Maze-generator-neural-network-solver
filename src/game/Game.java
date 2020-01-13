package game;

import javax.swing.JFrame;
import java.awt.Canvas;

public class Game implements Runnable {

    private JFrame frame;
    private Canvas canvas;
    
    public void run() {
        
    }

    public synchronized void start() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 450);
        frame.setVisible(true);
        canvas = new Canvas();
        
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