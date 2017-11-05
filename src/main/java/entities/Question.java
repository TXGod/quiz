package entities;

public class Question {
	String title;
	String desc;
	String[] tags;
	String imgPath;
	
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	byte rightAnswer;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public byte getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(byte rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}
