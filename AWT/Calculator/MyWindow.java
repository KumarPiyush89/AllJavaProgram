import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame{
    private JLabel display1,display2;
    private JButton buttons[];
    private JLabel mLable;
    private Double operand1,operand2,result;
    private String data,operator;
    private Font displayFont;
    private String buttonsText[]={"Mc","MR","MS","M+","M-","<-","CE","C","+/-","^","7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","0","0",".","+","="};

    public MyWindow()
    {
        setTitle("My Calculator");
        setSize(400,600);
        setLayout(new BorderLayout());
    
        //Create Display Area
        display1=new JLabel("0",JLabel.RIGHT);
    
        display2=new JLabel("",JLabel.RIGHT);
        display1.setFont(new Font("Times New Romon",Font.BOLD,32));
        display2.setFont(new Font("Times New Romon",Font.PLAIN,20));

        JPanel displayPanel=new JPanel(new GridLayout(2,1));
        displayPanel.add(display2);
        displayPanel.add(display1);
        displayPanel.setBackground(Color.BLACK);
        display1.setForeground(Color.WHITE);
        display2.setForeground(Color.WHITE);
        add(displayPanel,BorderLayout.NORTH);
        displayPanel.setPreferredSize(new Dimension(100,100));
        buttons=new JButton[30];
        Font buttonsFont=new Font("Times New Romon",Font.BOLD,20);
        JPanel buttonsPanel=new JPanel(new GridLayout(6,5));
        for(int i=0;i<30;i++)
        {
            buttons[i]=new JButton(buttonsText[i]);
            buttonsPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonHandler());
            buttons[i].setFont(buttonsFont);
            //buttons[i].setBackground(Color.BLACK);
            buttons[i].setForeground(Color.black);
        }
        add(buttonsPanel,BorderLayout.CENTER);


    }
    class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ev)
        {
            switch(ev.getActionCommand())
            {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    if(display1.getText().equals("0"))
                    {
                        display1.setText(ev.getActionCommand());

                    }
                    else
                    display1.setText(display1.getText()+ev.getActionCommand());
                    break;
                case"C":
                    display1.setText("0");
                    display2.setText("");
                    break;
                case"CE":
                    display1.setText("0");
                    break;
                case"<-":
                    data=display1.getText();
                    data=data.substring(0,data.length()-1);
                    if(data.equals(""))
                    data="0";
                    display1.setText(data);
                    break;
                case"+":
                case"-":
                case"*":
                case"/":
                
                    operand1=Double.parseDouble(display1.getText());
                    display2.setText(display1.getText()+ev.getActionCommand());
                    operator=ev.getActionCommand();
                    display1.setText("0");
                    break;
                case"=":
                    operand2=Double.parseDouble(display1.getText());
                    display2.setText(display2.getText()+operand2+"=");
                    switch(operator)
                    {
                        case"+":
                            result=operand1+operand2;
                            break;
                        case"-":
                            result=operand1-operand2;
                            break;
                        case"*":
                            result=operand1*operand2;
                            break;
                        case"/":
                            result=operand1/operand2;
                            break;
                        

                        
                    }
                    display1.setText(result+"");
                    break;
                    case".":
                        data=display1.getText();
                        if(data.indexOf('.')==-1)
                        display1.setText(display1.getText()+ ev.getActionCommand());
                        break;
                    /*case"M+":
                        operand1=Double.parseDouble(display1.getText());
                        if(!display1.getText().equals("0"));
                        memory+=operand1;
                        mLable.setText("Memory "+memory);
                        break;*/

            }
        }
    }
    
}