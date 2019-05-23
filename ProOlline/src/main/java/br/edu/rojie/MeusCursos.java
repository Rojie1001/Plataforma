package br.edu.rojie;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MeusCursos extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void Main(Stage stage) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane3 = new AnchorPane();
		pane3.setPrefSize(500, 450);
		AnchorPane pane4 = new AnchorPane();
		pane4.setPrefSize(150,100);
			Label label1 = new Label("Mobile");
			label1.setFont(new Font	("Station", 20));
			Button button1 = new Button("Retomar Atividades");
			pane4.getChildren().addAll(label1, button1);
		AnchorPane pane5 = new AnchorPane();
		pane5.setPrefSize(150,100);
			Label label2 = new Label("Front-End");
			label2.setFont(new Font	("Station", 20));
			Button button2 = new Button("Retomar Atividades");
			pane5.getChildren().addAll(label2, button2);
		AnchorPane pane6 = new AnchorPane();
		pane6.setPrefSize(150,100);
			Label label3 = new Label("Introdução á Java");
			label3.setFont(new Font	("Station", 20));
			Button button3 = new Button("Retomar Atividades");
			pane6.getChildren().addAll(label3, button3);
		pane3.getChildren().addAll(pane4, pane5, pane6);
		
		Scene scene = new Scene(pane3);
		stage.setTitle("Seus Cursos");
		stage.setScene(scene);
		stage.show();
		pane4.setLayoutX((pane3.getWidth() - pane4.getWidth()) / 10);
		pane4.setLayoutY(10);
			button1.setLayoutX((pane4.getWidth() - button1.getWidth()) / 2);
			button1.setLayoutY(50);
			label1.setLayoutX((pane4.getWidth() - label1.getWidth()) / 2);
			label1.setLayoutY(10);
		pane5.setLayoutX((pane3.getWidth() - pane5.getWidth()) / 10);
		pane5.setLayoutY(150);
			button2.setLayoutX((pane5.getWidth() - button2.getWidth()) / 2);
			button2.setLayoutY(50);
			label2.setLayoutX((pane5.getWidth() - label2.getWidth()) / 2);
			label2.setLayoutY(10);
		pane6.setLayoutX((pane3.getWidth() - pane6.getWidth()) / 10);
		pane6.setLayoutY(290);
			button3.setLayoutX((pane6.getWidth() - button3.getWidth()) / 2);
			button3.setLayoutY(50);
			label3.setLayoutX((pane6.getWidth() - label3.getWidth()) / 2);
			label3.setLayoutY(10);
			pane3.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, pink 0%, silver 800%);");
			pane4.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, gray 0%, white  500%);");
			pane5.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, gray 0%, white  500%);");
			pane6.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, gray 0%, white 500%);");

		
		
	}


}
