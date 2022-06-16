package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 21:25
 */
public class JFrameTest4 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Frame");
        jf.setLayout(new FlowLayout());
        jf.setBounds(400, 300, 200, 300);
        JButton jb = new JButton("按钮1");
        jb.setEnabled(true);
        jb.setBorderPainted(true);
        jf.add(jb);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
