package main;

import controllers.QuestionController;
import entities.Question;
import gui.MainMenu;

public class Main {
	public static void main(String args[]) {
		QuestionController questionController = new QuestionController();
		/*QuestionFactory qFactory = new QuestionFactoryImpl();
		Question question = new Question();
		question.setTitle("allel");
		questionController.addQuestion(new Question());
		questionController.addQuestion(new Question());
		questionController.addQuestion(question);
		//questionController.removeQuestion(question);*/
		questionController.readQuestions();
		for(Question question : questionController.getQuestions(2, e -> {return true;})) {
			System.out.println(question.getTitle());
		}
		
		MainMenu mainMenu = new MainMenu();
		mainMenu.launch(MainMenu.class);
	}
}
