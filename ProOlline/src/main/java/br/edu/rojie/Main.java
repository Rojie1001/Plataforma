package br.edu.rojie;

import javafx.scene.control.Label;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class Main extends Application {

	public Main(String text) {
		// TODO Auto-generated constructor stub
	}
	@Override 
	  public void start(Stage stage) throws Exception {
		AnchorPane pane2 = new AnchorPane();
		pane2.setPrefSize(500, 400); 
		JComboBox combo = new JComboBox();
		Button btnMeusCursos = new Button("Meus Cursos");
		Button btnAllCursos = new Button("Todos os Cursos");
		Label label = new Label("Bons Estudos Jovem Padauã");
		
		pane2.getChildren().addAll( btnMeusCursos, btnAllCursos, label);
		pane2.getChildren().add(combo);
		 
		btnAllCursos.setOnAction(new EventHandler<ActionEvent>() {
			
		});
		Scene scene = new Scene(pane2);
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
