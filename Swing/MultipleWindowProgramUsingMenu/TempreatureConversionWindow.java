import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TempreatureConversionWindow extends JInternalFrame
{
    private JRadioButton cel1,kel1,fah1,cel2,kel2,fah2;
    private ButtonGroup grp1,grp2;
    private JTextField txtFld1,txtFld2;
    private JLabel emptyLbl,lbl1,lbl2;
    public TempreatureConversionWindow()
    {
        setTitle("Tempreature Conversion");
        setSize(500,300);
        setLayout(new GridLayout(5,1));

        cel1=new JRadioButton("Celcius");
        cel1.setSelected(true);
        kel1=new JRadioButton("Kelvin");
        fah1=new JRadioButton("Fahrenhite");
        grp1=new ButtonGroup();
        grp1.add(cel1);
        grp1.add(kel1);
        grp1.add(fah1);
        Panel grp1Panel=new Panel();
        grp1Panel.setLayout(new GridLayout(1,3));
        grp1Panel.add(cel1);
        grp1Panel.add(kel1);
        grp1Panel.add(fah1);

        lbl1=new JLabel("Celcius : ");
        txtFld1=new JTextField("");
        Panel pnl=new Panel();
        pnl.setLayout(new GridLayout(1,2));
        pnl.add(lbl1);
        pnl.add(txtFld1);

            emptyLbl=new JLabel("");

        cel2=new JRadioButton("Celcius");
        cel2.setSelected(true);
        kel2=new JRadioButton("Kelvin");
        fah2=new JRadioButton("Fahrenhite");
        grp2=new ButtonGroup();
        grp2.add(cel2);
        grp2.add(kel2);
        grp2.add(fah2);
        Panel grp2Panel=new Panel();
        grp2Panel.setLayout(new GridLayout(1,3));
        grp2Panel.add(cel2);
        grp2Panel.add(kel2);
        grp2Panel.add(fah2);

        lbl2=new JLabel("Celcius : ");
        txtFld2=new JTextField("");
        Panel pnl2=new Panel();
        pnl2.setLayout(new GridLayout(1,2));
        pnl2.add(lbl2);
        pnl2.add(txtFld2);

        add(grp1Panel);
        add(pnl);
        add(emptyLbl);
        add(grp2Panel);
        add(pnl2);

    }
}