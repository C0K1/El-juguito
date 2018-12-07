package states;




import Basics.GameEngine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MainMenu extends State{

	public MainMenu(GameEngine game) {
		super(game);
//		Sound.music();
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
        // Start Button*****************************************************************************
        
        Button init = new Button("Iniciar");
        init.setTranslateX(-200);
        init.setTranslateY(200);
        init.getStyleClass().add("init");
        init.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
        		Game gameinit = new Game(game);
        	    game.setScene(gameinit, gameinit.getStyleSheet());
        	}
        });
        
        this.getChildren().add(init);
        
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

        // Creditos Button*****************************************************************************
        
        Button creditos = new Button("Creditos");
        creditos.getStyleClass().add("creditos");
        creditos.setOnAction(new EventHandler<ActionEvent>()
        {
        	@Override

        	public void handle(ActionEvent event)
        	{
        		Creditos creditos = new Creditos(game);
        	    game.setScene(creditos, creditos.getStyleSheet());
        	}
        });
        creditos.setTranslateX(200);
        creditos.setTranslateY(200);
        this.getChildren().add(creditos);
        
	}    
		//Musica.....
    	

    			
    //Style CSS

	public  String getStyleSheet() {
		return this.getClass().getResource("/StyleSheets/main-menu.css").toExternalForm();
	}

}
