package JavaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class MyBorder extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    public MyBorder(){
        super("Border");
        setLayout(new FlowLayout());
        t1=new JTextField(20);
        t2=new JTextField(20);
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Forgot password ?");
        b1=new JButton("Log In");
        b2=new JButton("Sign Up");
        JPanel p= new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(b1);
        p.add(b2);
        add(p);
        Border bdr=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE,2,true),"Login Page",TitledBorder.CENTER,TitledBorder.TOP);
        p.setBorder(bdr);
    }
}


public class BorderPane {
    public static void main(String args[]){
        MyBorder m= new MyBorder();
        m.setSize(200,500);
        m.setVisible(true);
    }
}
