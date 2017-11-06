package entities;

public interface QuestionFactory {
		public Question getQuestion(String name, String[] tags, String desc, byte rightAnswer, String imgPath);
}
