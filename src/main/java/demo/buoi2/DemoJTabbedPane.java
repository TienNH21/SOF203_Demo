/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi2;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author tiennh
 */
public class DemoJTabbedPane {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setLocation(300, 300);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        tabbedPane.setSize(300, 300);
        
        JComponent panel1 = makeTextPanel("Panel #1");
        JComponent panel2 = makeTextPanel("Panel #2");
        JComponent panel3 = makeTextPanel("Panel #3");
        JComponent panel4 = makeTextPanel("Panel #4");

        JLabel lable1 = new JLabel("Label 1");
        JLabel lable2 = new JLabel("Label 2");
        JLabel lable3 = new JLabel("Label 3");
        JLabel lable4 = new JLabel("Label 4");

//        panel1.add(lable1);
//        panel2.add(lable2);
//        panel3.add(lable3);
//        panel4.add(lable4);
        
        tabbedPane.addTab("Tab 1", null, panel1, "Does something 1");
        tabbedPane.addTab("Tab 2", null, panel2, "Does something 2");
        tabbedPane.addTab("Tab 3", null, panel3, "Does something 3");
        tabbedPane.addTab("Tab 4", null, panel4, "Does something 4");
        
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        
        JPanel mainPanel = new JPanel();
        mainPanel.add(tabbedPane);
        frame.add(mainPanel);
    }
    
    public static JComponent makeTextPanel(String text)
    {
        JPanel panel = new JPanel(false);
        panel.setSize(200, 200);
        JLabel filler = new JLabel(text);
        filler.setSize(100, 30);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
}
