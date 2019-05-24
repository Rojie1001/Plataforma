package Telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AllCursos extends Application {
private Button btnVoltar = new Button("Voltar");
	 
	
	public void Voltar(Stage stage) {
	
	try {
		new Main().start(new Stage());
		stage.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


		@Override
		public void start(Stage stage) throws Exception {
			AnchorPane pane3 = new AnchorPane();
			pane3.setPrefSize(700, 600);
			Label label = new Label("Escolha com Cuidado");
			label.setFont(new Font ("Arial Black", 50));
			
			
			AnchorPane pane4 = new AnchorPane();
			pane4.setPrefSize(150,100);
				Label label1 = new Label("HTML/CSS");
				label1.setFont(new Font	("Station", 20));
				Button button1 = new Button("Iniciar");
				pane4.getChildren().addAll(label1, button1);
				
				
			AnchorPane pane5 = new AnchorPane();
			pane5.setPrefSize(150,100);
				Label label2 = new Label("C/C++");
				label2.setFont(new Font	("Station", 20));
				Button button2 = new Button("Iniciar");
				pane5.getChildren().addAll(label2, button2);
				
				
			AnchorPane pane6 = new AnchorPane();
			pane6.setPrefSize(150,100);
				Label label3 = new Label("JavaScript");
				label3.setFont(new Font	("Station", 20));
				Button button3 = new Button("Iniciar");
				pane6.getChildren().addAll(label3, button3);
				
			AnchorPane pane7 = new AnchorPane();
			pane7.setPrefSize(150,100);
					Label label4 = new Label("Arduíno");
					label4.setFont(new Font	("Station", 20));
					Button button4 = new Button("Iniciar");
					pane7.getChildren().addAll(label4, button4);
			
			AnchorPane pane8 = new AnchorPane();
			pane8.setPrefSize(150,100);
					Label label5 = new Label("Testes");
					label4.setFont(new Font	("Station", 20));
					Button button5 = new Button("Iniciar");	
					pane8.getChildren().addAll(label5, button5);
		
			AnchorPane pane9 = new AnchorPane();
			pane9.setPrefSize(150,100);
					Label label6 = new Label("Python");
					label6.setFont(new Font	("Station", 20));
					Button button6 = new Button("Iniciar");
					pane9.getChildren().addAll(label6, button6);					
				
			pane3.getChildren().addAll(pane4, pane5, pane6, pane7, pane8, pane9	, label, btnVoltar);
			
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
				
			pane7.setLayoutX((pane3.getWidth() - pane7.getWidth()) / 2);
			pane7.setLayoutY(290);
				button4.setLayoutX((pane7.getWidth() - button4.getWidth()) / 2);
				button4.setLayoutY(50);
				label4.setLayoutX((pane7.getWidth() - label4.getWidth()) / 2);
				label4.setLayoutY(10);
					
			pane8.setLayoutX((pane3.getWidth() - pane8.getWidth()) / 2);
			pane8.setLayoutY(150);
				button5.setLayoutX((pane8.getWidth() - button5.getWidth()) / 2);
				button5.setLayoutY(50);
				label5.setLayoutX((pane8.getWidth() - label5.getWidth()) / 2);
				label5.setLayoutY(10);		
				
			pane9.setLayoutX((pane3.getWidth() - pane9.getWidth()) / 2);
			pane9.setLayoutY(10);
				button6.setLayoutX((pane9.getWidth() - button6.getWidth()) / 2);
				button6.setLayoutY(50);
				label6.setLayoutX((pane9.getWidth() - label6.getWidth()) / 2);
				label6.setLayoutY(10);
				
				label.setLayoutX((pane3.getWidth() - label.getWidth()) / 2);
				label.setLayoutY(500);
				
				btnVoltar.setLayoutX((pane3.getWidth() - btnVoltar.getWidth()) / 10);
				btnVoltar.setLayoutY(400);
				btnVoltar.setPrefSize(70,70);
			
		
		
		pane3.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, pink 0%, silver 800%);");
		pane4.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, white 0%, white  500%);");
		pane5.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, white 0%, white  500%);");
		pane6.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%,  white 0%, white 500%);");
		pane7.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, white 0%, white  500%);");
		pane8.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, white 0%, white  500%);");
		pane9.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%,  white 0%, white 500%);");
		label.setStyle("-fx Text-fill:red;");
		
		btnVoltar.setOnAction(e -> {
			Voltar(stage);
		});
}
}
