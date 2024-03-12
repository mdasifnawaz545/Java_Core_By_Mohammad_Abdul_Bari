import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CounterFrame extends Frame implements ActionListener {
    Label l;
    Button b;
    int count=0;
    public CounterFrame(){
        super("Counter");
        setLayout(new FlowLayout());
        l=new Label("    "+count);
        b=new Button("Click");
        add(l);
        add(b);
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       count++;
       l.setText("    "+count);
    }
}


public class Counter {
    public static void main(String args[]){
     CounterFrame c=new CounterFrame();
     c.setSize(400,400);
     c.setVisible(true);

    }
}
