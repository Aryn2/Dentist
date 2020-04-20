package sample.registerMenu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.stage.Stage;
import sample.changeWindow;


public class ControllerReg implements changeWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button acceptButton ;

    @FXML
    private TextField login1;

    @FXML
    private PasswordField password;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private TextField telephone;

    @FXML
    private TextField passportId;

    @FXML
    private TextField adress;

    @FXML
    private TextField birthDate;

    @FXML
    private Button exitButton;

    @Override
    public void change(Button button) {
        button.getScene().getWindow().hide();
        FXMLLoader loader  = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/loginMenu/sample.fxml"));
        try {
            loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void initialize() {
        exitButton.setOnAction(event -> {
            change(exitButton);
        });
        acceptButton.setOnAction(event -> {
            change(acceptButton);
        });
    }

}

