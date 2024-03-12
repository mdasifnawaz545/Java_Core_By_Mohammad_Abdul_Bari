import java.awt.*;

//class MyFrame extends Frame{
//    Label l;
//    Button b;
//    TextField tx;
//    MyFrame(){
//        super("MyFrame");
//        setLayout(new FlowLayout());
//        l=new Label("Name");
//        tx=new TextField(30);
//       b=new Button("Clik Here");
//        add(l);
//        add(tx);
//        add(b);
//    }
//}


public class AWTRev extends Frame{
    Label l;
    Button b;
    TextField tx;

    AWTRev(){
        super("My Frame");
        setLayout(new FlowLayout());
        l=new Label("Name");
        b=new Button("Click");
        tx=new TextField(20);
        add(l);
        add(tx);
        add(b);
    }

    public static void main(String args[]){

        AWTRev a=new AWTRev();
        a.setSize(400,400);
        a.setVisible(true);

    }
}
