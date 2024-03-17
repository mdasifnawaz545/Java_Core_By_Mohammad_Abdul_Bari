package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

class MyProgressBarFrame extends JFrame implements ChangeListener{
    JSlider sl;
    int w=30;
    JProgressBar pg;
    JPanel p1,p2,p3;
    public MyProgressBarFrame(){
        sl=new JSlider(SwingConstants.HORIZONTAL,0,100,0);
        sl.setMajorTickSpacing(1);
        sl.setMinorTickSpacing(10);
        sl.setPaintTicks(true);
        // sl.setPaintLabels(true);
        p1=new JPanel();
        p1.add(sl);
        p2=new JPanel(){
            public void paintComponent(Graphics g){
                g.setFont(new Font("Roboto", 10, w));
                g.drawString("Salaam", 100,100);
            }
        };
        p3=new JPanel();
        pg=new JProgressBar(0, 100);
        pg.setValue(30);
        pg.setString("30%");
        pg.setStringPainted(true);
        p3.add(pg);

        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);

        sl.addChangeListener(this);


        
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        w=sl.getValue();
        pg.setString(w+"%");
        pg.setValue(w);
        repaint();
    }
}

public class ProgressBar {
    public static void main(String args[])
    {
        MyProgressBarFrame pg=new MyProgressBarFrame();
        pg.setSize(500,500);
        pg.setVisible(true);
    }
    
}
