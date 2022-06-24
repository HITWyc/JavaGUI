package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/24 22:19
 */
public class JFrameTest9 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("监听事件测试");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 400, 200);
        JLabel label = new JLabel("帐号：");
        JTextField text = new JTextField("请输入", 20);
        jf.add(label);
        jf.add(text);
        JLabel label2 = new JLabel("密码：");
        JPasswordField pwd = new JPasswordField("", 20);
        pwd.setEchoChar('*');
        jf.add(label2);
        jf.add(pwd);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
