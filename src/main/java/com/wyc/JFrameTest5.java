package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 21:33
 */
public class JFrameTest5 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Frame");
        jf.setLayout(new FlowLayout());
        jf.setBounds(400, 300, 200, 300);
        JRadioButton jrb1 = new JRadioButton("男");
        JRadioButton jrb2 = new JRadioButton("女");
        ButtonGroup group = new ButtonGroup();
        group.add(jrb1);
        group.add(jrb2);
        jf.add(jrb1);
        jf.add(jrb2);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
