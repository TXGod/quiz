package controllers;

import session.GameSession;
import session.GameSessionFactory;
import session.GameSessionFactoryImpl;

public class GameController {
	GameSessionFactory gameSessionFactory;
	
	GameController() {
		this.gameSessionFactory = new GameSessionFactoryImpl();
	}
		
	public GameSession getGameSession() {
		return gameSessionFactory.getTrueFalseGameSession();
	}
}
