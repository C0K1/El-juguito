package testcodes;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity{
		
	public Player(int x, int y,Color color) {
		super(x, y, color);
	}
		
	public void tick() {
		x += velX;
		y += velY;
	}

	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 32, 32);
	}
		
}

