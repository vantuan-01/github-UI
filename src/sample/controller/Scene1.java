package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sample.Main;


import java.io.IOException;
import java.util.EventObject;

public class Scene1 {
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField userText;

    @FXML
    private PasswordField passText;

    @FXML
    private Button btn;

    @FXML
    private Label loginMess;
    public void Login(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/viewScene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



   /* @FXML
    private void valid() throws IOException {
         if(userText.getText().isEmpty() && passText.getText().isEmpty()) {
            loginMess.setText("Please enter username and password");
        }
        else{
            loginMess.setText("Invalid. Please try again.");
        }
    }
    @FXML
    public void Login(ActionEvent event) throws IOException {

        valid();
        if (userText.getText().toString().equals("admin") && passText.getText().toString().equals("123")) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/view/viewScene2.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    void enterPress(KeyEvent event) throws IOException {
        if(event.getCode() == KeyCode.ENTER){
            valid();
            if (userText.getText().toString().equals("admin") && passText.getText().toString().equals("123")) {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/sample/view/viewScene2.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}
