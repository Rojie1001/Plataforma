package br.edu.rojie;

import javax.swing.JOptionPane;


import br.edu.rojie.Error;
import br.edu.rojie.Strings;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Login extends Application {

	private AnchorPane pane1;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button button;
	private static Stage stage;
	
	public static void main(String[] args){
		launch(args);
	}


	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane1 = new AnchorPane();
		pane1.setPrefSize(300, 200);
		TextField txLogin = new TextField();
		txLogin.setPromptText("Username");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite sua senha");
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");
		pane1.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);

		Scene scene = new Scene(pane1);
		stage.setScene(scene);
		stage.show();
		txLogin.setLayoutX((pane1.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane1.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(80);
		btEntrar.setLayoutX((pane1.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(110);
		btSair.setLayoutX((pane1.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(140);
		pane1.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, pink 0%, silver 500%);");
	}

	private void login(Stage stage, int password) {

		if (txLogin.getText().isEmpty()) {
			try {
				new Error(Strings.loginError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}	
	
		if (txLogin.getText().equals("admin")) {
			try {
				new Error(Strings.loginError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
	}
		if (!txSenha.getText().equals("admin")) {
			try {
				new Error(Strings.passwordError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
	
	try {
		new Main(txLogin.getText()).start(new Stage());
		stage.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

	}


}
