package sample.adminMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class AdminMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text nameField;

    @FXML
    private Text surnameField;

    @FXML
    private Text idField;

    @FXML
    private Text emailField;

    @FXML
    private Button addPatientButton;

    @FXML
    private Button deletePatientButton;

    @FXML
    private Button viewPatientButton;

    @FXML
    void initialize() {

    }
}
