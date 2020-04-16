package sample.loginMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignIn;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button registrationButton;

    @FXML
    void initialize() {
        SignIn.setOnAction(event -> {
            SignIn.getScene().getWindow().hide();
            System.out.println("Hello ARYN");
        });
    }

}

