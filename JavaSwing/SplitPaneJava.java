package JavaSwing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;

class MySplitFrame extends JFrame {
    JList jl;
    JLabel l;
    JSplitPane sp;

    public MySplitFrame() {
        super("Split Frame");
        String str[] = { "YELLOW", "GREEN", "BLUE", "PINK", "ORANGE", "BLACK" };

        jl = new JList(str);
        jl.setSelectedIndex(0);

        JScrollPane p1 = new JScrollPane(jl);

        l = new JLabel(" ");
        l.setBackground(Color.BLUE);
        l.setOpaque(true);

        JScrollPane p2 = new JScrollPane(l);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
        add(sp);
        sp.setDividerLocation(200);

        JTabbedPane jb= new JTabbedPane();


        jl.addListSelectionListener((ListSelectionEvent ea) -> {
            String s = (String) jl.getSelectedValue();
            switch (s) {
                case "GREEN":
                    l.setBackground(Color.GREEN);
                    break;
                case "YELLOW":
                    l.setBackground(Color.YELLOW);
                    break;
                case "BLUE":
                    l.setBackground(Color.BLUE);
                    break;
                case "PINK":
                    l.setBackground(Color.PINK);
                    break;
                case "ORANGE":
                    l.setBackground(Color.ORANGE);
                    break;
                case "BLACK":
                    l.setBackground(Color.BLACK);
                    break;

            }
        });

    }
}

public class SplitPaneJava {
    public static void main(String args[]) {
        MySplitFrame ms = new MySplitFrame();
        ms.setSize(800, 800);
        ms.setVisible(true);
    }
}
