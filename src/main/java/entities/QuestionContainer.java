package entities;

import java.util.ArrayList;
import java.util.List;

public class QuestionContainer {
		static List<Question> questionList = new ArrayList<Question>();
		
		public static void addQuestion(Question question) {
			questionList.add(question);
		}
		
		public static void removeQuestion(Question question) {
			questionList.remove(question);
		}
		
		public static List<Question> getQuestionList() {
			return questionList;
		}
		
		public static void empty() {
			questionList = new ArrayList<Question>();
		}
}
