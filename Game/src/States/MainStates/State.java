package States.MainStates;

import java.awt.Graphics;

import javax.swing.JPanel;

import GameBasics.GameEngine;

public abstract class State extends JPanel{


	private static final long serialVersionUID = 1L;
	private static State currentState = null;
	
	
 //********************************** ABSTRACT METHODS *****************************************//
	
	// The three important actions within a game loop
	
	public abstract void init(GameEngine gmrunnable); //initialize
	public static  void tick() {}    
    public  void render(Graphics g) {}
    
    // 
    
	public abstract  boolean isRenderable();
    
	public static boolean renderable = true;
    
 //****************************************	CLASS ********************************************//
    
    
    //getters and setters
    
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}

}