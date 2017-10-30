package entities;

public interface QuestionFactory {
		public Question buildQuestion(String name, String[] tags, String desc, byte rightAnswer);
}
