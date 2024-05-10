package com.example.javafxjava;

import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {
    public MainFrame(){

        ImageIcon imageIcon=new ImageIcon(getClass().getClassLoader().getResource("Images/KIIT_Campus.jpg"));
        Image imageIcon1=imageIcon.getImage().getScaledInstance(1275,700,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(imageIcon1);
        JLabel image=new JLabel(imageIcon2);
        add(image);
    }
}
