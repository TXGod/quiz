package session;

import entities.Question;

public interface GameSession {
	public boolean answer(int answer);
	public boolean score(boolean flag);
	public Question getNextQuestion();
}
