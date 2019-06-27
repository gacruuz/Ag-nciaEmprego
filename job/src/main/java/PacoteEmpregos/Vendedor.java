package PacoteEmpregos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Vendedor extends Application {

	AnchorPane pane;
	Stage window;
	

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
	
		Text pedreiro = new Text("VENDEDOR");
		pedreiro.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		pedreiro.setLayoutX(150);
		pedreiro.setLayoutY(100);
		
		
		pane.getChildren().addAll(pedreiro);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
		
	}

}