package Basics;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import states.Intro;

public class GameEngine extends Application{
	
	
	private Stage primaryStage;
	
	public static void main (String []args) {
		launch(args);
	}
    public void start(Stage primaryStage) throws Exception {
		 	
		this.primaryStage = primaryStage;
		
	    primaryStage.initStyle(StageStyle.UNDECORATED);
	    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
	    primaryStage.setX((screenBounds.getWidth() - 640) / 2); 
	    primaryStage.setY((screenBounds.getHeight() - 480) / 2);
	    primaryStage.show();
	    
	    //states
	    Intro intro = new Intro(this);
	    setScene(intro, intro.getStyleSheet());
	
	}
	
	public void setScene(StackPane root, String styleSheet) {
		Scene scene = new Scene(root, 640, 480);
		scene.getStylesheets().add(styleSheet);
		primaryStage.setScene(scene);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

}
