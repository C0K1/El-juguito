package states;

import Basics.GameEngine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class Creditos extends State{
	
	public Creditos(GameEngine game) {
		super(game);
        // Creditos Button*****************************************************************************
        
        Button creditos = new Button("Creditos\nIdeas: Zacile y Coki\nDiseño: Zacile\nProgramación: Zacile y Coki\n");
        creditos.getStyleClass().add("creditos");
/*        creditos.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
        		Creditos creditos = new Creditos(game);
        	    game.setScene(creditos, creditos.getStyleSheet());
        	}
        });
*/
        creditos.setTranslateX(0);
        creditos.setTranslateY(-200);
        this.getChildren().add(creditos);
        
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
        
        
        // exit button
        
        Button exit = new Button("Salir");
        exit.getStyleClass().add("exit");
        exit.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
        		game.getPrimaryStage().close();
        	}
        });
        exit.setTranslateX(0);
        exit.setTranslateY(200);
        this.getChildren().add(exit);
        
        
	}

	public  String getStyleSheet() {
		return this.getClass().getResource("/StyleSheets/creditos.css").toExternalForm();
	}
	
		
	}


