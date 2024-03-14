import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Card extends Frame implements ItemListener {
    Button b1,b2,b3;
    TextField t1,t2,t3;
    CardLayout cl;
    Panel p1;
    Panel p2;
    Panel mp;
    Panel cp;
    Checkbox c1,c2;
    CheckboxGroup cbg;

    public Card(){

        super("Card Layout");
        cbg=new CheckboxGroup();
        c1=new Checkbox("First",true,cbg);
        c2=new Checkbox("Second",false,cbg);
        cp=new Panel();
        cp.add(c1);
        cp.add(c2);

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        p1=new Panel();
        p2=new Panel();

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        cl=new CardLayout();
        mp=new Panel();
        mp.setLayout(cl);
        mp.add("First",p1);
        mp.add("Second",p2);

        add(cp,BorderLayout.NORTH);
        add(mp,BorderLayout.CENTER);

        c1.addItemListener(this);
        c2.addItemListener(this);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
    public void itemStateChanged(ItemEvent e){
        if(c1.getState())
            cl.first(mp);
        else cl.last(mp);
    }
}

public class Cardlayout {
    public static void main(String args[]){
        Card c=new Card();
        c.setSize(500,500);
        c.setVisible(true);
    }
}
