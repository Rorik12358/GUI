package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by m18 on 13.04.2016.
 */
public class Main3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(500,500);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add(panel);
        Button bt1 = new Button("North");
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("North");
            }
        });
        bt1.setSize(20,20);
        panel.add(bt1, BorderLayout.NORTH);
        panel.add(new JButton("BorderLayout.SOUTH"),BorderLayout.SOUTH);

        Button bt2 = new Button("new window");
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setSize(300,100);
                frame.setLocation(600,700);
                frame.setVisible(true);

                TextField text = new TextField("Hello Beba");
                frame.add(text);
            }
        });
        panel.add(bt2,BorderLayout.CENTER);
    }
}
