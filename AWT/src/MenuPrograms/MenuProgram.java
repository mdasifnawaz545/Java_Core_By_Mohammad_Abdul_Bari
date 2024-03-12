package MenuPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

class MyFrame extends Frame{
        Menu m,mcb;
        MenuBar mb;
        MenuItem m1,m2,m3,m4;
        CheckboxMenuItem cmi;

        TextField tf;
        public MyFrame(){
            super("Menu Items");
            setLayout(new FlowLayout());
            m=new Menu("File");
            tf=new TextField(30);
            add(tf);
            m1=new MenuItem("open");
            m2=new MenuItem("Save");
            m3=new MenuItem("Close");
            m4=new MenuItem("CloseAll");
            cmi=new CheckboxMenuItem("Auto Save",false);
            mcb=new Menu("Close");
            m.add(m1);
            m.add(m2);
            mcb.add(m3);
            mcb.add(m4);
            m.add(mcb);
            m.add(cmi);
            mb=new MenuBar();
            mb.add(m);
            setMenuBar(mb);

            m1.addActionListener((ActionEvent e)->{tf.setText("Open");});
            m2.addActionListener((ActionEvent e)->{tf.setText("Save");});
            m3.addActionListener((ActionEvent e)->{tf.setText("Close");});
            m4.addActionListener((ActionEvent e)->{tf.setText("CloseAll");});

//            cmi.addItemListener((ItemEvent ae)->{if(cmi.getState())cmi.setState(false);else cmi.setState(true);});


        }

}


public class MenuProgram{
    public static void main(String args[])
    {
        MyFrame mf=new MyFrame();
        mf.setSize(800,500);
        mf.setVisible(true);
    }
    
}
