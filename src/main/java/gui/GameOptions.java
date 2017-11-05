package gui;

import java.util.StringTokenizer;

import org.apache.commons.lang3.math.NumberUtils;

import controllers.GameController;
import controllers.QuestionController;
import entities.GameSessionFactory;
import entities.Question;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GameOptions {

	StackPane root;
	GameController gameController;
	QuestionController questionController;
	MainMenu mainMenu;
	TextField tags, questionsNumber;
	Label tagsLabel, questionsNumberLabel;
	Button start;

	public GameOptions(Scene scene, MainMenu mainMenu, GameController gameController,
			QuestionController questionController) {
		this.root = (StackPane) scene.getRoot();
		this.mainMenu = mainMenu;
		this.gameController = gameController;
		this.questionController = questionController;
		initOptions();
	}

	private void initOptions() {
		tags = new TextField();
		tags.setMaxSize(120, 30);
		tags.setTranslateX(0);
		tags.setTranslateY(0);
		root.getChildren().add(tags);

		tagsLabel = new Label("tagi:");
		tagsLabel.setMaxSize(30, 30);
		tagsLabel.setTranslateX(-80);
		root.getChildren().add(tagsLabel);

		questionsNumber = new TextField();
		questionsNumber.setMaxSize(120, 30);
		questionsNumber.setTranslateX(0);
		questionsNumber.setTranslateY(-40);
		root.getChildren().add(questionsNumber);

		questionsNumberLabel = new Label("liczba pytañ: ");
		questionsNumberLabel.setMaxSize(70, 30);
		questionsNumberLabel.setTranslateX(-100);
		questionsNumberLabel.setTranslateY(-40);
		root.getChildren().add(questionsNumberLabel);

		start = new Button("start");
		start.setTranslateX(-100);
		start.setTranslateY(100);
		start.setOnAction(e -> {
			if(!NumberUtils.isNumber(questionsNumber.getText())) {
				questionsNumberLabel.setText("Musisz podaæ liczbê");
				return;
			}
			Game game = new Game(gameController.getGameSession(
					questionController.getQuestions(Integer.parseInt(questionsNumber.getText()), question -> {
						if (tags.getText().equals(null) || tags.getText().equals("")) {
							return true;
						}
						if (question.getTags() != null) {
							StringTokenizer tokens = new StringTokenizer(tags.getText());
							while (tokens.hasMoreTokens()) {
								for (String tag : question.getTags()) {
									if (tag.equals(tokens.nextToken())) {
										return true;
									}
								}
							}
						}
						return false;
					})), mainMenu);
		});
		root.getChildren().add(start);
	}

}
