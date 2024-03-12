import java.awt.*;

class Layout extends Frame{
    Label l=new Label("Flow Layout");
    Button b1,b2,b3,b4,b5,b6;
    public Layout(){
        super("Flow Layout");
        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        setLayout(fl);
        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("Button 5");
        b6=new Button("Button 6");
//        add(l);
        fl.setHgap(60);
        fl.setVgap(20);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }

}

public class Flowlayout {
    public  static void main(String args[]){
        Layout L=new Layout();
        L.setSize(500,500);
        L.setVisible(true);
    }
}
