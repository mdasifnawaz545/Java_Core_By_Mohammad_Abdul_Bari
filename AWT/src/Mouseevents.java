import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Mouse extends Frame implements MouseListener, MouseMotionListener {
    Label l1,l2;
    public Mouse(){
        l1=new Label("");
        l2=new Label("");

        setLayout(null);
        l1.setBounds(20,50,100,50);
        l2.setBounds(20,80,100,50);

        add(l1);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
        l2.setText("("+e.getX()+","+e.getY()+")");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l1.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l1.setText("Mouse Moved");
    }
}

public class Mouseevents {
    public static void main(String args[]){
     Mouse M=new Mouse();
     M.setSize(300,300);
     M.setVisible(true);
    }
}
