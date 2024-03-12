import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ColourCircle extends Frame{
    int x=0,y=0;
    public ColourCircle (){
        super("Mouse Pointer Circle and Color");
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
//        g.fillOval(x,y,50,50);
        g.setFont(new Font("Noteworthy",Font.BOLD,30));
        g.drawString("Salaam",x,y);
    }
}


public class ColorsandDrawing {
    public static void main(String args[]){
        ColourCircle c=new ColourCircle();
        c.setSize(500,500);
        c.setVisible(true);
    }
}
