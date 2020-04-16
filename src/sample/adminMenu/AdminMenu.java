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
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert surnameField != null : "fx:id=\"surnameField\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert idField != null : "fx:id=\"idField\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert emailField != null : "fx:id=\"emailField\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert addPatientButton != null : "fx:id=\"addPatientButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert deletePatientButton != null : "fx:id=\"deletePatientButton\" was not injected: check your FXML file 'adminMenu.fxml'.";
        assert viewPatientButton != null : "fx:id=\"viewPatientButton\" was not injected: check your FXML file 'adminMenu.fxml'.";

    }
}
