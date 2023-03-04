import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
public class AnkitWindow extends JInternalFrame {
    public AnkitWindow()
    {
        setTitle("Ankit");
        setSize(300,200);
        setLayout(new GridLayout(1,1));
        JLabel lbl=new JLabel("Ankit Kumar'a window");
        add(lbl);
    }
    
}
