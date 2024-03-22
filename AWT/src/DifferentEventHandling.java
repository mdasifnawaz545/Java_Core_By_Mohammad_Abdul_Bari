import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//class HandleEvent implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//        MyFrame.count++;
//            MyFrame.t.setText("    "+MyFrame.count);
//
//
//}
class MyFrame extends Frame{
    public static TextField t;
   public static int count=0;
    Button b;
    public MyFrame(){
        super("Different Event Handling");
//        setLayout(new FlowLayout());
        t=new TextField(20);
        b=new Button("Click to Increase Count");
        t.setText("   "+count);
        add(t);
        add(b);
        b.addActionListener((ActionEvent e)->{count++;t.setText("  "+count);});
    }

//    public class HandleEvent implements ActionListener{
//        public void actionPerformed(ActionEvent e){
//            count++;
//            t.setText("    "+count);
//        }

//    }
//    public  void actionPerformed(ActionEvent e){
//        count++;
//        t.setText("   "+count);
//    }
}


public class DifferentEventHandling {
    public static void main(String args[]){
        MyFrame mf=new MyFrame();
        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
