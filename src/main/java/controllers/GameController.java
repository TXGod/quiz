package controllers;

import java.util.List;

import entities.GameSession;
import entities.GameSessionFactory;
import entities.GameSessionFactoryImpl;
import entities.Question;
import repositories.GameSessionRepository;

public class GameController {
	GameSessionRepository gameSessionRepository;
	
	public GameController() {
		this.gameSessionRepository = new GameSessionRepository();
	}
		
	public GameSession getGameSession(List<Question> questionList) {
		return gameSessionRepository.getTrueFalseGameSession(questionList);
	}
}
