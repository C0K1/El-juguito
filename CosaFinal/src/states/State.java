package states;

import Basics.GameEngine;
import javafx.scene.layout.StackPane;

public abstract class State extends StackPane{
	
	public State(GameEngine game) {
		
	}
	
	public abstract String getStyleSheet();
	
}
