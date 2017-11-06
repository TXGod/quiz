package gui;

import controllers.QuestionController;
import entities.QuestionFactory;
import entities.QuestionFactoryImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	Label desc;
	Label title;
	Label img;
	TextField desc2;
	TextField title2;
	TextField tag;
	QuestionFactory questionFactory;
	QuestionController questionController;
	
	public EditingPanel(Scene scene2,MainMenu mainMenu, QuestionController questionController,  QuestionFactoryImpl questionFactoryrImpl) {
		this.questionController = questionController;
		this.questionFactory = new QuestionFactoryImpl();
		this.mainMenu = mainMenu;
		this.root = (StackPane) scene2.getRoot();
		mainMenu.setScene(scene2);
		Edit();
		
		
	}
	

	private void Edit() {
		Button dodaj = new Button("Dodaj pytanie");
		dodaj.setTranslateX(100);
		dodaj.setTranslateY(100);
		root.getChildren().add(dodaj);
		
		desc2 = new TextField();
		desc2.setMaxSize(300, 30);
		desc2.setTranslateX(90);
		desc2.setTranslateY(0);
		root.getChildren().add(desc2);
		
		title2 = new TextField();
		title2.setMaxSize(120, 30);
		title2.setTranslateX(0);
		title2.setTranslateY(-40);
		root.getChildren().add(title2);
		
		tag = new TextField();
		tag.setMaxSize(120, 30);
		tag.setTranslateX(0);
		tag.setTranslateY(-80);
		root.getChildren().add(tag);
		
		desc = new Label("Treœæ pytania:");
		desc.setTranslateX(-160);
		desc.setTranslateY(0);
		root.getChildren().add(desc);
		
		title = new Label("Tytu³ pytania:");
		title.setTranslateX(-160);
		title.setTranslateY(-40);
		root.getChildren().add(title);
		
		img = new Label("Tag pytania:");
		img.setTranslateX(-160);
		img.setTranslateY(-80);
		root.getChildren().add(img);
		
		
		
		
		
		
	}
	
	
	
}
