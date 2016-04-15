package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by m18 on 13.04.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.add(panel2);
        FlowLayout layout1 = new FlowLayout();
        BorderLayout layout2 = new BorderLayout();
        BorderLayout layout3 = new BorderLayout();
        panel.setLayout(layout2);
        panel2.setLayout(layout3);
        frame.add(panel);
        frame.add(panel2);
        for(int i = 0; i < 10; i++){
            Button bnt = new Button("btn"+i);
            panel.add(bnt);
        }

    }
}
