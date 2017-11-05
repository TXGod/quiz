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
	MainMenu mainMenu;
		
	public Game(GameSession gameSession, MainMenu mainMenu) {
		this.mainMenu = mainMenu;
		this.gameSession = gameSession;
		this.root = (StackPane) root;
		
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
		wrong.setTranslateX(300);
		wrong.setTranslateY(0);
		root.getChildren().add(title);
		
		Label desc = new Label("Treœæ");
		wrong.setTranslateX(200);
		wrong.setTranslateY(0);
		root.getChildren().add(desc);
		
		Label img = new Label("Obraz");
		wrong.setTranslateX(300);
		wrong.setTranslateY(0);
		root.getChildren().add(img);
		
		Label score = new Label("Wynik");
		wrong.setTranslateX(-100);
		wrong.setTranslateY(200);
		root.getChildren().add(score);
		
		
		
	}
	
}
