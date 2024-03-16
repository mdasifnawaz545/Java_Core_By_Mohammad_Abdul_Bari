package JavaSwing;

import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class MyDirectory extends JFrame {
    JTree tree;
    JLabel l;

    public MyDirectory() {
        super("My Directory");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\Users\\KIIT");
        File f = new File("C:\\Users\\KIIT");
        for (File x : f.listFiles()) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for (File y : x.listFiles()) {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            } else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree = new JTree(root);
        l = new JLabel("No file is selected");

        JScrollPane Sp = new JScrollPane(tree);
        add(Sp, BorderLayout.CENTER);
        add(l, BorderLayout.SOUTH);

    }

}

public class DirectoryFiles {
    public static void main(String args[]) {
        MyDirectory m = new MyDirectory();
        m.setSize(400, 600);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
