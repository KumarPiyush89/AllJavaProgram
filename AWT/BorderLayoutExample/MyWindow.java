import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class MyWindow extends JFrame {
    public MyWindow()
    {
        setTitle("BorderLayout Example");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new JLabel("North"),BorderLayout.NORTH);
        add(new JLabel("South"),BorderLayout.SOUTH);
        add(new JLabel("East"),BorderLayout.EAST);
        add(new JLabel("West"),BorderLayout.WEST);
        add(new JLabel("Center"),BorderLayout.CENTER);

    }
    
}
