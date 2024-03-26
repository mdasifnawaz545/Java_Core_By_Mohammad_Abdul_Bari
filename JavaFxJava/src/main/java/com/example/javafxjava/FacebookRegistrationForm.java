package com.example.javafxjava;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FacebookRegistrationForm extends Application {

    public void start(Stage stage) throws Exception {
        stage.setTitle("Facebook Registration Form");
        HBox hb = new HBox();
        Label label1 = new Label("First Name");
        Label label2 = new Label("Last Name");
        Label label3 = new Label("Mobile Number");
        Label label4 = new Label("E-mail");
        Label label5 = new Label("Gender");
        Label label6 = new Label("Select Hobbies");
        RadioButton radiobutton1=new RadioButton("Male");
        RadioButton radiobutton2=new RadioButton("Female");
        ToggleGroup buttonGroup=new ToggleGroup();
        radiobutton1.setToggleGroup(buttonGroup);
        radiobutton2.setToggleGroup(buttonGroup);

        CheckBox c1=new CheckBox("Playing Cricket");
        CheckBox c2=new CheckBox("Cooking");
        CheckBox c3=new CheckBox("");

        TextField textField1=new TextField();
        textField1.setPrefColumnCount(20);
        TextField textField2=new TextField();
        textField2.setPrefColumnCount(20);

        TextField textField3=new TextField();
        textField3.setPrefColumnCount(20);

        TextField textField4=new TextField();
        textField4.setPrefColumnCount(20);

       

        Scene scn = new Scene(hb,450,600);
        stage.setScene(scn);
        stage.show();

    }

    public static void main(String args[]) {
        launch(args);
    }
}
