package game;

public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Maze Game", 1000, 600);
        game.start();
    }
}