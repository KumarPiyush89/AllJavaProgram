import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window1 extends JFrame
{
    private JButton b1,b2,b3;
    private Window2 w2;
    private Window3 w3;
    private Window4 w4;
    public Window1()
    {
        setTitle("Window 1");
        setSize(600,300);
        setLayout(new GridLayout(3,1));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("Window 2");
        b2=new JButton("Window 3");
        b3=new JButton("Window 4");

        add(b1);
        add(b2);
        add(b3);

        //register buttons for actionListener
        b1.addActionListener(new Button1Handler());
        b2.addActionListener(new Button2Handler());
        b3.addActionListener(new Button3Handler());
         w2=null;
         w3=null;
         w4=null;

    }
    class Button1Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev)
        {
           // JOptionPane.showMessageDialog(Window1.this,"I will open window 1","Test",JOptionPane.INFORMATION_MESSAGE);
            if(w2==null)
            w2=new Window2();
            
            w2.setVisible(true);
        }
    }

    class Button2Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev)
        {
            //JOptionPane.showMessageDialog(Window1.this,"I will open window 2","Test",JOptionPane.INFORMATION_MESSAGE);
            if(w3==null)
            w3=new Window3();

            w3.setVisible(true);
        }
    }

    class Button3Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev)
        {
            //JOptionPane.showMessageDialog(Window1.this,"I will open window 3","Test",JOptionPane.INFORMATION_MESSAGE);
            if(w4==null)
            w4=new Window4();

            w4.setVisible(true);
            
        }
    }
}