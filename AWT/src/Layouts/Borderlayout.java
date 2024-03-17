package Layouts;

import javax.swing.*;
import java.awt.*;

class BLayout extends Frame {
    Label l=new Label("Border Layout");
    Button b1,b2,b3,b4,b5,b6;
    public BLayout(){
        super("Flow Layout");



        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("Button 5");
        b6=new Button("Button 6");

        add(b1,BorderLayout.NORTH);
//        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

        Panel p=new Panel();
        p.add(new Button("Panel 1"));
        p.add(new Button("Panel 2"));
        p.add(new Button("Panel 3"));

        add(p,BorderLayout.EAST);
        p.setLayout(new GridLayout(2,1));

}
}

public class Borderlayout {
    public static final Object CENTER = null;
    public static Object SOUTH;

    public  static void main(String args[]){
        BLayout L=new BLayout();
        L.setSize(500,500);
        L.setVisible(true);
    }
}
