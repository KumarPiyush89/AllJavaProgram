
package com.mycompany.table;

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
public class TableWindow extends Frame {
    private Label l1,tab[];
    private TextField numText;
    private Button printBtn,resetBtn;
    public TableWindow()
    {
        super("Table");
        setSize(700,700);
        setResizable(false);
        Font f=new Font("Times New Roman",Font.BOLD,20);
        setLayout(new GridLayout(11,1));
        
        l1=new Label("Enter number:");
        numText=new TextField("");
        printBtn=new Button("Print");
        resetBtn=new Button("Reset");
        l1.setFont(f);
        numText.setFont(f);
        printBtn.setFont(f);
        resetBtn.setFont(f);
        Panel top=new Panel();
        top.setLayout(new GridLayout(1,4));
        top.add(l1);
        top.add(numText);
        top.add(printBtn);
        top.add(resetBtn);
        add(top);
        
        tab=new Label[10];
        for(int i=0;i<10;i++)
        {
            tab[i]=new Label();
            tab[i].setFont(f);
            tab[i].setAlignment(Label.CENTER);
            add(tab[i]);
        }
        
        //register this window for windowListener
        addWindowListener(new WindowHandler());
        printBtn.addActionListener(new PrintButtonHandler());
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
            //read number from text field
            int n;
            try
            {
                n=Integer.parseInt(numText.getText());
                for(int i=0;i<10;i++)
                {
                    tab[i].setText(n+" * "+(i+1)+" = "+(n*(i+1)));
                }
            }catch(NumberFormatException ex)
            {
                tab[0].setText("Please enter a valid number");
            }
            
        }
        
    }
}
