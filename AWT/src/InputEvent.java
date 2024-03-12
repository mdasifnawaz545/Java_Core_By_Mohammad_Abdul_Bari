import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


class InputTextField extends Frame implements TextListener, ActionListener {
    Label l1;
    TextField t;
    Label l2;
    Label l3;


    Button b;
    public InputTextField(){
        super("Input Changer");
        setLayout(new FlowLayout());

        l1=new Label("Enter The Text ");
        t=new TextField(20);
        l2=new Label(" ");
        l3=new Label(" ");

        t.addTextListener(this);
        t.addActionListener(this);
        add(l1);
        add(t);
        add(l2);
        add(l3);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String str=t.getText();
        l2.setText(str);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String s=l2.getText();
        l3.setText(s);
    }
}


public class InputEvent {
    public static void main(String args[]){

InputTextField i=new InputTextField();
i.setSize(300,300);
i.setVisible(true);

    }
}
