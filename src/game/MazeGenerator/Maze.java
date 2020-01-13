package game.MazeGenerator;

import java.util.ArrayList;

public class Maze {

    public int[][] tile;
    public ArrayList<Integer> mazeTiles;
    
    public Maze() {
        mazeTiles = new ArrayList<Integer>();
        tile = new int[7][7];
    }

    
}