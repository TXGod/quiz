package session;

import java.util.ArrayList;
import java.util.List;

import entities.Question;

public class TrueFalseGameSession implements GameSession {
	List<Question> questionList;
	long score;
	int penalty;
	int prize;
	String[] tags;
	int index=-1;
	
	public TrueFalseGameSession(List<Question> questionList) {
		this.questionList = questionList; 
	}

	public boolean answer(int answer) {
		return score(answer==questionList.get(index).getRightAnswer());
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

	public boolean score(boolean flag) {
		if(flag) {
			score+=prize;
			return flag;
		}
			score-=penalty;
			return flag;
	}

	public Question getNextQuestion() {
		index++;
		if(questionList.size()>index) {
			return questionList.get(index);
		}
		return null;
	}

}
