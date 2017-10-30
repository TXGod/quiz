package entities;

public class QuestionFactoryImpl implements QuestionFactory {

	public Question buildQuestion(String title, String[] tags, String desc, byte rightAnswer) {
		Question question = new Question();
		question.setTitle(title);
		question.setTags(tags);
		question.setDesc(desc);
		question.setRightAnswer(rightAnswer);
		return question;
	}

}
