import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class EventTriggering extends Frame implements KeyListener {
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    public EventTriggering(){
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        setLayout(null);
        l1.setBounds(30,20,100,50);
        l2.setBounds(30,50,100,50);
        l3.setBounds(30,80,100,50);
        l4.setBounds(30,110,200,50);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key is Typed");
        l4.setText(new Date(e.getWhen())+"");
        l3.setText("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l2.setText("Key is Pressed");
        l3.setText("");
        l4.setText("");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        l3.setText("Key is Released");
        l1.setText("");
        l2.setText("");
        l4.setText("");

    }
}


public class KeyEventsTrigger {
    public  static void main(String args[]){
EventTriggering E=new EventTriggering();
E.setSize(500,500);
E.setVisible(true);
    }
}
