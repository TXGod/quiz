package repositories;

import java.util.List;

import entities.GameSession;
import entities.GameSessionFactory;
import entities.GameSessionFactoryImpl;
import entities.Question;
import entities.TrueFalseGameSession;

public class GameSessionRepository {
	GameSessionFactory gameSessionFactory;
	
	public GameSessionRepository() {
		gameSessionFactory = new GameSessionFactoryImpl();
	}
	
	public GameSession getTrueFalseGameSession(List<Question> questionList) {
		return new TrueFalseGameSession(questionList);
	}
}
