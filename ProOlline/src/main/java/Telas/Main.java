package Telas;

import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	Button btnMeusCursos = new Button("Meus Cursos");
	Button btnAllCursos = new Button("Todos os Cursos");

	public void Cursos(Stage stage) {
		
			try {
				new MeusCursos().start(new Stage());
				stage.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public void AllCursos(Stage stage)	{
			try {
				new AllCursos().start(new Stage());
				stage.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(300, 200);
	
		Label label = new Label("Bons Estudos Jovem Padauã");
		label.setFont(new Font("Station", 20));
		pane2.getChildren().addAll(btnMeusCursos, btnAllCursos, label);
		
		Scene scene = new Scene(pane2);
		stage.setTitle("Tela Inicial");
		stage.setScene(scene);
		stage.show();

		btnMeusCursos.setLayoutX((pane2.getWidth() - btnMeusCursos.getWidth()) / 10);
		btnMeusCursos.setLayoutY(50);
		btnAllCursos.setLayoutX((pane2.getWidth() - btnAllCursos.getWidth()) / 10);
		btnAllCursos.setLayoutY(100);
		label.setLayoutX((pane2.getWidth() - label.getWidth()) / 2);
		label.setLayoutY(20);
		
		//CSS
		pane2.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, grey 0%, silver 500%);");

		
		//Ação dos Botões
		btnMeusCursos.setOnAction(e -> {
			Cursos(stage);

		});
		btnAllCursos.setOnAction(e -> {
			AllCursos (stage);
		});

	}

}
