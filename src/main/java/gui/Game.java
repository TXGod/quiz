package gui;

import entities.GameSession;
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
	
}
