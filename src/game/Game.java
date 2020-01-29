package game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import game.Input.KeyInput;
import game.Input.MouseInput;


public class Game implements Runnable {

    private Thread thread;
    private JFrame frame;
    private Canvas canvas;

     
    private int width, height;
    public String title;

    private BufferStrategy bs;
    private Graphics g;

    private boolean running = false;

    public MouseInput mouseIn;
    public KeyInput keyIn;

    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void init() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(width, height);
        frame.setVisible(true);
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false);

        canvas.addMouseListener(mouseIn);
        canvas.addKeyListener(keyIn);
        frame.add(canvas);
        frame.pack();
    }

    public void run() {
        init();

        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                frame.setTitle("Maze Program | ups: " + updates + " | fps: " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }

    public synchronized void start() {
        if(running) return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if(!running) return;
        try {
            thread.join();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {

    }

    public void render() {
        bs = canvas.getBufferStrategy();
        if(bs == null) {
            canvas.createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.clearRect(0, 0, width, height);

        bs.show();
        g.dispose();
    }

    public JFrame getFrame() {
        return frame;
    }
}