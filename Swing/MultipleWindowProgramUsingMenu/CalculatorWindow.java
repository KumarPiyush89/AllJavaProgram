import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorWindow extends JInternalFrame
{
    private JLabel total,lastOperator;
    private JButton btns[][];
    private Font numFnt,fnt,opfnt;
    private JLabel inputBox;
    private boolean emptyFld=true;
    private String lastOprnd="",secondLastOprnd="",operator="";
    private double result=0;
    protected void finalize()
    {
        
    }
    public CalculatorWindow()
    {
        super("Calculator");
        setSize(300,400);
        setResizable(false);
        setLayout(new GridLayout(8,1));
        //creating component 
        lastOperator=new JLabel("");
        numFnt=new Font("Verdana",Font.BOLD,20);
        fnt=new Font("Verdana",Font.ITALIC|Font.BOLD,10);
        opfnt=new Font("Verdana",Font.BOLD,18);
        inputBox=new JLabel("0");
        inputBox.setFont(numFnt);
        inputBox.setHorizontalAlignment(JTextField.RIGHT);
        total=new JLabel("");
        total.setFont(opfnt);
        total.setHorizontalAlignment(JTextField.RIGHT);
        //adding a panel
        JPanel pnl[]=new JPanel[6];
        for(int i=0;i<6;i++)
        {
            pnl[i]=new JPanel();
            pnl[i].setLayout(new GridLayout(1,5));
        }
        String str[][]={{"MC","MR","MS","M+","M-"},
                        {"<-","CE","C","+/-","^"},
                        {"7","8","9","/","%"},
                        {"4","5","6","X","1/x"},
                        {"1","2","3","-","="},
                        {"0","0",".","+","="}};

        btns=new JButton[6][5];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<5;j++)
            {
                btns[i][j]=new JButton(str[i][j]);

                if(i==0||i==1||j==3||j==4)
                btns[i][j].setFont(fnt);
                else
                btns[i][j].setFont(numFnt);

                if((i==2||i==3||i==4||i==5)&&j==3)
                btns[i][j].setFont(opfnt);

                pnl[i].add(btns[i][j]);
                
                //adding event on button.
                btns[i][j].addActionListener(new ButtonHandler());
            }
        }


        //adding component
        add(inputBox);            
        add(total); 
        for(int i=0;i<6;i++)
        add(pnl[i]);  

        //adding events
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    public class OperatorStack
    {
        private char list[];
        private int tos,capacity;
        public OperatorStack()
        {
            list=new char[100];
            tos=-1;
            capacity=100;
        }
        public String pushOperator(char op)
        {
            String exp="";
            if(tos==-1)
            {
                list[++tos]=op;
                return exp;
            }
            
            while(true)
            {
                if(tos!=-1&&precedenceLevelOf(topOfStack())>=precedenceLevelOf(op))
                {
                    exp+=popOperator()+",";
                }
                else
                {
                    list[++tos]=op;
                    break;
                }
            }
            return exp;
        }
        public char popOperator()
        {
            if(tos==-1)
            return '\0';

            return list[tos--];
        }
        public char topOfStack()
        {
            if(tos==-1)
            return '\0';

            return list[tos];
        }
        public int precedenceLevelOf(char op)
        {
            char operators1[]={'-','+'};
            char operators2[]={'X','/','%','^'};
            for(char i:operators1)
            {
                if(op==i)
                return 1;
            }

            for(char i:operators2)
            {
                if(op==i)
                return 2;
            }
            JOptionPane.showMessageDialog(CalculatorWindow.this,"Not found any operator","operator",JOptionPane.INFORMATION_MESSAGE);
            return 0;
        }
        public String popAll()
        {
            String exp="";
            while(this.tos!=-1)
            exp+=""+popOperator()+",";

            return exp;
        }
    }
    public class ButtonHandler implements ActionListener
    {
        public void setResult(String solvedResult)
        {
           /* if(solvedResult.charAt(solvedResult.length()-1)=='0'&&solvedResult.charAt(solvedResult.length()-2)=='.')
            {
                StringBuffer sb=new StringBuffer(solvedResult);
                sb.deleteCharAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                total.setText(""+sb);
                return;
            }*/
            
            try{
                double d=Double.parseDouble(solvedResult);
                total.setText(""+d);
            }
            catch(NumberFormatException msg)
            {
                total.setText(solvedResult);
            }

        }
        public void setAllDefault()
        {
            result=0;
            lastOprnd="";
            secondLastOprnd="";
            operator="";

        }
        public void reset()
        {
            inputBox.setText("0");
            setResult("");
            emptyFld=true;
            setAllDefault();
        }
        public boolean isDecimalEligible()
        {
            String exp=inputBox.getText();
            
            for(int i=exp.length()-1;i!=-1;i--)
            {
                if(isOperator(exp.charAt(i)))
                return true;
                else if(exp.charAt(i)=='.')
                return false;
            }
            return true;

        }
        public boolean isNum(char num)
        {
            if(num=='.')
            {
                return true;
            }

            try{
                int number=Integer.parseInt(""+num);
                return true;
            }
            catch(NumberFormatException ex)
            {
                return false;
            }
        }
        public boolean isOperator(char aop)
        {
            char[] op={'+','-','X','/','^','%'};
            for(char i:op)
            {
                if(i==aop)
                return true;
            }

            return false;
        }
        public boolean isValidExpression()
        {
            return true;
        }
        public String infixToPostfix(String infix)
        {
            OperatorStack stackList=new OperatorStack();
            if(!isValidExpression())
            return "";
            
            String postfix="";
            for(int i=0;i<infix.length();i++)
            {
                if(isNum(infix.charAt(i)))
                postfix+=""+infix.charAt(i);
                else if(isOperator(infix.charAt(i)))
                {
                    postfix+=",";
                    postfix+=stackList.pushOperator(infix.charAt(i));
                }
            }
            postfix+=",";
            postfix+=stackList.popAll();           
            return postfix;
        }
        public void calculate(String infix)
        {
            if(isOperator(infix.charAt(infix.length()-1)))
            {
                return;
            }
            
            String postfix=infixToPostfix(infix);
            String numbers[]=new String[10];
            int tos=-1;
            for(int i=0;i<postfix.length();i++)
            {
                String substr="";
                while(i<postfix.length())
                {
                    do
                    {
                        substr+=""+postfix.charAt(i);
                        i++;
                    }while(postfix.charAt(i)!=',');
                    
                    if(isOperator(substr.charAt(0)))
                    break;
                    else
                    {
                        numbers[++tos]=substr;
                        substr="";
                    }

                    i++;
                }
                if(tos==-1)
                break;
                
                double op1,op2;
                boolean op1flag=true,op2flag=true;
                try
                {
                    op2=Double.parseDouble(numbers[tos--]);
                }
                catch(NumberFormatException ex)
                {
                    op2=0;
                    op2flag=false;
                }


                if(tos==-1)
                {
                    setResult(""+op2);    
                    break;
                }
                
                try{
                    op1=Double.parseDouble(numbers[tos--]);
                }
                catch(NumberFormatException ex)
                {
                    op1=0;
                    op1flag=false;
                }

                if(op1flag&&op2flag)
                switch(substr)
                {
                    case "+":
                        result=op1+op2;
                        break;
                    case "-":
                        result=op1-op2;
                        break;
                    case "X":
                        result=op1*op2;
                        break;
                    case "/":
                        if(op2==0)
                        {
                            setResult("Cannot divided by zero");
                            secondLastOprnd="";
                            return;
                        }
                        result=op1/op2;
                        break;
                    case "^":
                        result=Math.pow(op1,op2);
                        break;
                    case "%":
                         result=(op1*op2)/100.0;
                         break;        
                }
                numbers[++tos]=""+result;
                setResult(""+result);
        
            }
        }
        public void actionPerformed(ActionEvent ev)
        {
            String clickedButton=ev.getActionCommand();
            String operation=inputBox.getText();
            //condition on first input
            
            if(isNum(clickedButton.charAt(0)))
            {
                if(clickedButton.charAt(0)=='.'&&(!isDecimalEligible()))
                return;

                if(clickedButton.equals("0")&&emptyFld)
                return; 

                if(emptyFld)
                {
                    operation=clickedButton;
                    emptyFld=false;
                }
                else
                operation+=clickedButton;
                inputBox.setText(operation);
            }
            else if(isOperator(clickedButton.charAt(0)))
            {
                if(emptyFld)
                {
                    inputBox.setText("0"+clickedButton);
                    emptyFld=false;
                    return;
                }

                //check is last character is operator or not.
                if(isOperator(operation.charAt(operation.length()-1)))
                return;

               
                operation+=clickedButton;
                inputBox.setText(operation);                
            }
            else
            switch(clickedButton)
            {
                case "C"://clear button handler
                            reset();
                            return;
                case "<-"://code for back button    
                            if(emptyFld)
                            return ;

                            StringBuffer sb=new StringBuffer(inputBox.getText());
                            sb.deleteCharAt(sb.length()-1);
                            //check the buffer is empty or not.
                            if(sb.isEmpty())
                            {
                                reset();
                            }
                            else
                            inputBox.setText(""+sb);

                            //re-calculating the result.
                            setAllDefault();
                            //if(!emptyFld)
                            calculate(""+sb);
                            return;
                case "="://code for result.
                            String tresult=total.getText();
                            setResult("");
                            inputBox.setText(tresult);
                            
                            
                            return;
                default://code for default
                            JOptionPane.showMessageDialog(CalculatorWindow.this,"button : "+clickedButton,"info",JOptionPane.INFORMATION_MESSAGE);

            }
            calculate(inputBox.getText());
            
        }
    }
    
}