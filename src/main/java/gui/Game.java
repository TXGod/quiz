package gui;

import entities.GameSession;
import entities.Question;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Game {
	GameSession gameSession;
	StackPane root;
	Scene scene;
	Question activeQuestion;
	MainMenu mainMenu;
	Image img;
	ImageView imgView;
	Label title;
	Label desc;
	Label score;

	public Game(GameSession gameSession, MainMenu mainMenu) {
		this.mainMenu = mainMenu;
		this.gameSession = gameSession;
		scene = new Scene(new StackPane(), 550, 660);
		root = (StackPane) scene.getRoot();
		mainMenu.setScene(scene);
		initGame();
		gameSession.setPenalty(2);
		gameSession.setPrize(5);
		update();
	}

	private void initGame() {

		Button right = new Button("Prawda");
		right.setTranslateX(-200);
		right.setTranslateY(200);
		root.getChildren().add(right);
		right.setOnAction(e -> {
			gameSession.answer(1);
			update();
		});

		Button falseBtn = new Button("Fa³sz");
		falseBtn.setTranslateX(200);
		falseBtn.setTranslateY(200);
		root.getChildren().add(falseBtn);
		falseBtn.setOnAction(e -> {
			gameSession.answer(2);
			update();
		});

		title = new Label();
		title.setTranslateX(0);
		title.setTranslateY(-300);
		root.getChildren().add(title);

		desc = new Label();
		desc.setTranslateX(0);
		desc.setTranslateY(-270);
		root.getChildren().add(desc);

		score = new Label("Wynik: " + gameSession.getScore());
		score.setTranslateX(-250);
		score.setTranslateY(300);
		root.getChildren().add(score);
	}

	private void update() {
		if ((activeQuestion = gameSession.getNextQuestion()) != null) {
			if (activeQuestion.getTitle()!=null) {
				System.out.println(activeQuestion.getTitle());
				title.setText(activeQuestion.getTitle());
			} else {
				title.setText("");
			}
			if (activeQuestion.getDesc()!=null) {
				desc.setText(activeQuestion.getDesc());
			} else {
				desc.setText("");
			}
			if (activeQuestion.getImgPath()!=null) {
				root.getChildren().remove(imgView);
				img = new Image("file:" + activeQuestion.getImgPath());
				imgView = new ImageView(img);
				root.getChildren().add(imgView);
			} else {
				root.getChildren().remove(imgView);
			}
			score.setText("Wynik: " + gameSession.getScore());
		} else {
			mainMenu.backToMainScene(gameSession.getScore());
			gameSession = null;
			scene = null;
		}
	}
}
