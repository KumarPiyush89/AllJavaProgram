import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import java.awt.GridLayout;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MyWindow extends JFrame {
    private JFormattedTextField jfet;
    public MyWindow()
    {
        setTitle("JFormattedTextField");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1));
        MaskFormatter mfmtr=null;
        try {
            mfmtr=new MaskFormatter("##########");
        } catch (ParseException ex) {
            // TODO: handle exception
            mfmtr=null;
        }        
        if(mfmtr!=null)
        jfet=new JFormattedTextField(mfmtr);
        else
        jfet=new JFormattedTextField();
        add(jfet);
    }
    
}
