package com.example.javafxjava;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.util.EventListener;

public class ThirdJFx extends Application{
    static int count=0;
    Label l;
    public void start(Stage stage) throws Exception {
        stage.setTitle("Counter");
        FlowPane fp=new FlowPane();
        Scene scn=new Scene(fp);
        l= new Label("  "+count);
        Button b=new Button("Count++");
//        b.setOnAction((e)->{count++;l.setText("  "+count);});
        fp.getChildren().add(l);
        b.setOnAction(new EventHandler <ActionEvent>(){public void handle(ActionEvent e){count++;l.setText("  " +count);}});
        fp.getChildren().add(b);
        stage.setScene(scn);
        stage.show();
    }



    public static void main(String args[]){
        launch(args);
    }

//    @Override
//    public void handle(ActionEvent actionEvent) {
//        count++;
//        l.setText("  "+count);
//
//    }
}
