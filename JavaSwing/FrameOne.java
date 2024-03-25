package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Layouts.Flowlayout;

import java.awt.*;

class FrameNumberOne extends JFrame {
    JLabel label1, label2;
    JTextField textField1;
    JPasswordField passwordField1;
    JButton button;

    public FrameNumberOne() {
        label1 = new JLabel("Username");
        label1 = new JLabel("Password");
        textField1 = new JTextField(20);
        passwordField1 = new JPasswordField(20);
        JButton b = new JButton("Submit");
        setLayout(new Flowlayout());
        add(label1);
        add(textField1);
        add(label2);
        add(passwordField1);
        add(button);

    }
}

public class FrameOne {
    public static void main(String args[]) {
        FrameNumberOne f = new FrameNumberOne();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
