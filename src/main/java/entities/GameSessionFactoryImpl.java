package entities;

import java.util.List;

public class GameSessionFactoryImpl implements GameSessionFactory {

	public GameSession getTrueFalseGameSession(List<Question> questionList) {
		return new TrueFalseGameSession(questionList);
	}

}
