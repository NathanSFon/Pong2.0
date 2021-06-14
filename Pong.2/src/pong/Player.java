package pong;

//import java.sql.Time;
import java.awt.Color;
import java.awt.Graphics;

public class Player {
    
    public boolean right, left;
    public int  x,y;
    public int width, height;

    public Player(int x, int y){
        // a posição que ele vai iniciar 
        this.x = x;
        this.y = y;
        // tamanho do jogador na tela 
        this.width = 40;
        this.height = 5;
    }

    public void tick(){
        // movimento do jogador
        if(right){
            x++;
        }else if(left){
            x--;
        }

        if(x+width > Game.WIDTH){
            x = Game.WIDTH - width;
        }else if(x < 0){
            x = 0;
        }
    }

    public void render(Graphics g){
        g.setColor(Color.WHITE); //seta a cor para o "player"
        g.fillRect(x, y, width, height); // cria o "player" com tamanho e na posição definida 
    }
}
