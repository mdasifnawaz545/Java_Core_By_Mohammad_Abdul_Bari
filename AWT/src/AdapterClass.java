import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Do it using Ananyomous Class.
class HandleWindowEvent extends WindowAdapter {

   public void windowClosing(WindowEvent m) {
       System.exit(0);
   }
}


class Wind extends Frame{

    public Wind(){
        super("Adapter Class");

        addWindowListener(new HandleWindowEvent());

    }
}

public class AdapterClass {
    public  static void main(String args[]){


Wind w=new Wind();
    w.setSize(500,500);
    w.setVisible(true);


}}
