import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
public class MainWindow extends JFrame{
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem mItem1,mItem2,mItem3;
    private JDesktopPane desktopPane;
    private RakeshWindow rw=null;
    private AnkitWindow aw=null;
    private PiyushWindow pw=null;
    public MainWindow()
    {
        setTitle("JDesktopPane");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        menu=new JMenu("Persons");

        mItem1=new JMenuItem("Rakesh");
        mItem2=new JMenuItem("Piyush");
        mItem3=new JMenuItem("Ankit");

        menu.add(mItem1);
        menu.add(mItem2);
        menu.add(mItem3);

        menuBar.add(menu);

        desktopPane=new JDesktopPane();
        setContentPane(desktopPane);

        mItem1.addActionListener(new MenuItem1Handler());
        mItem2.addActionListener(new MenuItem2Handler());
        mItem3.addActionListener(new MenuItem3Handler());




    }
    class MenuItem1Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(rw==null)
            { 
                rw=new RakeshWindow();
                desktopPane.add(rw);
                rw.setVisible(true);

            }
            else{
                rw.setVisible(true);
            }
        }
    }
    
    class MenuItem2Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(pw==null)
            { 
                pw=new PiyushWindow();
                desktopPane.add(pw);
                pw.setVisible(true);

            }
            else{
                pw.setVisible(true);
            }
        }
    }
    class MenuItem3Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(aw==null)
            { 
                aw=new AnkitWindow();
                desktopPane.add(aw);
                aw.setVisible(true);

            }
            else{
                aw.setVisible(true);
            }
        }
    }
}
