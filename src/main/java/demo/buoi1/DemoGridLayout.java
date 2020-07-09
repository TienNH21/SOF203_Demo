/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tiennh
 */
public class DemoGridLayout {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JFrame - FlowLayout");
        frame.setLocation(200, 200);
        frame.setSize(300, 400);
        
        JPanel panel = new JPanel(
            new GridLayout(3, 3)
        );
        frame.add(panel);
        JButton listBtn[] = new JButton[9];
        
        for (int i = 0; i < 9; i++) {
            listBtn[i] = new JButton("Button " + (i+1));
            panel.add(listBtn[i]);
        }
        
        frame.setVisible(true);
    }
}
