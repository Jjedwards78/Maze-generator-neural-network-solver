package game;

import game.Input.KeyInput;
import game.Input.MouseInput;

public class Handler {

    private Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public KeyInput getKeyInput() {
        return game.getKeyInput();
    }

    public MouseInput getMouseInput() {
        return game.getMouseInput();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}