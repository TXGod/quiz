package session;

import java.util.List;

import entities.Question;

public interface GameSessionFactory {
	public GameSession getTrueFalseGameSession(List<Question> questionList);
}
