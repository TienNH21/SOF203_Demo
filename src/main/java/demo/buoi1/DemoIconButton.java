/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author tiennh
 */
public class DemoIconButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo Icon Button");
        JPanel panel = new JPanel();

        frame.setLocation(200, 200);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ImageIcon iconJava = new ImageIcon("/Users/tiennh/Desktop/java-23-225999.png");
        JButton btnJava = new JButton("Click me!", iconJava);
        btnJava.setPressedIcon(iconJava);
        btnJava.setRolloverIcon(iconJava);
        btnJava.setSize(50, 50);
        panel.add(btnJava);
        panel.setBorder(
            new TitledBorder(new LineBorder(Color.RED), "Demo")
        );
        frame.add(panel);
    }
}
