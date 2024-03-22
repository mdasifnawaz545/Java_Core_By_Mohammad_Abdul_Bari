package com.example.javafxjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class HelloApplication extends Application{

    private FlowPane fp;

    public void start(Stage stage) throws Exception{
            stage.setTitle("Form");
            FlowPane fp= new FlowPane();
            Scene scn=new Scene(fp);
            Button b=new Button("Submit");
            TextField tf=new TextField();
            Label l=new Label("Name");
            fp.getChildren().add(l);
            fp.getChildren().add(tf);
            fp.getChildren().add(b);
            stage.setScene(scn);
            stage.show();

    }

    public static void main(String args[]){
        launch(args);
    }
}