import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class CheckboxANDRadio extends Frame implements ItemListener {
    Label l;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;

    CheckboxGroup cg;

    public CheckboxANDRadio(){
        super("Check Box and Radio Buttons");
        setLayout(new FlowLayout());
        l=new Label("Nothing is Selected");
        cg=new CheckboxGroup();
        c1=new Checkbox("Java",false,cg);
        c2=new Checkbox("C",false,cg);
        c3=new Checkbox("JavaScript",false,cg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(l);
        add(c1);
        add(c2);
        add(c3);



    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        String labelName="";
        if(c1.getState())
            labelName=c1.getLabel()+" "+labelName;;
        if(c2.getState())
            labelName=c2.getLabel()+" "+labelName;;
        if(c3.getState())
            labelName=c3.getLabel()+" "+labelName;
        if(labelName.isEmpty())
            labelName="Noting is Selected";
        l.setText(labelName);

    }
}

public class Checkboxes {
    public static void main(String args[]){
        CheckboxANDRadio c=new CheckboxANDRadio();
        c.setSize(400,400);
        c.setVisible(true);
    }
}
