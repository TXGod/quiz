package session;

import java.util.ArrayList;

import entities.Question;

public class TrueFalseGameSession implements GameSession {
	ArrayList<Question> questionList = new ArrayList<Question>(); 
	long score;
	int penalty;
	int prize;
	String[] tags;
	int index=-1;
	
	public TrueFalseGameSession() {
		
	}

	public boolean answer(int answer) {
		return false;
	}
	
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	public long getScore() {
		return this.score;
	}

	public void initSession() {
		// TODO Auto-generated method stub
		
	}

	public void score(boolean flag) {
		if(flag) {
			score+=prize;
		} else {
			score-=penalty;
		}
	}

	public Question getNextQuestion() {
		index++;
		if(questionList.size()>index) {
			return questionList.get(index);
		}
		return null;
	}

}
