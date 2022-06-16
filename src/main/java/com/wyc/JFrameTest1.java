package com.wyc;

import javax.swing.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/13 21:15
 */
public class JFrameTest1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setBounds(400, 300, 300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDialog jd = new JDialog(jf, "Dialog");
        jd.setBounds(400, 300, 200, 200);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
