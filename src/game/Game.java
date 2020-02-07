package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import game.Input.KeyInput;
import game.Input.MouseInput;
import game.MazeGenerator.Maze;
import game.Display.Display;

public class Game implements Runnable {

    private Thread thread;

    private Display display;
    
    private int width, height;
    public String title;

    private BufferStrategy bs;
    private Graphics g;

    private boolean running = false;

    private MouseInput mouseIn;
    private KeyInput keyIn;

    private Maze maze;

    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        mouseIn = new MouseInput();
        keyIn = new KeyInput();
    }

    public void init() {
        display = new Display("maze", width, height);
        
        display.getFrame().addKeyListener(keyIn);
        display.getFrame().addMouseListener(mouseIn);
        display.getFrame().addMouseMotionListener(mouseIn);
        display.getCanvas().addMouseListener(mouseIn);
        display.getCanvas().addMouseMotionListener(mouseIn);
        
        maze = new Maze();
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
            render(g);
            frames++;

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                display.getFrame().setTitle("Maze Program | ups: " + updates + " | fps: " + frames);
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

    public void render(Graphics g) {
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
       
        g.clearRect(0, 0, width, height);

        //g.setColor(new Color(50, 50, 50));
        //g.setFont(new Font("Sans-Serif", 16, 16));
        //g.drawString((String)("mouseX: " + mouseIn.mouseX + " mouseY: " + mouseIn.mouseY), 50, 50);

        maze.render(g);
        
        bs.show();
        g.dispose();
    }

    public KeyInput getKeyInput() {
        return keyIn;
    }

    public MouseInput getMouseInput() {
        return mouseIn;
    }

}