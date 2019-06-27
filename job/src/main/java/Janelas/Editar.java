package Janelas;

import PacoteEmpregos.Motorista;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Editar extends Application {

	AnchorPane pane;
	Stage window;

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub

		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);

		Text texto1 = new Text("Editar Informações da Vaga");
		texto1.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		texto1.setLayoutX(140);
		texto1.setLayoutY(100);

		TextField editarnome = new TextField();
		editarnome.setLayoutX(180);
		editarnome.setLayoutY(100);
		
		Button botaoeditar = new Button();
		botaoeditar.setLayoutX(200);
		botaoeditar.setLayoutY(150);
		botaoeditar.setOnAction(e -> botaoeditaracao(editarnome));

		pane.getChildren().addAll(texto1, editarnome);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

	}

	public void botaoeditaracao(TextField editarnome) {
		
		
		

	}

}