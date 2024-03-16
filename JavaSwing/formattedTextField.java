import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.text.NumberFormatter;

class MyTextField extends JFrame implements TextListener{
    JTextField jf;
    JTextArea ja;
    JLabel jl;
    JFormattedTextField jft;
    public MyTextField(){
        super("My TextField");
        setLayout(new FlowLayout());
        jf=new JTextField(20);
        ja=new JTextArea(03,30);
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        
        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nfn=new NumberFormatter(nf);
        nfn.setMaximum(10000);
        nfn.setAllowsInvalid(false);
        jft=new JFormattedTextField(nfn);
        jft.setColumns(20);
        jft.setValue(0);
           add(jf);
        add(ja);
        add(jft);
        jl=new JLabel();
        
     

     
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String str=jft.getSelectedText();
        jl.setText(str);
    }
    
}

public class formattedTextField {
    public static  void main(String  args[]){
        MyTextField m=new MyTextField();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
