
import java.awt.*;
import java.awt.event.*;
public class MyWindow extends Frame 
{
private Label l1,l2,l3,result;
private TextField n1,n2;
private Font f;
private Button resetBtn,resultBtn;
public MyWindow()
{
    super("Multiplication");
    setSize(400,200);
    setLayout(new GridLayout(4,2));
    f=new Font("Times New Roman",Font.BOLD,20);
    l1=new Label("Enter 1st number");
    l1.setFont(f);
    l2=new Label("Enter 2nd number:");
    l2.setFont(f);
    l3=new Label("Result:");
    l3.setFont(f);
    result=new Label("");
    result.setFont(f);
    n1=new TextField("");
    n1.setFont(f);
    n2=new TextField("");
    n2.setFont(f);
    resetBtn=new Button("Reset");
    resetBtn.setFont(f);
    resultBtn=new Button("Get Result");
    resultBtn.setFont(f);

    //add all component to this container
    add(l1);
    add(n1);
    add(l2);
    add(n2);
    add(l3);
    add(result);
    add(resetBtn);
    add(resultBtn);
    //register component with event listener
    resultBtn.addActionListener(new ResetButtonHandler());
    //register tis window for window listener
    this.addWindowListener(new WindowHandler());
}
class ResetButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        //read data from both input box
        double v1=0,v2=0,r;
        try{
            v1=Double.parseDouble(n1.getText());
            v2=Double.parseDouble(n2.getText());
        }catch(NumberFormatException ex)
        {
            v1=0;
            v2=0;
        }
        r=v1*v2;
        //set result on label
        result.setText(r+"");

    }
}

class WindowHandler implements WindowListener 
{
    public void windowActivated(WindowEvent we)
    {

    }
    public void windowDeactivated(WindowEvent we)
    {

    
    }
    public void windowOpened(WindowEvent we)
    {

    }
    public void windowClosed(WindowEvent we)
    {

    }
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
    public void windowIconified(WindowEvent we)
    {

    }
    public void windowDeiconified(WindowEvent we)
    {

    }



}
}