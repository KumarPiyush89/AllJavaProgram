/*
 * Event Handling in Java
An event can be defined as changing the state of an object or behavior by performing actions. Actions can be a button click, cursor movement, keypress through keyboard or page scrolling, etc. 

The java.awt.event package can be used to provide various event classes. 

Classification of Events
Foreground Events
Background Events


Types of Events

1. Foreground Events
Foreground events are the events that require user interaction to generate, i.e., foreground events are generated due to interaction by the user on components in Graphic User Interface (GUI). Interactions are nothing but clicking on a button, scrolling the scroll bar, cursor moments, etc.

2. Background Events
Events that don’t require interactions of users to generate are known as background events. Examples of these events are operating system failures/interrupts, operation completion, etc.



Event Handling
It is a mechanism to control the events and to decide what should happen after an event occur. To handle the events, Java follows the Delegation Event model
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display extends JFrame
{
    private JLabel lbl;
    private JButton btn;
    private JTextField inputFld;
    private JRadioButton yesBtn,noBtn;
    private ButtonGroup yesNoBtnGroup;
    public Display()
    {
        super("display example");
        setLayout(new GridLayout(4,1));
        setSize(600,600);
        btn=new JButton("click here");
        inputFld=new JTextField("");
        lbl=new JLabel("");
        //inputFld.set(10)
        
        yesNoBtnGroup=new ButtonGroup();
        yesBtn=new JRadioButton("yes");
        yesBtn.setSelected(true);
        noBtn=new JRadioButton("no");
        yesNoBtnGroup.add(yesBtn);
        yesNoBtnGroup.add(noBtn);
        JPanel btnPanel =new JPanel(new GridLayout(1,2));
        btnPanel.add(yesBtn);
        btnPanel.add(noBtn);
        

        add(btnPanel);
        add(lbl);
        add(inputFld);
        add(btn);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new DisplayText());
        inputFld.addKeyListener(new InputfldHandler());
    }
    public class InputfldHandler implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent kv)
        {
            lbl.setText(lbl.getText()+"\n key pressed."+kv.getKeyCode());
            //kv.setKeyCode(0);
        }
        @Override
        public void keyReleased(KeyEvent kv)
        {
            lbl.setText(lbl.getText()+"\n key released.");
        }
        @Override
        public void keyTyped(KeyEvent kv)
        {
            lbl.setText(lbl.getText()+"\n key typed.");
            if(inputFld.getText().length()>10)
            inputFld.setText(inputFld.getText().substring(0,inputFld.getText().length()-1));
            //kv.setKeyCode(0);
        }
    }
    public class DisplayText implements ActionListener
    {
        public void actionPerformed(ActionEvent av)
        {
            JOptionPane.showMessageDialog(Display.this,inputFld.getText(),"Display example",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}