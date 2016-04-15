package gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by m18 on 13.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLocation(300,300);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jFrame.add(jPanel);
        JButton btm  = new JButton("Button");
        jPanel.add(btm);
        for(int i = 1; i < 10; i++){
            JButton button = new JButton("btn "+i);
            jPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Hello world");
                }
            });
        }
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
