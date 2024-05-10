package JavaSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

class MyFrame extends JFrame{
    JTree jt;
    JScrollPane jsp;

    public MyFrame() {
        super("File Chooser");
        setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\Users");
        DefaultMutableTreeNode node;
        File f = new File("C:\\Users");
        for (File x : f.listFiles()) {
            if (x.isDirectory()) {
                node = new DefaultMutableTreeNode(x.getName());
                for (File y : x.listFiles()) {
                    node.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(node);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        // jt.addTreeSelectionListener(this);
        jt = new JTree(root);
        jsp = new JScrollPane(jt);
        add(jsp);

       

    }
    // @Override
    // public void valueChanged(TreeSelectionEvent e) {
        
    // }
}

public class JtreeComponent {
    public static void main(String args[]) {
        MyFrame mf = new MyFrame();
        mf.setSize(500, 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
