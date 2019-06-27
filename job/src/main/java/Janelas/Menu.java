package Janelas;

import ifsc.job.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Menu extends Application{
	
	AnchorPane pane;
	Stage window;

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		
		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		Button botaovoltar = new Button("Voltar");
		botaovoltar.setLayoutX(10);
		botaovoltar.setLayoutY(8);
		botaovoltar.setOnAction(e -> botaovoltaracao(window));
		
		
		Button buttonsearchjob = new Button("Vagas de Emprego");
		buttonsearchjob.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		buttonsearchjob.setLayoutX(60);
		buttonsearchjob.setLayoutY(100);
		buttonsearchjob.setPrefWidth(150);
		buttonsearchjob.setOnAction(e -> botaobuscarempregoacao(window));
		
		Button buttonaddjob = new Button("Editar Vaga");
		buttonaddjob.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		buttonaddjob.setLayoutX(60);
		buttonaddjob.setLayoutY(140);
		buttonaddjob.setPrefWidth(150);
		buttonaddjob.setOnAction(e -> botaoeditarvaga(window));
		
		
		
		pane.getChildren().addAll(buttonaddjob, buttonsearchjob, botaovoltar);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
		
	}
	
	private void botaobuscarempregoacao(Stage window) {
		
		try {
			new Empregos().start(window);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void botaoeditarvaga(Stage window) {
		
		try {
			new Editar().start(window);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void botaovoltaracao(Stage stage) {
		
		try {
			new Main().start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
