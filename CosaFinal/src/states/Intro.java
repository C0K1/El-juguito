package states;

import Basics.GameEngine;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;

public class Intro extends State{

	public Intro(GameEngine game) {
		super(game);
		Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
            	MainMenu menu = new MainMenu(game);
        	    game.setScene(menu, menu.getStyleSheet());
            }
        });
        new Thread(sleeper).start();
	}

	@Override
	public String getStyleSheet() {
		// TODO Auto-generated method stub
		return this.getClass().getResource("/StyleSheets/intro.css").toExternalForm();
	}

}
