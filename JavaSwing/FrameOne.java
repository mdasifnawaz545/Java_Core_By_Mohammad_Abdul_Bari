import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.text.NumberFormatter;

class MyTextField extends JFrame {

    JTextField jf;
    JTextArea ja;
    JLabel jl;
    JLabel l1, l2;
    JTextField tf1;
    JPasswordField jp1;
    JButton b1;
    JFormattedTextField jft;

    public MyTextField() {
        super("My TextField");
        setLayout(new FlowLayout());
        tf1 = new JTextField(20);
        jp1 = new JPasswordField(20);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        b1 = new JButton("Submit");
        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(jp1);
        add(b1);

    }

}

public class FrameOne {
    public static void main(String args[]) {
        MyTextField m = new MyTextField();
        m.setSize(250, 300);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
