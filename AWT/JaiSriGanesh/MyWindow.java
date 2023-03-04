import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Font;
public class MyWindow extends Frame
{
    private Label l1;
    private Label l2;
    private TextField t1;
    private TextField t2;
    private Font f;

    public MyWindow()
    {
        super("Jai Sri Ganesh");
        setSize(500,500);
        l1=new Label("Enter your name");
        l2=new Label("Enter age:");
        t1=new TextField();
        t2=new TextField();
        f=new Font("Times New Roman",Font.BOLD,20);
        l1.setFont(f);
        l2.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        setLayout(new GridLayout(2,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }
}