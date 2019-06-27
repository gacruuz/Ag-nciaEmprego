package PacoteEmpregos;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Motorista extends Application{
	AnchorPane pane;
	Stage window;
	
	
	

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		Text motorista = new Text("Vaga Motorista de Caminhao");
		motorista.setFont(Font.font("Bebas", FontWeight.BOLD, 15));
		motorista.setLayoutX(140);
		motorista.setLayoutY(100);
		
		Text empresa = new Text("Empresa: ");
		empresa.setFont(Font.font("Bebas", FontWeight.BOLD, 15));
		empresa.setLayoutX(100);
		empresa.setLayoutY(140);
		
		Text empresanome = new Text("Mili");
		empresanome.setFont(Font.font("Bebas", FontWeight.BOLD, 15));
		empresanome.setLayoutX(180);
		empresanome.setLayoutY(140);
		
		
		
		Button editar = new Button("Editar");
		editar.setLayoutX(250);
		editar.setLayoutY(200);
		
		
		
		
		
		pane.getChildren().addAll(motorista, empresa, empresanome, editar );
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
		
	}

}
