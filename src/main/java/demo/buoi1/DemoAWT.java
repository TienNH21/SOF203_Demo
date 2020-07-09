/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.buoi1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tiennh
 */
public class DemoAWT extends Frame implements ActionListener
{
    Button btnYellow, btnRed;
    Label lblLabel;
    
    public DemoAWT(String msg)
    {
        this.setTitle(msg);
        this.setLayout(new FlowLayout());
        this.lblLabel = new Label();
        this.btnRed = new Button("BUTTON RED");
        this.btnYellow = new Button("BUTTON YELLOW");
        
        this.add(this.lblLabel);
        this.add(this.btnRed);
        this.add(this.btnYellow);
        
        this.btnRed.addActionListener(this);
        this.btnYellow.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnClicked = e.getActionCommand();
        if (btnClicked == "BUTTON YELLOW") {
            this.lblLabel.setText("Button Yellow is clicked");
            this.setBackground(Color.yellow);
        }

        if (btnClicked == "BUTTON RED") {
            this.lblLabel.setText("Button Red is clicked");
            this.setBackground(Color.red);
        }
    }
    
    public static void main(String[] args)
    {
        DemoAWT awt = new DemoAWT("Hello World!");
        awt.setSize(500, 500);
        awt.show();
    }
}
