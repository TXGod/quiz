package entities;

import java.util.List;

public interface GameSessionFactory {
	public GameSession getTrueFalseGameSession(List<Question> questionList);
}
