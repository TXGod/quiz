package gui;

import entities.GameSession;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

public class Game {
	GameSession gameSession;
	StackPane root;
		
	public Game(GameSession gameSession, Scene scene) {
		this.gameSession = gameSession;
		root = (StackPane) scene.getRoot();
		
	}
	
}
