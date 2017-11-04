package gui;

import controllers.GameController;
import controllers.QuestionController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class MainMenu extends Application {
	
	StackPane root;

	StackPane root;
	Scene mainScene;
	GameController gameController;
	QuestionController questionController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
<<<<<<< HEAD

		this.root = new StackPane();
		mainScene = new Scene(this.root, 300, 250);

		primaryStage.setTitle("Quiz");
		primaryStage.setScene(mainScene);
		primaryStage.show();
		initGui();
	}

	private void initGui() {

		Button newGame = new Button("Rozpocznij Grê");
		root.getChildren().add(newGame);

		Button editQuestions = new Button("Edycja pytañ");
		editQuestions.setTranslateX(0);
		editQuestions.setTranslateY(100);
		root.getChildren().add(editQuestions);
		initListeners(editQuestions, newGame);
	}

	private void initListeners(Button newGame, Button editQuestions) {
		questionController.getQuestions(10, (Question a) -> {});
		newGame.setOnAction(e -> {
			Scene scene = new Scene(new StackPane(), 300, 250);
			Game game = new Game(gameController.getGameSession(
					questionController.getQuestions(10, (Question q) -> {
						
					}));
			scene = null;
		});
		editQuestions.setOnAction(e -> {

		});
=======
		this.root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Quiz");
        primaryStage.setScene(scene);
        primaryStage.show();
>>>>>>> 1eb27a6abefd89cc68066a1c70c32a8650701bde
	}

}
