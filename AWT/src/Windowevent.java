import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.concurrent.Callable;

class MyWindow extends Frame implements WindowListener {
    Label L;

    public MyWindow(){
        super("Window Event");
        setLayout(new FlowLayout());
        L=new Label("");
        add(L);
        addWindowListener(this);
    }

    public void windowOpened(WindowEvent e){
        L.setText("Window is Opened");
    }
    public void windowClosed(WindowEvent e){
        L.setText("Window is Closed");

    }
    public void windowActivated(WindowEvent e){
        L.setText("Window is Activated");

    }
    public void windowDeactivated(WindowEvent e){
        L.setText("Window is Deactivated");

    }
    public void windowClosing(WindowEvent e){
        L.setText("Window is Closing");
    }
    public void windowIconified(WindowEvent e){
        L.setText("Window is Iconified");

    }
    public void windowDeiconified(WindowEvent e){
        L.setText("Window is Deiconified");
    }
}



public class Windowevent {
    public static void main(){
        MyWindow mw=new MyWindow();
        mw.setSize(500,500);
        mw.setVisible(true);

    }
}
