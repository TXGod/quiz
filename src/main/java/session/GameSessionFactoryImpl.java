package session;

import java.util.List;

import entities.Question;

public class GameSessionFactoryImpl implements GameSessionFactory {

	public GameSession getTrueFalseGameSession(List<Question> questionList) {
		return new TrueFalseGameSession(questionList);
	}

}
