package ifsc.job;

import Auxiliar.DB;
import Auxiliar.Strings;
import Auxiliar.User;
import Auxiliar.UserJSON;
import Auxiliar.UserXML;
import Exceptions.DBException;
import Exceptions.LoginException;
import Janelas.Admins;

import Janelas.Menu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.stage.Stage;

public class Main extends Application {

	AnchorPane pane;
	Stage window;

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub

		window.setResizable(false);
		pane = new AnchorPane();
		pane.setPrefSize(500, 400);

		TextField txtUser = new TextField();
		txtUser.setLayoutX(185);
		txtUser.setLayoutY(130);
		txtUser.setPrefWidth(120);

		TextField txtPass = new TextField();
		txtPass.setLayoutX(185);
		txtPass.setLayoutY(200);
		txtPass.setPrefWidth(120);

		Button button1 = new Button("LOGAR");
		button1.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		button1.setLayoutX(175);
		button1.setLayoutY(250);
		button1.setPrefWidth(60);
		button1.setOnAction(e -> botaologinacao(window, txtUser, txtPass));

		Button botaoadm = new Button("ADM");
		botaoadm.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		botaoadm.setLayoutX(400);
		botaoadm.setLayoutY(350);
		botaoadm.setPrefWidth(60);
		botaoadm.setOnAction(e -> botaoadmacao(window));

		Button button2 = new Button("SAIR");
		button2.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		button2.setLayoutX(255);
		button2.setLayoutY(250);
		button2.setPrefWidth(60);
		button2.setOnAction(e -> botaosairacao(window));

		pane.getChildren().addAll(button1, button2, txtPass, txtUser, botaoadm);
		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();
	}

	private void botaologinacao(Stage window, TextField txtUser, TextField txtPass) {

		try {
			login(txtUser.getText(), txtPass.getText(), window);
		} catch (LoginException ex) {
			System.out.println(ex.getMessage());
		} catch (DBException ex2) {

		}

	}

	private void changeDB(String selectedItem) {
		if (selectedItem.equals("JSON"))
			DB.users = new UserJSON();
		else if (selectedItem.equals("XML"))
			DB.users = new UserXML();
	}

	private void changeDB() {
		if (DB.users instanceof UserJSON)
			DB.users = new UserXML();
		else if (DB.users instanceof UserXML)
			DB.users = new UserJSON();
	}

	private void login(String username, String pass, Stage stage) throws LoginException, DBException {

		try {
			withCurrentDB(username, pass, stage);
		} catch (DBException exception) {
			changeDB();
			try {
				withCurrentDB(username, pass, stage);
			} catch (DBException newException) {
				throw new LoginException();
			}
		}
	}

	private void withCurrentDB(String username, String pass, Stage stage) throws DBException {
		User user = DB.users.getUser(username);
		try {
			if (!user.getPass().equals(pass)) {
				showLoginError();
				return;
			}
		} catch (NullPointerException ex) {
			throw new DBException();
		}
		try {
			new Menu().start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void showLoginError() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(Strings.loginError);
		alert.setHeaderText(Strings.loginError);
		alert.showAndWait();
	}

	private void botaosairacao(Stage window) {

		System.exit(0);

	}

	private void botaoadmacao(Stage window) {

		try {
			new Admins().AdminsStage(window);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
