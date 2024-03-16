
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame {
    JLabel l;
    JButton b;
    int count = 0;

    public MyJFrame() {
        super("JSwing");
        setLayout(new FlowLayout());
        l = new JLabel("Counter = " + count);
        b = new JButton();
        b.addActionListener((ActionEvent e) -> {
            count++;
            l.setText("Counter = " + count);

        });
        b.setIcon(new ImageIcon());
        getRootPane().setDefaultButton(b);// it means whenver we are pressing enter the button will ecounter and we can
                                          // also have multiple button selected as default so by pressing tab button we
                                          // can also encounter the same.
        l.setToolTipText("Counter");
    }

    public void actionPerformed(ActionEvent e) {

        MyJFrame f = new MyJFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
