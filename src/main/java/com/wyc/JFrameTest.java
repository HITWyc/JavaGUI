package com.wyc;
import javax.swing.*;
/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/13 21:04
 */
public class JFrameTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("我的界面");
        jf.setSize(400, 250);
        jf.setLocation(400, 300);
//        jf.setTitle("我的界面");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
