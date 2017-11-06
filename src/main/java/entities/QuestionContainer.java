package entities;

import java.util.ArrayList;
import java.util.List;

public class QuestionContainer {
		List<Question> questionList = new ArrayList<Question>();
		
		public void addQuestion(Question question) {
			questionList.add(question);
		}
		
		public void removeQuestion(Question question) {
			questionList.remove(question);
		}
		
		public List<Question> getQuestionList() {
			return questionList;
		}
		
		public void empty() {
			questionList = new ArrayList<Question>();
		}
}
