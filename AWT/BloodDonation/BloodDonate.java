import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.GridLayout;
public class BloodDonate extends JFrame{
    private JLabel age,weight,el,resultLabel;
    private JTextField ageTextFld,weightTextFld;
    private Font f;
    private JButton resultBtn,resetBtn;
    public BloodDonate()
    {
        super("Blood Donate Eligibility");
        setSize(2000,500);
        setLayout(new GridLayout(4,2));
        f=new Font("Arial",Font.BOLD,15);

        //Create Component
        age=new JLabel("Enter Age:");
        weight=new JLabel("Enter Weight:");
        el=new JLabel("Eligibility");
        resultLabel=new JLabel("");
        ageTextFld=new JTextField("");
        weightTextFld=new JTextField("");
        resetBtn=new JButton("Reset");
        resultBtn=new JButton("Check Eligibility");
        age.setFont(f);
        weight.setFont(f);
        el.setFont(f);
        resultLabel.setFont(f);
        ageTextFld.setFont(f);
        weightTextFld.setFont(f);
        resetBtn.setFont(f);
        resultBtn.setFont(f);

        //Add All Component to frame
        add(age);
        add(ageTextFld);
        add(weight);
        add(weightTextFld);
        add(el);
        add(resultLabel);
        add(resetBtn);
        add(resultBtn);
        //Register component for Listener
        //Register this window For WindowListener
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Register Cacculate button for Action Listener
        resultBtn.addActionListener(new EligibilityButtonHandler());
        //Register reset button for Action Listener
        resetBtn.addActionListener(new ResetButtonHandler());
        
    }
     class EligibilityButtonHandler implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent ev)
            {
                //read length or width from input box
                int age=0,weight=0;
                String msg="";
                int msgType=0;
                try{
                    age=Integer.parseInt(ageTextFld.getText());
                    weight=Integer.parseInt(weightTextFld.getText());
                    if(age>=18)
                    {
                        if(age<=55)
                        {
                            if(weight>=45)
                            {
                                if(weight<=80)
                               {  msg="Congrats! You may donate blood.";
                                 msgType=JOptionPane.INFORMATION_MESSAGE;
                               }
                                else
                                {msg="Sorry! Your weight is too high,So you can't donate blood now.Plz  try to be healthy and try again.";
                               msgType=JOptionPane.WARNING_MESSAGE;
                            }
            
                            }
                            else
                            {msg="Sorry! You are too weak,Plz be healthy and try again.";
                            msgType=JOptionPane.WARNING_MESSAGE;
                            }
            
                            
                        }
                        else
                        {msg="Sorry! Your age does not allow to donate blood,Thanks for try.";
                        msgType=JOptionPane.ERROR_MESSAGE;
                    }
                    }
                    else
                    {msg="Sorry! you are under age, Plz try after 18.";
                    msgType=JOptionPane.WARNING_MESSAGE;
                }
                    JOptionPane.showMessageDialog(BloodDonate.this,msg,"Blood Donation",msgType);

                }catch(NumberFormatException ex)
                {
                    age=0;
                    weight=0;
                }
                
               
            }
        }
        class ResetButtonHandler implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent ex)
            {
                ageTextFld.setText("");
                weightTextFld.setText("");
                resultLabel.setText("");
                ageTextFld.requestFocusInWindow();
            }
        }

}