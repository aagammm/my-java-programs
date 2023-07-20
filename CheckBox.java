import javax.swing.*;
import java.awt.event.*;

public class CheckBox extends JFrame implements ItemListener
{
    double a,b,c;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JCheckBox c1,c2,c3;

    public static void main(String args[])
    {
        CheckBox a=new CheckBox();
    }

    public CheckBox()
    {
        
        super("ADDITION,SUBTRACTION,MULTIPLICATION USING CHECKBOX");
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        l1=new JLabel("FIRST NUMBER");
        l1.setBounds(20,50,100,30);
        add(l1);

        l2=new JLabel("SECOND NUMBER");
        l2.setBounds(20,90,100,30);
        add(l2);

        l3=new JLabel();
        l3.setBounds(20,200,100,30);
        add(l3);

        l4=new JLabel();
        l4.setBounds(20,230,100,30);
        add(l4);

        l5=new JLabel();
        l5.setBounds(20,260,100,30);
        add(l5);

        t1=new JTextField();
        t1.setBounds(120,50,100,30);
        add(t1);

        t2=new JTextField();
        t2.setBounds(120,90,100,30);
        add(t2);

        c1=new JCheckBox("ADD");
        c1.setBounds(20,140,100,30);
        add(c1);
        
        c2=new JCheckBox("SUBTRACT");
        c2.setBounds(120,140,100,30);
        add(c2);

        c3=new JCheckBox("MULTIPLY");
        c3.setBounds(220,140,100,30);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        a=Double.parseDouble(t1.getText());
        b=Double.parseDouble(t2.getText());

        if(ie.getSource()==c1)
            if(ie.getStateChange()==1)
            {
                c=a+b;
                l3.setText("result of addition is "+c);
            }
            else
                l3.setText("");

        if(ie.getSource()==c2)
            if(ie.getStateChange()==1)
            {
                c=a-b;
                l4.setText("result of subtraction is "+c);
            }
            else
                l4.setText("");
        
        if(ie.getSource()==c3)
            if(ie.getStateChange()==1)
            {
                c=a*b;
                l5.setText("Result of multiplication is "+c);
            }
            else
                l5.setText("");

    }


    }

