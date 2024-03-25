package com.example.javafxjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FaceBookForm extends Application {

    public void start(Stage stage) throws Exception {
        HBox hb = new HBox();
        Label l1=new Label("First Name");
        hb.getChildren().add(l1);
        



        Scene scn = new Scene(hb);
        stage.setScene(scn);
        stage.show();
        
    }

    public static void main(String args[]) {
        launch(args);
    }
}
