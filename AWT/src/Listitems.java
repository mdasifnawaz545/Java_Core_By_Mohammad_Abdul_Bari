import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Lists extends Frame implements ItemListener, ActionListener {
    List l;
    Label l1;
    Label l2;
    Choice c;
    TextArea ta;
    public Lists(){
        super("List Item");
        setLayout(new FlowLayout());
        l= new List(7,true);
        c=new Choice();
        ta=new TextArea(20,30);
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("Febraury");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");
        l1=new Label("Days");
        l2=new Label("Months");
        add(l1);
        add(l);
        add(l2);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==l){
            String str="";
            String listsit[]=l.getSelectedItems();
            for(String t:listsit){
                str+=t+"\n";
            }
            ta.setText(str);
        }
//        Write a code to implement the selection of more than one list and add them into the textarea field.
        else ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent ea) {
        String listitem[]=l.getSelectedItems();
        String str="";
        for(String s:listitem){
            str=str+s+"\n";
        }
        ta.setText(str);
        l.add(str);
    }
}


public class Listitems {
    public static void main(String args[]){
    Lists L=new Lists();
    L.setSize(300,300);
    L.setVisible(true);
    }
}
