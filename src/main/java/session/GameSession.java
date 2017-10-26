package session;

import entities.Question;

public interface GameSession {
	public boolean answer(int answer);
	public void initSession();
	public void score(boolean flag);
	public Question getNextQuestion();
}
