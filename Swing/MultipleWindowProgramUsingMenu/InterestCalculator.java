import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InterestCalculator extends JInternalFrame
{
    private JLabel amtLbl,rateLbl,timeLbl;
    private JTextField amtFld,rateFld,timeFld;
    private Font f;
    private JButton resetBtn,siBtn,ciBtn;

    public InterestCalculator()
    {
        super("Interest calculator");
        setSize(500,300);
        setLayout(new GridLayout(4,2));

        //Create Components
        amtLbl=new JLabel("Enter amount (in Rs)");
        rateLbl=new JLabel("Enter Rate%");
        timeLbl=new JLabel("Enter time (in year)");
        amtFld=new JTextField("");
        rateFld=new JTextField("");
        timeFld=new JTextField("");
        resetBtn=new JButton("Reset");
        ciBtn=new JButton("C.I");
        siBtn=new JButton("S.I");
        f=new Font("Verdana",Font.BOLD|Font.ITALIC,16); 

        //setting font
        amtLbl.setFont(f);
        rateLbl.setFont(f);
        timeLbl.setFont(f);
        amtFld.setFont(f);
        rateFld.setFont(f);
        timeFld.setFont(f);
        resetBtn.setFont(f);
        ciBtn.setFont(f);
        siBtn.setFont(f);
        
        //adding a interest panel
        JPanel interestPanel=new JPanel();
        interestPanel.setLayout(new GridLayout(1,2));
        interestPanel.add(ciBtn);
        interestPanel.add(siBtn);
        //Add all Component to Frame
        add(amtLbl);
        add(amtFld);
        add(rateLbl);
        add(rateFld);
        add(timeLbl);
        add(timeFld);
        add(resetBtn);
        add(interestPanel);

        //Register Component for Listener
        //Register this window For WindowListener
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Register Cacculate button for Action Listener
        ciBtn.addActionListener(new CiButtonHandler());
        siBtn.addActionListener(new SiButtonHandler());
        //Register reset button for Action Listener
        resetBtn.addActionListener(new ResetButtonHandler());

    }
    
    class SiButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ev)
        {
            try{
                double amt=Double.parseDouble(amtFld.getText());
                double rate=Double.parseDouble(rateFld.getText());
                double time=Double.parseDouble(timeFld.getText());
                double si=(amt*rate*time)/100.0;
                String msg="Simple interest = "+si;
                JOptionPane.showMessageDialog(InterestCalculator.this,msg,"C.I calculator",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(InterestCalculator.this,"Please Enter Valid number!","C.I calculator",JOptionPane.ERROR_MESSAGE);
            }

        }
    }
    class CiButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ev)
        {
            try{
                double amt=Double.parseDouble(amtFld.getText());
                double rate=Double.parseDouble(rateFld.getText());
                double time=Double.parseDouble(timeFld.getText());
                double ci=(amt*Math.pow((1+(rate/100.0)),time))-amt;
                String msg="Compound interest = "+ci;
                JOptionPane.showMessageDialog(InterestCalculator.this,msg,"C.I calculator",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(InterestCalculator.this,"Please Enter Valid number!","C.I calculator",JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    class ResetButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ex)
        {
            amtFld.setText("");
            rateFld.setText("");
            timeFld.setText("");
            amtFld.requestFocusInWindow();
        }
    }
}

