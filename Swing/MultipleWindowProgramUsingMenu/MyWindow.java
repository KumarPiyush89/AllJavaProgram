import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame
{

    private JMenuBar menuBar;
    private JMenu conversion,calculator,home,close;
    private JMenuItem conversionLength,conversionTempreature,calculatorExpression,calculatorInterest,exitMenu;
    private JMenuItem conversionLengthClose,conversionTempreatureClose,calculatorExpressionClose,calculatorInterestClose;
    private JLabel lbl;
    private Font fnt;
    private JDesktopPane jdp;
    private CalculatorWindow cw=null;
    private InterestCalculator ic=null;
    private TempreatureConversionWindow tcw=null;
    
    public MyWindow()
    {
        setTitle("My window");
        setSize(600,500);
        setLayout(new GridLayout(1,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);

        conversion=new JMenu("Conversion");
        conversion.setForeground(Color.BLUE);
        calculator=new JMenu("calculator");
        calculator.setForeground(Color.BLUE);
        home=new JMenu("Home");
        home.setForeground(Color.BLUE);
        close=new JMenu("Close");
        close.setForeground(Color.BLUE); 
        menuBar.add(home);
        menuBar.add(conversion);
        menuBar.add(calculator);
        menuBar.add(close);

        conversionTempreature=new JMenuItem("Tempreature");
        conversionLength=new JMenuItem("Length");
        calculatorExpression=new JMenuItem("Expression");
        calculatorInterest=new JMenuItem("Interest");
        exitMenu=new JMenuItem("Exit");
        exitMenu.setForeground(Color.RED);

        conversion.add(conversionLength);
        conversion.add(conversionTempreature);

        calculator.add(calculatorExpression);
        calculator.add(calculatorInterest);

        home.add(exitMenu);

        calculatorExpression.addActionListener(new CalculatorExpressionMenuHandler());
        calculatorInterest.addActionListener(new CalculatorInterestMenuHandler());
        conversionTempreature.addActionListener(new TempreatureConversionHandler());
        exitMenu.addActionListener(new ExitMenuHandler());

        lbl=new JLabel("Welcome");
        lbl.setForeground(Color.BLUE);
        fnt=new Font("Verdana",Font.BOLD,34);
        lbl.setFont(fnt);
        lbl.setHorizontalAlignment(JTextField.CENTER);
        add(lbl);
        
        jdp=new JDesktopPane();
    }
    
    public class CalculatorExpressionMenuHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            setContentPane(jdp);
            if(cw==null)
            {
                cw=new CalculatorWindow();
                jdp.add(cw);
                calculatorExpressionClose=new JMenuItem("Expression Calculator");
                close.add(calculatorExpressionClose);
                calculatorExpressionClose.addActionListener(new CalculatorExpressionCloseHandler());
            }
            cw.setVisible(true);
            cw.toFront();
        }
    }
    public class CalculatorExpressionCloseHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            cw.dispose();
            cw=null;
            close.remove(calculatorExpressionClose);
            calculatorExpressionClose=null;       
        }
    }
    public class CalculatorInterestMenuHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            setContentPane(jdp);
            if(ic==null)
            {
                ic=new InterestCalculator();
                jdp.add(ic);
            }
            ic.setVisible(true);
            ic.toFront();
        }
    }
    public class TempreatureConversionHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            setContentPane(jdp);
            if(tcw==null)
            {
                tcw=new TempreatureConversionWindow();
                jdp.add(tcw);
            }
            tcw.setVisible(true);
            tcw.toFront();
        }
    }
    public class ExitMenuHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            System.exit(0);
        }
    }    
        
}
