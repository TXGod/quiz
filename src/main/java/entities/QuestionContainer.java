package entities;

import java.util.List;

public class QuestionContainer {
		static List<Question> questionList;
		
		public static void addQuestion(Question question) {
			questionList.add(question);
		}
		
		public static void removeQuestion(Question question) {
			questionList.remove(question);
		}
		
		public static List<Question> getQuestionList() {
			return questionList;
		}
}