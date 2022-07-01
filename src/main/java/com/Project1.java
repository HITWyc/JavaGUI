package com;

import com.project1.MysqlUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/7/1 15:10
 */
public class Project1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 300, 200);

        JLabel label1 = new JLabel("帐号：");
        JTextField usernameText = new JTextField("", 20);
        JLabel label2 = new JLabel("密码：");
        JPasswordField pwdText = new JPasswordField("", 20);
        JTextField out = new JTextField("登陆状态", 20);
        JButton button = new JButton("登录");

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameText.getText();
                String pwd = pwdText.getText();
                try {
                    Connection connection = MysqlUtil.getConnection();
                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("select * from user");
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        MysqlUtil.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
        jf.add(label1);
        jf.add(usernameText);
        jf.add(label2);
        jf.add(pwdText);
        jf.add(out);
        jf.add(button);

        jf.setResizable(false);
        button.setSize(40, 20);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
