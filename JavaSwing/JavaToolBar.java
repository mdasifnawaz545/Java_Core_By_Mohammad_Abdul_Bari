package JavaSwing;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;

class MyToolBar extends JFrame {
    JMenu m;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JMenuBar mb;
    JMenuItem mi1, mi2;
    JToolBar tb;
    JScrollPane sp;

    public MyToolBar() {
        super("My ToolBar");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        m = new JMenu("File");
        mb = new JMenuBar();
        m.add(mi1);
        m.addSeparator();
        m.add(mi2);
        mb.add(m);
        setJMenuBar(mb);

 

        b1 = new JButton("Open");
        b2 = new JButton("Save");
        b3 = new JButton("Close");
        b4 = new JButton("Save as");
        b5 = new JButton("Text Color Changer");
        b6 = new JButton("Cut");
        b7 = new JButton("Paste");

        tb = new JToolBar();
        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        JTextArea ta = new JTextArea(30, 30);
        ta.setText("TextArea Component");
        sp=new JScrollPane(ta);
    
        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        b1.addActionListener((ActionEvent e1) -> {
            JFileChooser f = new JFileChooser();
            f.showOpenDialog(this);
            File file = f.getSelectedFile();
            try (FileInputStream fi = new FileInputStream(file)) {
                byte b[] = new byte[fi.available()];
                fi.read(b);
                String str = new String(b);
                ta.setText(str);
            } catch (Exception e) {
                System.out.println(e);
            }

        });
        b5.addActionListener((ActionEvent e2) -> {
            Color color = JColorChooser.showDialog(this, "Color Chooser", Color.BLUE);
            ta.setForeground(color);
        });

    }


}

public class JavaToolBar {
    public static void main(String args[]) {
        MyToolBar mt = new MyToolBar();
        mt.setSize(500, 500);
        mt.setVisible(true);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
