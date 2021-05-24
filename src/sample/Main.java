package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/sample/view/viewScene1.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//co luu y nay
/*
Cái này ấy lúc mà tạo file .fxml là nó sẽ tự điền cho m 1 cái controller
bây giờ mới gọi dc này
dm máy m nó bị vỡ hình
đéo thấy mẹ gì luôn
giờ trong cái getResource() m gõ cho t cái này
"/sample/view/viewNumber1.fxml"
cái khúc đó t ko thấy gì cả
ok chưa
ok
mọi thứ ok rồi
m có tạo 1 view mới thì làm như những gì t chỉ
t éo nhớ j cả :)
ok lại
đầu tiên
tạo 1 .fxml moi trong view, làm đi
* */
