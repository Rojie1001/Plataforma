package br.edu.rojie;

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
	

	public void Main(String text) {
		// TODO Auto-generated constructor stub
	}
	public boolean Cursos(Stage stage) {
		if(btnMeusCursos.getOnAction() != null)
		try {
			new MeusCursos().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		if(btnAllCursos.getOnAction() != null)
//			try {
//				new AllCursos().start(new Stage());
//				stage.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		return true;
	}
	@Override 
	  public void start(Stage stage) throws Exception {
//		ArrayList<String>Combobox = new ArrayList();
//		Combobox.add("Meus Cursos");
//		Combobox.add("Cursos em andamento")
		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(300, 200); 
		//JComboBox combo = new JComboBox();
		Label label = new Label("Bons Estudos Jovem Padauã");
		label.setFont(new Font	("Station", 20));
		pane2.getChildren().addAll(btnMeusCursos,btnAllCursos, label);
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
		pane2.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, grey 0%, silver 500%);");
	
	
		btnMeusCursos.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if(Cursos(stage)) {
					
				}
				
			}
			
		});
		


	}



}
