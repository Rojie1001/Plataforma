package Telas;

import Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CursosFechados extends Application{
	private Button btnVoltar = new Button("Voltar"); 
	
	public void Voltar(Stage stage) {
	
	try {
		new AllCursos().start(new Stage());
		stage.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	@Override
	public void start(Stage stage) throws Exception {
		
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500,500);
		Label label = new Label("Bem Vindo:");
		label.setFont(new Font("Arial Black", 50));
		Label label1 = new Label(" Informaremos Você ao iniciar as atividade do Curso");
		label1.setFont(new Font("Arial Black",30));
		pane.getChildren().addAll(label, btnVoltar, label1);
		
		Scene scene = new Scene(pane);
		stage.setTitle("Novos Cursos");
		stage.setScene(scene);
		stage.show();
		
		label.setLayoutX((pane.getWidth() - label.getWidth()) / 2);
		label.setLayoutY(150);
		label1.setLayoutX((pane.getWidth() - label1.getWidth()) / 2);
		label1.setLayoutY(300);
		
		btnVoltar.setLayoutX((pane.getWidth() - btnVoltar.getWidth()) / 10);
		btnVoltar.setLayoutY(1);
		
		btnVoltar.setOnAction(e -> {
			Voltar(stage);
		});
		
	}

}
