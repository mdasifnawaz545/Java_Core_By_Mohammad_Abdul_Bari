import java.awt.*;

class MyAnimationFrame extends Frame implements Runnable{
    int x,y,tx,ty;
//    tx and ty are used to increase the coordinate of the axis.
    public MyAnimationFrame(){
        super("Ball Animation");
        x=100;
        y=100;
        tx=ty=1;
        Thread th=new Thread(this);
        th.start();

    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x,y,50,50);
    }
    public void run(){
        while(true){
            x = x + tx;
            y = y + ty;
            if(x<0 || x>450)
                tx=tx*-1;
            if(y<20 || y>350)
                ty=ty*-1;
            repaint();
            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


public class AnimationClass {
    public static void main(String args[]){
        MyAnimationFrame maf=new MyAnimationFrame();
        maf.setSize(500,400);
        maf.setVisible(true);
    }
}
