package main;

import controllers.QuestionController;
import entities.Question;

public class Main {
	public static void main(String args[]) {
		QuestionController questionController = new QuestionController();
		questionController.addQuestion(new Question());
		questionController.addQuestion(new Question());
		questionController.addQuestion(new Question());
		
	}
}
