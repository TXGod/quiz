package gui;

import java.util.StringTokenizer;

import controllers.QuestionController;
import entities.QuestionFactory;
import entities.QuestionFactoryImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditingPanel {
	StackPane root;
	Scene scene2;
	MainMenu mainMenu;
	Label descLabel;
	Label titleLabel;
	Label tagLabel;
	Label imgLabel;
	Label rightAnswerLabel;
	TextField desc;
	TextField title;
	TextField tag;
	TextField img;
	Button add, back;
	RadioButton rightAnswer;
	QuestionFactory questionFactory;
	QuestionController questionController;

	public EditingPanel(Scene scene2, MainMenu mainMenu, QuestionController questionController,
			QuestionFactoryImpl questionFactoryrImpl) {
		this.questionController = questionController;
		this.questionFactory = new QuestionFactoryImpl();
		this.mainMenu = mainMenu;
		this.root = (StackPane) scene2.getRoot();
		mainMenu.setScene(scene2);
		Edit();
		addListeners();
	}

	private void Edit() {
		add = new Button("Dodaj pytanie");
		add.setTranslateX(100);
		add.setTranslateY(100);
		root.getChildren().add(add);

		back = new Button("Wróæ");
		back.setTranslateX(10);
		back.setTranslateY(100);
		root.getChildren().add(back);

		desc = new TextField();
		desc.setMaxSize(300, 30);
		desc.setTranslateX(90);
		desc.setTranslateY(0);
		root.getChildren().add(desc);

		title = new TextField();
		title.setMaxSize(120, 30);
		title.setTranslateX(0);
		title.setTranslateY(-40);
		root.getChildren().add(title);

		tag = new TextField();
		tag.setMaxSize(120, 30);
		tag.setTranslateX(0);
		tag.setTranslateY(-80);
		root.getChildren().add(tag);

		img = new TextField();
		img.setMaxSize(120, 30);
		img.setTranslateX(0);
		img.setTranslateY(-120);
		root.getChildren().add(img);

		descLabel = new Label("Treœæ pytania:");
		descLabel.setTranslateX(-160);
		descLabel.setTranslateY(0);
		root.getChildren().add(descLabel);

		titleLabel = new Label("Tytu³ pytania:");
		titleLabel.setTranslateX(-160);
		titleLabel.setTranslateY(-40);
		root.getChildren().add(titleLabel);

		tagLabel = new Label("Tag pytania:");
		tagLabel.setTranslateX(-160);
		tagLabel.setTranslateY(-80);
		root.getChildren().add(tagLabel);

		imgLabel = new Label("Œcie¿ka do zdjêcia:");
		imgLabel.setTranslateX(-160);
		imgLabel.setTranslateY(-120);
		root.getChildren().add(imgLabel);

		rightAnswerLabel = new Label("Prawda: ");
		rightAnswerLabel.setTranslateX(-160);
		rightAnswerLabel.setTranslateY(-160);
		root.getChildren().add(rightAnswerLabel);

		rightAnswer = new RadioButton();
		rightAnswer.setTranslateX(-110);
		rightAnswer.setTranslateY(-160);
		root.getChildren().add(rightAnswer);
	}

	public void addListeners() {
		add.setOnAction(e -> {
			byte selected = 0;
			String[] tags;
			if (!tag.getText().equals("")) {
				StringTokenizer tempTokenizer = new StringTokenizer(tag.getText());
				tags = new String[tempTokenizer.countTokens()];
				int index = 0;
				while (tempTokenizer.hasMoreTokens()) {
					tags[index] = tempTokenizer.nextToken();
					index++;
				}
			} else {
				tags = null;
			}
			if (rightAnswer.isSelected()) {
				selected = 1;
			}
			questionController.addQuestion(
					questionFactory.getQuestion(title.getText(), tags, desc.getText(), selected, img.getText()));
		});

		back.setOnAction(e -> {
			mainMenu.backToMainScene();
			questionFactory = null;
			mainMenu = null;
		});
	}

}
