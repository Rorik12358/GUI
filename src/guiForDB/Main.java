package guiForDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by m18 on 15.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DB Relationship");
        frame.setSize(500,500);
        frame.setLocation(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(10,2,5,5));
        frame.add(panel);

        JTextField bookName = new JTextField();
        bookName.setSize(50,10);
        panel.add( bookName);

        JButton button = new JButton("Search");
        panel.add(button);

        JButton button1 = new JButton("Search All Information");
        panel.add(button1);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection connection = null;
                try{
                    Class myDBDriver = Class.forName("org.h2.Driver");
                    connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
                    PreparedStatement statement = connection.prepareStatement("SELECT AUTHOR.NAME FROM BOOK INNER " +
                            "JOIN AUTHOR ON BOOK.AUTHOR_ID = AUTHOR.ID WHERE BOOK.NAME = ?");
                    statement.setString(1,bookName.getText());
                    ResultSet resultSet = statement.executeQuery();
                    resultSet.next();
                    System.out.println(resultSet.getString(1));
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }finally {
                    try {
                        connection.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
