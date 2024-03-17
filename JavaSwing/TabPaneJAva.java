package JavaSwing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

class MyTabPane extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    JTabbedPane tb;
    JPanel p1, p2;

    public MyTabPane() {
        super("Rewier");
        setLayout(new FlowLayout());

        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l4 = new JLabel("Re-enter Password");
        l1 = new JLabel("Forgot Password ?");

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);

        b1 = new JButton("Login");
        b2 = new JButton("Sign up");

        p1 = new JPanel();
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(b1);

        p2 = new JPanel();
        p1.setLayout(new GridLayout(5, 1));
        p2.setLayout(new GridLayout(5, 1));
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p2.add(l4);
        p2.add(b2);

        tb = new JTabbedPane();
        tb.addTab("Sign Up", p1);
        tb.addTab("Login", p2);

        add(tb);

    }

}

public class TabPaneJAva {

    public static void main(String args[]) {
        MyTabPane mtb = new MyTabPane();
        mtb.setSize(500, 500);
        mtb.setVisible(true);
    }
}
