package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField widthTextBox;

    @FXML
    private TextField heightTextBox;

    @FXML
    private TextArea resultTextBox;

    @FXML
    private TextField messageTextBox;

    @FXML
    private Button createSignButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


    public void createSignObjectButtonPushed() {


        if (heightTextBox.getText() != null && widthTextBox.getText() != null && !messageTextBox.getText().isEmpty()) {

            resultTextBox.setText(widthTextBox.getText() + " Wide X " + heightTextBox.getText() + " high \nMessage: " + messageTextBox.getText());
        } else {
            resultTextBox.setText("Message: Fields cannot be empty");

        }


    }

}