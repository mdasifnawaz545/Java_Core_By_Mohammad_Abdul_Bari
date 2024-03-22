package com.example.javafxjava;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FourthJFX extends Application implements EventHandler <ActionEvent> {
    Text L;
    ChoiceBox<Integer> cmb;
    CheckBox c1,c2,c3;
    RadioButton r1,r2,r3;
public void start(Stage stage) throws Exception{
    stage.setTitle("Event handler");
    VBox vb=new VBox();
    Scene scn=new Scene(vb,500,500);
    HBox hb1=new HBox();
    HBox hb2=new HBox();
    HBox hb3=new HBox();
    HBox hb4=new HBox();
    hb1.setSpacing(15);
    hb1.setPadding(new Insets(10,10,10,20));
    hb2.setSpacing(15);
    hb2.setPadding(new Insets(10,10,10,20));
    hb3.setSpacing(15);
    hb3.setPadding(new Insets(10,10,10,20));
    hb4.setSpacing(15);
    hb1.setPadding(new Insets(10,10,10,20));
    vb.setPadding(new Insets(10,10,10,10));
    L=new Text("Salaam");
   c1=new CheckBox("Normal");
     c2=new CheckBox("Bold");
     c3=new CheckBox("Itallic");
     r1=new RadioButton("Blue");
     r2=new RadioButton("Green");
     r3=new RadioButton("Pink");
    ToggleGroup tg=new ToggleGroup();
    r1.setToggleGroup(tg);
    r2.setToggleGroup(tg);
    r3.setToggleGroup(tg);
    cmb=new ChoiceBox<Integer>();
    cmb.getItems().addAll(10,20,30,40,50);
    hb1.getChildren().add(L);
    hb2.getChildren().addAll(c1,c2,c3);
    hb3.getChildren().addAll(r1,r2,r3);
    hb4.getChildren().add(cmb);
    vb.getChildren().addAll(hb1,hb2,hb3,hb4);

    r1.setOnAction(this);
    r2.setOnAction(this);
    r3.setOnAction(this);
    c1.setOnAction(this);
    c2.setOnAction(this);
    c2.setOnAction(this);
    cmb.setOnAction(this);

    stage.setScene(scn);
    stage.show();



}

@Override
public void handle(ActionEvent e){
    FontWeight fw=FontWeight.NORMAL;
    FontPosture fp=FontPosture.REGULAR;
    if(r1.isSelected()) L.setFill(Paint.valueOf("BLUE"));
    if(r2.isSelected()) L.setFill(Paint.valueOf("GREEN"));
    if(r3.isSelected()) L.setFill(Paint.valueOf("PINK"));


    if(c2.isSelected()) fw=FontWeight.BOLD;
    if(c3.isSelected()) fp=FontPosture.ITALIC;
    L.setFont(Font.font("Roboto",fw,fp,cmb.getValue()));

}


public static void main(String args[]){
    launch(args);
}

}
