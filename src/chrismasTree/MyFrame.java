package chrismasTree;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel p;

    MyFrame() {
        p = new MyPanel();
        add(p);
        setBounds(400, 200, 800, 800);
        setVisible(true);
        validate();
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Merry Christmas " + "小哪吒");
        label1.setFont(new Font("",1,30));
        label1.setForeground(Color.red);
        label1.setBounds(250,300,500,400);
        p.add(label1);
        p.setVisible(true);
    }
}
