package game;

public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Maze Game", 800, 450);
        game.start();
    }
}