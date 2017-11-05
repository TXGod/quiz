package main;

import java.util.StringTokenizer;

import controllers.QuestionController;
import entities.Question;
import gui.MainMenu;

public class Main {
	public static void main(String args[]) {
		QuestionController questionController = new QuestionController();

		// * QuestionFactory qFactory = new QuestionFactoryImpl();
		// Question question = new Question();
		// question.setTitle("lubo");
		// question.setTags(new String[] {"bbb"});
		// * questionController.addQuestion(new Question());
		// * questionController.addQuestion(new Question());
		// * questionController.addQuestion(question);
		// questionController.removeQuestion(question);
		// questionController.addQuestion(question);
		/*questionController.readQuestions();
		for (Question tempQuestion : questionController.getQuestions(3, e -> {
			if (e.getTags() != null) {
				StringTokenizer tokens = new StringTokenizer("aaa");
				while (tokens.hasMoreTokens()) {
					for (String tag : e.getTags()) {
						if (tag.equals(tokens.nextToken())) {
							return true;
						}
					}
				}
			}
			return false;
		})) {
			System.out.print(tempQuestion.getTitle() + " ");
			System.out.println(tempQuestion.getTags()[0]);

		}*/

		MainMenu mainMenu = new MainMenu();
		mainMenu.launch(MainMenu.class);
	}
}
