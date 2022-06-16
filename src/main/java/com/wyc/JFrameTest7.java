package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 21:58
 */
public class JFrameTest7 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("我的界面");
        jf.setLayout(new FlowLayout());
        jf.setBounds(400, 300, 200, 300);
        JComboBox box = new JComboBox();
        box.addItem("--请选择学历--");
        box.addItem("高中");
        box.addItem("大学");
        box.addItem("研究生");
        jf.add(box);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
