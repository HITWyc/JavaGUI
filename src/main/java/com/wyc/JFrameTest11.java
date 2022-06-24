package com.wyc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/24 23:06
 */
public class JFrameTest11 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("监听事件测试");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 300, 200);
        JTextArea area = new JTextArea(10, 20);
        area.setLineWrap(true);
        JButton button = new JButton("暴打马老师");
        button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                area.append("年青人耗子尾汁");
           }
        });
        jf.add(area);
        jf.add(button);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
