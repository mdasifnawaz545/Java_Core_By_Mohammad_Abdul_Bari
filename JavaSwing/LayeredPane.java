package JavaSwing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JRadioButton;

class NewLayeredPane extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JRadioButton r1, r2, r3;
    JLayeredPane jl;

    public NewLayeredPane() {
        super("Layered Pane");
        // setLayout(new FlowLayout());
        r1 = new JRadioButton("Blue");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Pink");

        l1 = new JLabel("Blue");
        l1.setBounds(20, 20, 100, 100);
        l1.setBackground(Color.BLUE);
        l1.setOpaque(true);

        l2 = new JLabel("Yellow");
        l2.setBounds(70, 70, 100, 100);
        l2.setBackground(Color.YELLOW);
        l2.setOpaque(true);

        l3 = new JLabel("Pink");
        l3.setBounds(120, 120, 100, 100);
        l3.setBackground(Color.PINK);
        l3.setOpaque(true);

        l4 = new JLabel("Mouse");
        l4.setBounds(170, 170, 50, 50);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);

        ButtonGroup cbg = new ButtonGroup();
        cbg.add(r1);
        cbg.add(r2);
        cbg.add(r3);

        JPanel jp = new JPanel();
        jp.add(r1);
        jp.add(r2);
        jp.add(r3);

        jl = new JLayeredPane();
        jl.add(l1, new Integer(0));
        jl.add(l2, new Integer(1));
        jl.add(l3, new Integer(2));
        jl.add(l4, new Integer(3));

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        add(jp, BorderLayout.NORTH);
        add(jl, BorderLayout.CENTER);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                l4.setLocation(e.getX() - 40, e.getY() - 40);
            }
        });

    }

    public void actionPerformed(ActionEvent ea) {
        if (r1.isSelected())
            jl.setLayer(l4, 1);
        if (r2.isSelected())
            jl.setLayer(l4, 2);
        if (r3.isSelected())
            jl.setLayer(l4, 3);
    }
}

public class LayeredPane {
    public static void main(String args[]) {
        NewLayeredPane np = new NewLayeredPane();
        np.setSize(800, 800);
        np.setVisible(true);
    }
}
