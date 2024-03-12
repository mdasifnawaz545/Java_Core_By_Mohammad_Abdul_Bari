package Layouts;

import java.awt.*;

class GdGP extends Frame{
    Button b1,b2,b3,b4,b5,b6;
public GdGP(){
    super("Grid Bag Layout");
    GridBagLayout gbd=new GridBagLayout();
    GridBagConstraints gbdc=new GridBagConstraints();
    setLayout(gbd);


    b1=new Button("Button 1");
    b2=new Button("Button 2");
    b3=new Button("Button 3");
    b4=new Button("Button 4");
    b5=new Button("Button 5");
    b6=new Button("Button 6");
    gbdc.gridx=1;
    gbdc.gridy=1;
    add(b1,gbdc);
    gbdc.gridx=3;
    gbdc.gridy=1;
    add(b2,gbdc);
    gbdc.gridx=2;
    gbdc.gridy=2;
    add(b3,gbdc);
    gbdc.gridx=3;
    gbdc.gridy=1;
    add(b4,gbdc);
    gbdc.gridx=1;
    gbdc.gridy=3;
    add(b5,gbdc);
    gbdc.gridx=3;
    gbdc.gridy=3;
    add(b6,gbdc);



}
}
public class Gridgap {
    public static void main(String args[]){
        GdGP d=new GdGP();
        d.setSize(500,500);
        d.setVisible(true);
    }
}
