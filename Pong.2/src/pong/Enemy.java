package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {
    public double x,y;
    public int width, height;

    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 5;
    }

    public void tick(){
        // codigo para fazer o inimigo "pensar" e seguir a bola
        x+= (Game.ball.x - x - 6) * 0.07; // o ultimo parametro representa a taxa de erro que o inimigo vai ter
    }

    public void render(Graphics g){
        g.setColor(Color.RED);
        g.fillRect((int)x, (int)y, width, height);

    }
}
