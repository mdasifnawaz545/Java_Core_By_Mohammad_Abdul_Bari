package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Layouts.Flowlayout;

class MyInternalFrame extends JInternalFrame {
    static int count = 0;
    static int x = 20;
    static int y = 20;
    JMenu m;
    JMenuItem mi1, mi2;
    JMenuBar mb;
    JTextArea ta;

    public MyInternalFrame() {

        super("Document " + (++count), true, true, true, true);
        ta = new JTextArea(10, 10);
        mi1 = new JMenuItem("Save");
        mi2 = new JMenuItem("Remove");
        m = new JMenu("File");
        m.add(mi1);
        m.add(mi2);
        mb = new JMenuBar();
        mb.add(m);
        setJMenuBar(mb);
        setLocation(x = +20, y += 20);
        setBounds(x, y, 300, 300);
        setVisible(true);
    }

}

class MyJFrame extends JFrame {
    JDesktopPane jp;
    JMenu jmn;
    JMenuItem jmit;
    JMenuBar mbr;
    JDesktopPane dks;

    public MyJFrame() {
        super("InterFrame Things");

        jmn = new JMenu("Document");
        jmit = new JMenuItem("Create New");
        jmn.add(jmit);
        mbr = new JMenuBar();
        mbr.add(jmn);
        setJMenuBar(mbr);
        MyInternalFrame my = new MyInternalFrame();
        my.setSize(300, 300);
        jp = new JDesktopPane();
        setContentPane(jp);
        jp.add(my);
        jmit.addActionListener((ActionEvent e) -> {
            MyInternalFrame m1 = new MyInternalFrame();
            jp.add(m1);

        });

    }
}

public class JavaInternalFrame {
    public static void main(String args[]) {
        MyJFrame mj = new MyJFrame();
        mj.setSize(800, 800);
        mj.setVisible(true);
        mj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
