package sample.registerMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerReg{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button acceptButton;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private TextField telephone;

    @FXML
    void initialize() {

    }
}

