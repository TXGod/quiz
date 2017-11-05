package entities;

public interface GameSession {
	public boolean answer(int answer);
	public boolean score(boolean flag);
	public void setPenalty(int penalty);
	public void setPrize(int prize);
	public long getScore();
	public Question getNextQuestion();
}
