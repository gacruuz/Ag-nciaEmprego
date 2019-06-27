package Janelas;

import PacoteEmpregos.Motorista;
import PacoteEmpregos.Pedreiro;
import PacoteEmpregos.Segurança;
import PacoteEmpregos.Vendedor;
import PacoteEmpregos.Zelador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

public class Empregos extends Application {

	AnchorPane pane;
	Stage window;

	private ObservableList<String> list = FXCollections.observableArrayList();
	ListView<String> listView;

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub

		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		Button botaovermais = new Button();

		listView = new ListView<>();
		listView.getItems().addAll("Motorista", "Pedreiro", "Zelador", "Segurança", "Vendedor");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		botaovermais.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		botaovermais.setLayoutX(300);
		botaovermais.setLayoutY(270);
		botaovermais.setPrefWidth(150);
		botaovermais.setOnAction(e -> botaovermais(window));

		pane.getChildren().addAll(listView, botaovermais);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

	}

	private void botaovermais(Stage window) {

		String emprego = "";
		ObservableList<String> list;
		emprego = listView.getSelectionModel().getSelectedItem();

		
		
		if ( emprego.equals("Motorista")) {
			
			try {
				new Motorista().start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		if( emprego.equals("Pedreiro")) {
			
			try {
				new Pedreiro().start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		if( emprego.equals("Zelador")) {
			
			try {
				new Zelador().start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		if( emprego.equals("Segurança")) {
			
			try {
				new Segurança().start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		if( emprego.equals("Vendedor")) {
			
			try {
				new Vendedor().start(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
			
		
		
		
		
	}

}
