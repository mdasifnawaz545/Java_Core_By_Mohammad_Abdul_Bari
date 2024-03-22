package com.example.javafxjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FifthJFX extends Application {

    TextArea ta;
    Slider sl;

    public void start(Stage stage) throws Exception {
        ta = new TextArea();
//        ta.setPrefColumnCount(30);
//        ta.setPrefRowCount(30);
        sl = new Slider(0, 100, 30);
        sl.setBlockIncrement(10);
        sl.setMajorTickUnit(10);
        sl.setMinorTickCount(1);
        sl.setShowTickLabels(true);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener((e)->{ta.setFont(Font.font(sl.getValue()));});

        VBox vb = new VBox();
        vb.getChildren().addAll(ta, sl);
        Scene scn=new Scene(vb,500,500);
        stage.setScene(scn);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
