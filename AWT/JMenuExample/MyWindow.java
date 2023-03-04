import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class MyWindow extends JFrame{

    private JMenuBar menuBar;
    private JMenu fMenu,mMenu;
    private JMenuItem fMItem1,fMItem2,fMItem3,mMItem1,mMItem2,mMItem3;
    public MyWindow()
    {
        setTitle("Menu Example");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);

        fMenu=new JMenu("Female");
        mMenu=new JMenu("Male");

        menuBar.add(fMenu);
        menuBar.add(mMenu);

        fMItem1=new JMenuItem("Rhana");
        fMItem2=new JMenuItem("Suhani");
        fMItem3=new JMenuItem("Basanti");
        mMItem1=new JMenuItem("Rakesh");
        mMItem2=new JMenuItem("Abhishek");
        mMItem3=new JMenuItem("Piyush");

        fMenu.add(fMItem1);
        fMenu.add(fMItem2);
        fMenu.add(fMItem3);

        mMenu.add(mMItem1);
        mMenu.add(mMItem2);
        mMenu.add(mMItem3);

    mMItem1.addActionListener(new RakeshMenuItemHandler());


    }
    class RakeshMenuItemHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            JOptionPane.showMessageDialog(MyWindow.this,"Rakesh","Info",JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
}
