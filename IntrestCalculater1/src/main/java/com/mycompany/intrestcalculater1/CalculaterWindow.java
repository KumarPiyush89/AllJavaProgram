/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intrestcalculater1;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author piyus
 */
public class CalculaterWindow  extends Frame{
    private Label p1,l1,l2,l3,si;
    private TextField n1,n2,n3,n4;
    private Button printBtn,resetBtn;
    public CalculaterWindow()
    {
        super("IntrestCalculater");
        setSize(700,700);
        Font f=new Font("Times new roman",Font.BOLD,20);
        setLayout(new GridLayout(4,4));
        p1=new Label("SIMPLE INTREST");
        p1.setFont(f);
        p1.setAlignment(Label.CENTER);
        l1=new Label("Enter Principal Amount: ");
        l2=new Label("Enter Rate: ");
        l3=new Label("Enter Time: ");
        si=new Label("SIMPLE INTREST");
        
        n1=new TextField("");
        n2=new TextField("");
        n3=new TextField("");
        n4=new TextField("");
        
        printBtn=new Button("PRINT");
        resetBtn=new Button("RESET");
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        si.setFont(f);
        si.setAlignment(Label.CENTER);
        n1.setFont(f);
        n2.setFont(f);
        n3.setFont(f);
        n4.setFont(f);
        //n4.setAlignment(TextField.CENTER_ALIGNMENT);
        printBtn.setFont(f);
        resetBtn.setFont(f);
        
        Panel top=new Panel();
        top.setLayout(new GridLayout(6,6));
        top.add(p1);
        top.add(l1);
        top.add(n1);
        
        top.add(l2);
        top.add(n2);
        
        top.add(l3);
        top.add(n3);
        
        top.add(si);
        top.add(n4);
        
        top.add(printBtn);
        top.add(resetBtn);
        add(top);
        // register windowListner
        printBtn.addActionListener((ActionListener) new PrintButtonHandler());
        addWindowListener((WindowListener) new WindowHandler());
    }
    class WindowHandler implements WindowListener
    {

        @Override
        public void windowOpened(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    class PrintButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         int pa,time;
         float rate,si;
         try
         {
             pa=0; time=0; rate=0;
             pa=Integer.parseInt(n1.getText());
             time=Integer.parseInt(n3.getText());
             rate=Float.parseFloat(n2.getText());
             
             si=(pa*rate*time)/100;
         }catch(NumberFormatException ex)
            {
                //pa.setText("Enter a valid number");
            }
        }
     
}
}
