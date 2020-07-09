/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi1;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tiennh
 */
public class DemoCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Icon Button");
        JPanel panel = new JPanel();

        frame.setLocation(200, 200);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.setLayout(new GridLayout(2, 2));
        
        JCheckBox cbLang1 = new JCheckBox("C/C++");
        JCheckBox cbLang2 = new JCheckBox("Java");
        JCheckBox cbLang3 = new JCheckBox("PHP");
        JCheckBox cbLang4 = new JCheckBox("Javascript");
        
        panel.add(cbLang1);
        panel.add(cbLang2);
        panel.add(cbLang3);
        panel.add(cbLang4);

        cbLang1.setSelected(true);
        cbLang3.setSelected(true);

        frame.add(panel);
    }
}
