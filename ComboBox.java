import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener
{
    JLabel l1,l2;
    JComboBox c1;
    String s1[]={"YASH","MANN","AAGAM","ANAND"};

    public static void main(String args[])
    {
        ComboBox a=new ComboBox();
    }
    public ComboBox()
    {
        super("USING COMBO BOX");
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        l1=new JLabel("Choose a buddy.");
        l1.setBounds(20,40,200,30);
        add(l1);

        l2=new JLabel();
        l2.setBounds(20,140,200,30);
        add(l2);

        c1=new JComboBox(s1);
        c1.setBounds(20,80,100,30);
        add(c1);

        c1.addItemListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void itemStateChanged(ItemEvent ie)
        {
            if(ie.getSource()==c1)
            {
                l2.setText("Selected buddy is"+c1.getSelectedItem());
            }
        }
}