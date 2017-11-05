package gui;



import entities.GameSession;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Game {
	GameSession gameSession;
	StackPane root;
	Scene scene;
	MainMenu mainMenu;
		
	public Game(GameSession gameSession, MainMenu mainMenu) {
		this.mainMenu = mainMenu;
		this.gameSession = gameSession;
		scene = new Scene(new StackPane(), 550, 660);
		root = (StackPane) scene.getRoot();
		mainMenu.setScene(scene);
		initGame();
	}
	
	private void initGame() {
		
		Button right = new Button("Prawda") ;
		right.setTranslateX(0);
		right.setTranslateY(-200);
		root.getChildren().add(right);
		
		Button wrong = new Button("Fa³sz");
		wrong.setTranslateX(0);
		wrong.setTranslateY(200);
		root.getChildren().add(wrong);
		
		Label title = new Label("Tytu³");
		title.setTranslateX(300);
		title.setTranslateY(0);
		root.getChildren().add(title);
		
		Label desc = new Label("Treœæ");
		desc.setTranslateX(200);
		desc.setTranslateY(0);
		root.getChildren().add(desc);
		
		Label img = new Label("Obraz");
		img.setTranslateX(300);
		img.setTranslateY(0);
		root.getChildren().add(img);
		
		Label score = new Label("Wynik");
		score.setTranslateX(-100);
		score.setTranslateY(200);
		root.getChildren().add(score);
		
		
		
	}
	
}
