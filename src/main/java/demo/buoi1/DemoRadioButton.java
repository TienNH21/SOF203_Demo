/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author tiennh
 */
public class DemoRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Icon Button");
        JPanel panel = new JPanel();

        frame.setLocation(200, 200);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.setBorder(new TitledBorder("Bạn thấy Java:"));
        
        JRadioButton radioBtn1 = new JRadioButton("Rất dễ!");
        JRadioButton radioBtn2 = new JRadioButton("Dễ!");
        JRadioButton radioBtn3 = new JRadioButton("Bình thường!");
        JRadioButton radioBtn4 = new JRadioButton("Khó!");
        JRadioButton radioBtn5 = new JRadioButton("Rất Khó!");

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioBtn1);
        btnGroup.add(radioBtn2);
        btnGroup.add(radioBtn3);
        btnGroup.add(radioBtn4);
        btnGroup.add(radioBtn5);
        
        panel.add(radioBtn1);
        panel.add(radioBtn2);
        panel.add(radioBtn3);
        panel.add(radioBtn4);
        panel.add(radioBtn5);

        frame.add(panel);
    }
}
