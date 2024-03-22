package JavaSwing;

import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class DesignText extends JFrame{
    JTextField jf;
    JCheckBox c1;
    JCheckBox c2;
    JRadioButton r1;
    JRadioButton r2;
    ButtonGroup bg;

public DesignText(){
    super("Text Design");
    setLayout(new FlowLayout());
    jf=new JTextField(20);
    c1=new JCheckBox("Bold");
    c2=new JCheckBox("Italic");
    r1=new JRadioButton("lower");
    r2=new JRadioButton("UPPER");

bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
add(jf);
add(c1);
add(c2);
add(r1);
add(r2);



c1.addItemListener((ItemEvent e)->{
    
switch (e.paramString()) {
        case "lower":
            jf.setText(jf.getText().toLowerCase());
            break;
        case "UPPER":
            jf.setText(jf.getText().toUpperCase());
            break;
    
        default:
            break;
    }
    int b=0,i=0;
    if(c1.isSelected()) b=Font.BOLD;
    if(c2.isSelected()) i=Font.ITALIC;
    Font f=new Font("Times New Roman", b|i, 15);
    jf.setFont(f);

});
r2.addItemListener((ItemEvent e)->{
    
switch (e.paramString()) {
        case "lower":
            jf.setText(jf.getText().toLowerCase());
            break;
        case "UPPER":
            jf.setText(jf.getText().toUpperCase());
            break;
    
        default:
            break;
    }
    int b=0,i=0;
    if(c1.isSelected()) b=Font.BOLD;
    if(c2.isSelected()) i=Font.ITALIC;
    Font f=new Font("Times New Roman", b|i, 15);
    jf.setFont(f);

});
c2.addItemListener((ItemEvent e)->{
    
switch (e.paramString()) {
        case "lower":
            jf.setText(jf.getText().toLowerCase());
            break;
        case "UPPER":
            jf.setText(jf.getText().toUpperCase());
            break;
    
        default:
            break;
    }
    int b=0,i=0;
    if(c1.isSelected()) b=Font.BOLD;
    if(c2.isSelected()) i=Font.ITALIC;
    Font f=new Font("Times New Roman", b|i, 15);
    jf.setFont(f);

});
r1.addItemListener((ItemEvent e)->{
    
switch (e.paramString()) {
        case "lower":
            jf.setText(jf.getText().toLowerCase());
            break;
        case "UPPER":
            jf.setText(jf.getText().toUpperCase());
            break;
    
        default:
            break;
    }
    int b=0,i=0;
    if(c1.isSelected()) b=Font.BOLD;
    if(c2.isSelected()) i=Font.ITALIC;
    Font f=new Font("Times New Roman", b|i, 15);
    jf.setFont(f);

});

}

}

public class textDesign {
 public static void main(String args[])
 {
    DesignText dt=new DesignText();
    dt.setSize(400,400);
    dt.setVisible(true);
    dt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }   
}
