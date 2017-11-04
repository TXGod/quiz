package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
 

public class MainMenu extends Application {
	
	StackPane root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Quiz");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
