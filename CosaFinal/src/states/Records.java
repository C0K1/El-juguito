package states;

import Basics.GameEngine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Records extends State{

	public Records(GameEngine game) {
		super(game);
        // Creditos Button*****************************************************************************
        
        Button records = new Button("Records");
        records.getStyleClass().add("records");
        records.setTranslateX(0);
        records.setTranslateY(-200);
        this.getChildren().add(records);

		// Close Button*****************************************************************************
		Button close = new Button("x");
        close.getStyleClass().add("close");
        close.setTranslateX(300);
        close.setTranslateY(-225);
        close.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
        		game.getPrimaryStage().close();
        	}
        });
        
        this.getChildren().add(close);
        // Regresar Button*****************************************************************************
        
        Button menu = new Button("Regresar");
        menu.getStyleClass().add("menu");
        menu.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
            	MainMenu menu = new MainMenu(game);
        	    game.setScene(menu, menu.getStyleSheet());
        	}
        });
        menu.setTranslateX(-200);
        menu.setTranslateY(200);
        this.getChildren().add(menu);
	}
	
	public  String getStyleSheet() {
		return this.getClass().getResource("/StyleSheets/records.css").toExternalForm();
	}


}
