import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class ScrollBars extends Frame implements AdjustmentListener {
    TextField ta;
    Scrollbar s1,s2,s3;
    Label l;

    public ScrollBars(){
        super("Scroll Bar");
        ta=new TextField(50);
        s1=new Scrollbar(Scrollbar.HORIZONTAL,50,40,0,255);
        s2=new Scrollbar(Scrollbar.HORIZONTAL,50,40,0,255);
        s3=new Scrollbar(Scrollbar.HORIZONTAL,50,40,0,255);

        ta.setBounds(50,50,300,50);
        s1.setBounds(50,150,300,30);
        s2.setBounds(50,200,300,30);
        s3.setBounds(50,250,300,30);

        setLayout(null);

        add(ta);
        add(s1);
        add(s2);
        add(s3);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        ta.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
    }
}


public class ScrollBar {
    public static void main(String args[]){
ScrollBars s=new ScrollBars();
s.setSize(500,500);
s.setVisible(true);
    }
}
