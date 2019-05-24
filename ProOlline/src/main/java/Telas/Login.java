package Telas;

import com.jfoenix.controls.JFXButton;

import Entidades.Strings;
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

	private TextField txLogin = new TextField();
	private PasswordField txSenha = new PasswordField(); 

	public static void main(String[] args) {
		launch(args);
	}

	private boolean login(Stage stage) {

		if (txLogin.getText().isEmpty()) {
			try {
				new Error(Strings.loginError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		if (!txLogin.getText().equals("admin")) {
			try {
				new Error(Strings.loginError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		if (!txSenha.getText().equals("admin")) {
			try {
				new Error(Strings.passwordError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		try {
			new Main().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		
		AnchorPane pane1 = new AnchorPane();
		pane1.setPrefSize(300, 200);
		txLogin.setPromptText("Username");
		txSenha.setPromptText("Digite sua senha");
		JFXButton btEntrar = new JFXButton("Entrar");
		JFXButton btSair = new JFXButton("Sair");
		
		pane1.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);

		Scene scene = new Scene(pane1);
		stage.setTitle("Login");
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
		
		//CSS
		pane1.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, pink 0%, silver 500%);");
		btEntrar.setStyle( "colored-toggle.css * Place in same directory as ColoredToggle.java. * Have your build system copy this file to your build output directory. **/ .root { -fx-background-color: cornsilk; -fx-padding: 10; } .toggle-button { -fx-color: paleturquoise; } .toggle-button:selected { -fx-background-color: -fx-shadow-highlight-color, linear-gradient(to bottom, derive(-fx-color,-22%) 0%, derive(-fx-color,-15%) 100%), linear-gradient(to bottom, derive(-fx-color,-15%) 0%, derive(-fx-color,-10%) 50%, derive(-fx-color,-8%) 98%, derive(-fx-color,-12%) 100%); } .toggle-button:selected:focused { -fx-background-color: -fx-focus-color, linear-gradient(to bottom, derive(-fx-color,-22%) 0%, derive(-fx-color,-15%) 100%), linear-gradient(to bottom, derive(-fx-color,-15%) 0%, derive(-fx-color,-10%) 50%, derive(-fx-color,-8%) 98%, derive(-fx-color,-12%) 100%);");
		btSair.setStyle( "colored-toggle.css * Place in same directory as ColoredToggle.java. * Have your build system copy this file to your build output directory. **/ .root { -fx-background-color: cornsilk; -fx-padding: 10; } .toggle-button { -fx-color: paleturquoise; } .toggle-button:selected { -fx-background-color: -fx-shadow-highlight-color, linear-gradient(to bottom, derive(-fx-color,-22%) 0%, derive(-fx-color,-15%) 100%), linear-gradient(to bottom, derive(-fx-color,-15%) 0%, derive(-fx-color,-10%) 50%, derive(-fx-color,-8%) 98%, derive(-fx-color,-12%) 100%); } .toggle-button:selected:focused { -fx-background-color: -fx-focus-color, linear-gradient(to bottom, derive(-fx-color,-22%) 0%, derive(-fx-color,-15%) 100%), linear-gradient(to bottom, derive(-fx-color,-15%) 0%, derive(-fx-color,-10%) 50%, derive(-fx-color,-8%) 98%, derive(-fx-color,-12%) 100%);");
	
		
		// Ação dos Botoes	
	btEntrar.setOnAction(e -> {
			login(stage);
			
		});
		btSair.setOnAction(e ->{
			System.exit(0);

	});

}
}
