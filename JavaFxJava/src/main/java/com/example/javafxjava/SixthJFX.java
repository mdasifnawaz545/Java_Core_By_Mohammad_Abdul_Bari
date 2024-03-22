package com.example.javafxjava;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class SixthJFX extends Application {
    DatePicker dt;
    Text t1,t2,t3;
    ColorPicker cp;
    FileChooser fc;
    TextArea ta;

    Button b;


    public void start(Stage stage) throws Exception{
        dt=new DatePicker();
        cp=new ColorPicker();
        fc=new FileChooser();
        ta=new TextArea();
        t1=new Text("21-03-2024");
        t2=new Text("Color Picker");
        t3=new Text("File Chooser");
        b=new Button("File");
        VBox vb1=new VBox();
        VBox vb=new VBox();
        vb1.setAlignment(Pos.CENTER);
        vb1.getChildren().addAll(t1,dt,t2,cp,t3,b);
        vb.getChildren().addAll(ta,vb1);
        b.setOnAction((e)->{
            fc=new FileChooser();
            File f=fc.showOpenDialog(stage);
            try(Scanner scn=new Scanner(new FileInputStream(f))){
                String str="";
                while(scn.hasNext()){
                    str+=scn.nextLine()+"\n";
                    ta.setText(str);
                }
            }catch (FileNotFoundException fe){
                System.out.println("Encountered an error while Opening the File");
            }
        });

        dt.setOnAction((d)->{
            ta.setText("Date : "+dt.getValue()+"\n"+ta.getText());
            t1.setText(dt.getValue()+"");
        });
        cp.setOnAction((c)->{
            ta.setStyle("-fx-text-fill:#"+(cp.getValue()+"").substring(2));
            t2.setText((cp.getValue()+"").substring(2));
        });

        Scene scn=new Scene(vb,500,500);
        stage.setScene(scn);
        stage.show();

    }

    public static  void main(String args[]){
        launch(args);
    }
}
