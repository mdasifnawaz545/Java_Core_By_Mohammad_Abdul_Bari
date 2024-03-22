package com.example.javafxjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.scene.paint.Color.*;

public class SecondJFX extends Application {
    public void start(Stage stage) throws Exception{
        stage.setTitle("Properties");
        FlowPane fp=new FlowPane();
        Scene scn=new Scene(fp,300,300);
        Button b=new Button("Click Here");
        b.setDefaultButton(false);
        Alert a=new Alert(Alert.AlertType.INFORMATION,"Button was Clicked");
        b.setOnAction(e->a.show());

        b.setFont(new Font("Roboto",10));
        Tooltip t=new Tooltip("Button is there");
        b.setTooltip(t);
        b.setStyle("-fx-background-color:Blue;-fx-font-color:White;");
        fp.getChildren().add(b);
        stage.setScene(scn);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
