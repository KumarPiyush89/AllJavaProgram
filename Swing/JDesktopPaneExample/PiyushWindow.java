import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
public class PiyushWindow extends JInternalFrame{
    public PiyushWindow()
    {
        setTitle("Piyush");
        setSize(300,200);
        setLayout(new GridLayout(1,1));
        JLabel lbl=new JLabel("Piyush kumar'a window");
        add(lbl);
    }
    
}
