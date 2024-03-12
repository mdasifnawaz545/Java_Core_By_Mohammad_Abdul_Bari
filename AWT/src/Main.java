import java.awt.*;

class Main{
    public static  void main(String args[]){
        Frame f=new Frame();
        f.setLayout(new FlowLayout());
        Label l=new Label("Enter Your Name");
        TextField tf=new TextField(20);
//        TextArea t=new TextArea("Enter something...");
        Button b=new Button("Okay");
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(500,500);
        f.setVisible(true);
    }
}