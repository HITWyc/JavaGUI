package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 20:07
 */
public class JFrameTest2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Frame");
        jf.setBounds(400, 300, 1000, 1300);

        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(jb1);
        jp.add(jb2);
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
