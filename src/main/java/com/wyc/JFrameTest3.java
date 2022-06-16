package com.wyc;

import javax.swing.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 21:19
 */
public class JFrameTest3 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Frame");
        jf.setBounds(400, 300, 200, 300);

        JLabel jLabel = new JLabel("帐号", SwingConstants.LEFT);
        jf.add(jLabel);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
