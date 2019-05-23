package br.edu.rojie;

import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public void Main(String text) {
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	  public void start(Stage stage) throws Exception {
//		ArrayList<String>Combobox = new ArrayList();
//		Combobox.add("Meus Cursos");
//		Combobox.add("Cursos em andamento")
		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(500, 400); 
		//JComboBox combo = new JComboBox();
		Button btnMeusCursos = new Button("Meus Cursos");
		Button btnAllCursos = new Button("Todos os Cursos");
		Label label = new Label("Bons Estudos Jovem Padauã");
		pane2.getChildren().addAll(btnMeusCursos,btnAllCursos, label);
		Scene scene = new Scene(pane2);
		stage.setScene(scene);
		stage.show();
		
		btnMeusCursos.setLayoutX((pane2.getWidth() - btnMeusCursos.getWidth()) / 10);
		btnMeusCursos.setLayoutY(50);
		btnAllCursos.setLayoutX((pane2.getWidth() - btnAllCursos.getWidth()) / 10);
		btnAllCursos.setLayoutY(100);
		label.setLayoutX((pane2.getWidth() - label.getWidth()) / 2);
		label.setLayoutY(20);
		pane2.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, grey 0%, silver 500%);");
	
	
		btnAllCursos.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		


	}



}
