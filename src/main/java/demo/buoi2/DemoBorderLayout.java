/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tiennh
 */
public class DemoBorderLayout {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setLocation(300, 300);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel(
            new BorderLayout()
        );
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        panel.add(btn1, BorderLayout.PAGE_START);
        panel.add(btn2, BorderLayout.LINE_START);
        panel.add(btn3, BorderLayout.LINE_END);
        panel.add(btn4, BorderLayout.PAGE_END);
        panel.add(btn5, BorderLayout.CENTER);
        
        frame.add(panel);
    }
}
