package entities;

public class QuestionFactoryImpl implements QuestionFactory {

	public Question getQuestion(String title, String[] tags, String desc, byte rightAnswer, String imgPath) {
		Question question = new Question();
		question.setTitle(title);
		question.setTags(tags);
		question.setDesc(desc);
		question.setRightAnswer(rightAnswer);
		question.setImgPath(imgPath);
		return question;
	}

}
