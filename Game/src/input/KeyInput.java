package input;

import testcodes.Entity;

public class KeyInput extends Player1KeyInput{

	Entity player1;
	
	public KeyInput (Entity player1) {
		this.player1 = player1;
		
		if(up) player1.setVelY(-1);
		if(down) player1.setVelY(1);
		if(left) player1.setVelX(1);
		if(right) player1.setVelX(-1);
	}
}
