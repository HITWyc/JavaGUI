package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/24 22:49
 */
public class JFrameTest10 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("监听事件测试");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400, 300, 400, 200);
        JTextArea area = new JTextArea(20, 10);
        jf.add(area);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
