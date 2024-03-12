package Layouts;

import java.awt.*;

class GridL extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public GridL(){

        super("Grid Layout");
        GridLayout gd=new GridLayout(3,3);
        setLayout(gd);
        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("Button 5");
        b6=new Button("Button 6");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class Gridlayout {
    public  static void main(String args[]){
        GridL G=new GridL();
        G.setSize(500,500);
        G.setVisible(true);
    }
}
