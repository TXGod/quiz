package gui;

import java.util.function.Predicate;

import controllers.GameController;
import controllers.QuestionController;
import entities.GameSession;
import entities.Question;
import entities.TrueFalseGameSession;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MainMenu extends Application {

	Stage primaryStage;
	StackPane root;
	Scene mainScene;
	GameController gameController;
	QuestionController questionController;
	Label result;

	@Override
	public void start(Stage primaryStage) throws Exception {
		gameController = new GameController();
		questionController = new QuestionController();
		questionController.readQuestions();
		this.root = new StackPane();
		this.primaryStage = primaryStage;
		mainScene = new Scene(this.root, 300, 250);
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(mainScene);
		primaryStage.show();
		initGui();
	}

	private void initGui() {
		
		result = new Label("");
		result.setTranslateX(0);
		result.setTranslateY(-100);
		root.getChildren().add(result);

		Button newGame = new Button("Rozpocznij Grê");
		root.getChildren().add(newGame);

		Button editQuestions = new Button("Edycja pytañ");
		editQuestions.setTranslateX(0);
		editQuestions.setTranslateY(100);
		root.getChildren().add(editQuestions);
		
		initListeners(newGame, editQuestions);
	}

	private void initListeners(Button newGame, Button editQuestions) {
		newGame.setOnAction(e -> {
			Scene scene = new Scene(new StackPane(), 300, 250);
			primaryStage.setScene(scene);
			GameOptions gameOptions = new GameOptions(scene, this, gameController, questionController);
		});
		editQuestions.setOnAction(e -> {

		});
	}
	
	public void backToMainScene() {
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public void backToMainScene(long result) {
		this.result.setText("Ostatni Wynik: " + result);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public void setScene(Scene scene) {
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
