package session;

import java.util.ArrayList;

import entities.Question;

public class TrueFalseGameSession implements GameSession {
	ArrayList<Question> questionList = new ArrayList<Question>(); 
	Question nextQuestion;
	int index=0;

	public boolean answer(int answer) {
		// TODO Auto-generated method stub
		return false;
	}

	public void initSession() {
		// TODO Auto-generated method stub
		
	}

	public void score(boolean flag) {
		// TODO Auto-generated method stub
	}

	public Question getNextQuestion() {
		// TODO Auto-generated method stub
		return activeQuestion;
	}

}
