package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 21:38
 */
public class JFrameTest6 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("我的界面");
        jf.setLayout(new FlowLayout());
        jf.setBounds(400, 300, 200, 300);
        JCheckBox box1 = new JCheckBox("睡觉", true);
        JCheckBox box2 = new JCheckBox("敲代码", false);
        JCheckBox box3 = new JCheckBox("游戏",false);
        jf.add(box1);
        jf.add(box2);
        jf.add(box3);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
