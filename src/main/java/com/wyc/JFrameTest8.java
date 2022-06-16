package com.wyc;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/6/16 22:12
 */
public class JFrameTest8 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("监听事件测试");
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));
        jf.setBounds(400, 300, 400, 200);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("菜单一");
        JMenu menu2 = new JMenu("菜单二");
        JMenuItem item = new JMenuItem("选项1");
        JMenuItem item2 = new JMenuItem("选项2");
        JMenuItem item3 = new JMenuItem("选项3");
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        menu2.add(item);
        menu2.add(item2);
        menu2.add(item3);
        bar.add(menu);
        bar.add(menu2);
        jf.add(bar);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
