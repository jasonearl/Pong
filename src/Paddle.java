import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Paddle extends Rectangle{
	int id; // 1 for paddle1 or 2 for paddle2
	int yVelocity; // how fast a paddle moves
	
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	public void setYDirection(int yDirection) {
		
	}
	
	public void move() {
		
	}
	
	public void draw(Graphics g) {
		if (id == 1) {
			g.setColor(Color.blue);
		}
		else { g.setColor(Color.red);}
		g.fillRect(x, y, width, height);
	
	}
	
}
