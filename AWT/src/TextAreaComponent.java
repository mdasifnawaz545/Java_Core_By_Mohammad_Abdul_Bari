import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class TextAreaField extends Frame implements TextListener, ActionListener {
    Label l1;
    TextArea ta;
    Label l2;
    TextField tf;
    Button b;
    public TextAreaField(){
        super("Text-Area");
        setLayout(new FlowLayout());
        l1=new Label("Enter Your Text Inside the Text-area given below...");
        ta=new TextArea(20,30);
        l2=new Label("");
        tf=new TextField(30);
        b=new Button("Click");
        add(l1);
        add(ta);
        add(tf);
        add(l2);
        add(b);
        ta.addTextListener(this);
        tf.addTextListener(this);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ea) {
        ta.insert(tf.getText(),ta.getCaretPosition());
        l2.setText(ta.getSelectedText());
    }

    @Override
    public void textValueChanged(TextEvent e) {

//        l2.setText(ta.getSelectedText());
    }
}

public class TextAreaComponent {
    public static void main(String args[]){
    TextAreaField T=new TextAreaField();
    T.setSize(300,400);
    T.setVisible(true);
    }
}
