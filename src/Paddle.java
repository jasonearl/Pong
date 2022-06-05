import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Paddle extends Rectangle{
	int id; // 1 for paddle1 or 2 for paddle2
	int yVelocity; // how fast a paddle moves
	int speed = 10;
	
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) { // left paddle goes up when player hits 'w' key
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) { // left paddle goes down when player hits 's' key
				setYDirection(speed);
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) { // right paddle goes up when player hits up arrow key
				setYDirection(-speed);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) { // right paddle goes down when player hits down arrow key
				setYDirection(speed);
				move();
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(0);
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(0);
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(0);
				move();
			}
			break;
		}
	}
	
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	
	public void move() {
		y += yVelocity;
	}
	
	public void draw(Graphics g) {
		if (id == 1) {
			g.setColor(Color.blue);
		}
		else { g.setColor(Color.red);}
		g.fillRect(x, y, width, height);
	
	}
	
}
