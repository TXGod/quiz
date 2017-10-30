package controllers;

import java.util.List;

import entities.Question;
import session.GameSession;
import session.GameSessionFactory;
import session.GameSessionFactoryImpl;

public class GameController {
	GameSessionFactory gameSessionFactory;
	
	GameController() {
		this.gameSessionFactory = new GameSessionFactoryImpl();
	}
		
	public GameSession getGameSession(List<Question> questionList) {
		return gameSessionFactory.getTrueFalseGameSession(questionList);
	}
}
