package JavaSwing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Layouts.Flowlayout;

class DemoFrame extends JFrame implements ListSelectionListener, ActionListener, ChangeListener {
    JComboBox cmb;
    JList jl;
    JSpinner sp1, sp2;
    JTextField tf;
    JScrollPane spn;

    public DemoFrame() {
        super("Spinner Component");
        String countries[] = { "Saudi Arabia", "Medina", "Makkah", "India", "Pakistan" };
        setLayout(new FlowLayout());
        String days[] = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
        cmb = new JComboBox<>(countries);
        jl = new JList<>(months);
        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(days));
        tf = new JTextField(20);
        spn = new JScrollPane(jl);
        add(cmb);
        add(sp1);
        add(sp2);
        add(spn);
        add(tf);

        jl.addListSelectionListener(this);
        cmb.addActionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = "";
        tf.setText((String) jl.getSelectedValue());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str2 = (String) cmb.getSelectedItem();
        tf.setText(str2);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == sp1)
            tf.setText(sp1.getValue() + "");
        else
            tf.setText(((String) sp2.getValue()));
    }
}

public class DifferentComponent {
    public static void main(String args[]) {
        DemoFrame dm = new DemoFrame();
        dm.setSize(250, 500);
        dm.setVisible(true);
        dm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
