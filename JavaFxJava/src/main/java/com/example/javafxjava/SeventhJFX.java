package com.example.javafxjava;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Customer{
    private int cust_id;
    private String name;
    private String address;

    public Customer(int cust_id,String name,String address){
        this.cust_id=cust_id;
        this.name=name;
        this.address=address;
    }

    public int getCust_id() {
        return cust_id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}

public class SeventhJFX extends Application {
    Label l1,l2,l3;
    TextField tf1,tf2;
    ComboBox<Integer> cmb;
    Button b1,b2,b3;
    HBox h1,h2,h3,h4;
    VBox vb;
    static int count=0;
    public void start(Stage stage) throws Exception{
        HashMap<Integer,Customer> hsmp=new HashMap<>();
        l1=new Label("Customer ID");
        l2=new Label("Name");
        l3=new Label("City");
        b1=new Button("Create");
        b2=new Button("Save");
        b3=new Button("Search");
        tf1=new TextField();
        tf2=new TextField();
        cmb=new ComboBox<>();
        h1=new HBox();
        h2=new HBox();
        h3=new HBox();
        h4=new HBox();
        h1.getChildren().addAll(l1,cmb);
        h2.getChildren().addAll(l2,tf1);
        h3.getChildren().addAll(l3,tf2);
        h4.getChildren().addAll(b1,b2,b3);
        vb=new VBox();
        vb.getChildren().addAll(h1,h2,h3,h4);
        FlowPane fp=new FlowPane(vb);
        fp.setAlignment(Pos.CENTER);
        vb.setSpacing(10);
        h1.setSpacing(10);
        h2.setSpacing(10);
        h3.setSpacing(10);
        h4.setSpacing(10);

        b1.setOnAction((a)->{
            count++;
            cmb.getItems().add(count);
            hsmp.put(count,new Customer(count,tf1.getText(),tf2.getText()));
            cmb.setValue(count);
            tf1.setText("");
            tf2.setText("");
        });

        b2.setOnAction((s)->{
           Customer c = new Customer(cmb.getValue(),tf1.getText(),tf2.getText());
           hsmp.put(count,c);
           try(PrintStream fs=new PrintStream(new FileOutputStream("Customer.txt"))){
               for(Customer cmt:hsmp.values()){
                   fs.println(cmt.getCust_id());
                   fs.println(cmt.getName());
                   fs.println(cmt.getAddress());
               }

           }catch(Exception fe){
               System.out.println("File Not Found");
           }
        });

        try(Scanner sc=new Scanner(new FileInputStream("Customer.txt"))){
            int cu;
            String n;
            String add;
            while (sc.hasNext()){
                cu=sc.nextInt();
                n=sc.next();
                add= sc.next();
                hsmp.put(cu,new Customer(cu,n,add));
                if(cu>count)count=cu;
                cmb.getItems().add(cu);
            }
        }catch (Exception e){
            System.out.println("File is Getting some error or not found.");
        }

        cmb.valueProperty().addListener((i)->{
            int c=cmb.getValue();
            Customer cm=hsmp.get(c);
            tf1.setText(cm.getName());
            tf2.setText(cm.getAddress());
            cmb.setValue(c);
        });

        Scene scn=new Scene(fp,400,400);
        stage.setScene(scn);
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
