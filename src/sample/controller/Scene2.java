package sample.controller;

import com.jfoenix.controls.JFXDrawer;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene2 {
    private boolean isopen = false;
    @FXML
    public JFXDrawer draw;

    public void check(ActionEvent event){
        try{
            VBox vbox = FXMLLoader.load(getClass().getResource("/sample/view/Menuside.fxml"));
            draw.setSidePane(vbox);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (isopen == false){
            draw.open();
            isopen = true;
        }else{
            draw.close();
            isopen = false;
        }

    }
    @FXML
    public JFXDrawer drawinfo;
    public void info(ActionEvent event){
        try{
            VBox vbox = FXMLLoader.load(getClass().getResource("/sample/view/infoup.fxml"));
            drawinfo.setSidePane(vbox);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (isopen == false){
            drawinfo.open();
            isopen = true;
        }else{
            drawinfo.close();
            isopen = false;
        }
    }

    ObservableList<String> List = FXCollections.observableArrayList("Name", "Author");
    @FXML
    private ComboBox<String> choices;
    @FXML
    private void initialize(){
        choices.setItems(List);
        choices.setValue("Name");
    }
}
