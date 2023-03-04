import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
public class RakeshWindow extends JInternalFrame{
    public RakeshWindow()
    {
        setTitle("Rakesh");
        setSize(300,200);
        setClosable(true);
        setLayout(new GridLayout(1,1));
        JLabel lbl=new JLabel("Rakesh Kumar'a window");
        add(lbl);
    }
}
