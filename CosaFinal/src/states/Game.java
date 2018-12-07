package states;

import Basics.GameEngine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Game extends State{

	public Game(GameEngine game) {
		super(game);
		//Regreso Prueba
        Button regreso = new Button("<");
        regreso.getStyleClass().add("regreso");
        regreso.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
            	MainMenu menu = new MainMenu(game);
        	    game.setScene(menu, menu.getStyleSheet());
        	}
        });
        regreso.setTranslateX(250);
        regreso.setTranslateY(-225);
        this.getChildren().add(regreso);
        //Termina Regreso Prueba
		
		
		// Records Button*****************************************************************************
        
        Button records = new Button("Records");
        records.getStyleClass().add("records");
        records.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
            	Records records = new Records(game);
        	    game.setScene(records, records.getStyleSheet());
        	}
        });
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
    //Lilyan
		Rectangle memory = new Rectangle(200,200);
		
		memory.setLayoutX(10);
		memory.setLayoutY(100);
		memory.setFill(Color.CORAL);
		memory.getStyleClass().add("memory");
		memory.toBack();
		
		this.getChildren().add(memory);
	//Lilyan 
	//DragNDrop Inicia
        // button and pane are created
        Button btOK = new Button("OK");
        Pane pane = new Pane();
        // this code drags the button
        btOK.setOnMouseDragged(e -> {
        btOK.setLayoutX(e.getSceneX());
        btOK.setLayoutY(e.getSceneY());
         });
        // button added to pane and pane added to scene
        pane.getChildren().add(btOK);
        Scene scene = new Scene(pane,200, 250);
	//DragNDrop Termina

	}

	@Override
	public String getStyleSheet() {
		// TODO Auto-generated method stub
		return this.getClass().getResource("/StyleSheets/game.css").toExternalForm();
	}
	
}
