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



public class MainWIndow extends Frame{

    private  Label l1;
    private  Label l2;
    private  Label l3;
    private Label SimpleIntrest;
   private TextField n1,n2,n3;
   private Button printBtn,resetBtn;
   public MainWIndow()
   {
       super("SimpleIntrest");
       setSize(700,700);
       setResizable(false);
       Font f=new Font("TImes New Roman",Font.BOLD,20);
       setLayout(new GridLayout(1,1));
       
       l1=new Label("Enter Principal Amount");
       l1.setFont(f);
       n1=new TextField("");
       n1.setFont(f);
       
       l2=new Label("Enter rate Of Intrest");
       n2=new TextField("");
       l2.setFont(f);
       n2.setFont(f);
       
       
       l3=new Label("Enter Time");
       n3=new TextField("");
       l3.setFont(f);
       n3.setFont(f);
       
       printBtn=new Button("Print");
       printBtn.setFont(f);
       printBtn=new Button("Reset");
       printBtn.setFont(f);
       
       Panel top=new Panel();
       top.setLayout(new GridLayout(4,4));
       top.add(l1);
       top.add(n1);
       top.add(l2);
       top.add(n2);
       top.add(l3);
       top.add(n3);
       top.add(printBtn);
       top.add(resetBtn);
       add(top);
       
        //register this window for windowListener
        addWindowListener( new WindowHandler());
        printBtn.addActionListener(new PrintButtonHandler());
   }
   class WindowHandler implements WindowListener
   {

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           int pa = 0,time = 0;
           int rate = 0,si;
           try
           {
           
           si=(pa*rate*time)/100;
           SimpleIntrest.setText(si+"");
           }catch(NumberFormatException ex)
           {
               SimpleIntrest.setText("Plese Inter a Valid Number");
           }
        }
        
    }    
    
}
