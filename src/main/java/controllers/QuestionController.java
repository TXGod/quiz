package controllers;

import java.util.List;
import java.util.function.Predicate;

import entities.Question;
import repositories.QuestionRepository;

public class QuestionController {
	QuestionRepository questionRepository;

	public QuestionController() {
		questionRepository = new QuestionRepository();
	}

	public void readQuestions() {
		questionRepository.readQuestions();
	}

	public void addQuestion(Question question) {
		questionRepository.addQuestion(question);
	}
	
	public void removeQuestion(Question question) {
		questionRepository.removeQuestion(question);
	}
	
	public List<Question> getQuestions(int number, Predicate<Question> predicate) {
		return questionRepository.getQuestions(number, predicate);
	}

}
