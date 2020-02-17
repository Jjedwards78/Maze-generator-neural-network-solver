package game.MazeGenerator;

import java.awt.Graphics;
import java.awt.Color;

public class Maze {

    public int[][] tile;
    
    private int mapperX = 0, mapperY = 0;
    private int numTiles;


    public Maze() {
        //tile = new int[7][7];
        
    }

    public void huntAndKill() {

    }

    public void backTracking() {
        numTiles = (tile.length * tile[tile.length].length);
        //14
        for(int x = 0; x < 7; x++) {
            for(int y = 0; y < 7; y++) {
                tile[x][y] = 0;
            }
        }
        tile[0][0] = 15;
        
    }

    public void update() {
        if(numTiles != 0) {
            //1
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY + 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY - 1] != 0) {
                int lastX = mapperX;
                int lastY = mapperY;
                
            }
            //2
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //3
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //4
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //5
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //6
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //7
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //8
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //9
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //10
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //11
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //12
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //13
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
            //14
            if(tile[mapperX + 1][mapperY] == 0 && tile[mapperX][mapperY - 1] == 0 && tile[mapperX - 1][mapperY] != 0 && tile[mapperX][mapperY + 1] != 0) {
            }
        }
    }

    public void render(Graphics g) {

        g.setColor(new Color(00, 00, 00));
        g.drawRect(15, 15, 500, 500);

        for(int x = 0; x < tile.length; x++) {
            for(int y = 0; y < tile[tile.length].length; y++) {

            }
        }
    }

}