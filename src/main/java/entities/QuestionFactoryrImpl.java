package entities;

public class QuestionFactoryrImpl implements QuestionFactory {

	public Question getQuestion(String title, String[] tags, String desc, byte rightAnswer) {
		Question question = new Question();
		question.setTitle(title);
		question.setTags(tags);
		question.setDesc(desc);
		question.setRightAnswer(rightAnswer);
		return question;
	}

}
