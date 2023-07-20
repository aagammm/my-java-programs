import javax.swing.*;
import java.awt.event.*;

public class LabelButton extends JFrame implements ActionListener
{
    double a,b,c;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;

    public static void main(String args[])
    {
        LabelButton a=new LabelButton();
    }
    public LabelButton()
    {
        super("Additiom of two numbers");

        setVisible(true);
        setSize(400,400);

        l1=new JLabel("FIRST NUMBER");
        l1.setBounds(20,40,100,30);
        add(l1);

        l2=new JLabel("SECOND NUMBER");
        l2.setBounds(20,90,100,30);
        add(l2);

        l3=new JLabel();
        l3.setBounds(120,160,100,30);
        add(l3);

        t1=new JTextField();
        t1.setBounds(120,40,100,30);
        add(t1);

        t2=new JTextField();
        t2.setBounds(120,80,100,30);
        add(t2);

        b1=new JButton("ADD");
        b1.setBounds(20,140,100,30);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        a=Double.parseDouble(t1.getText());
        b=Double.parseDouble(t2.getText());
        c=a+b;
        l3.setText("Result of addition is"+c);
    }
}