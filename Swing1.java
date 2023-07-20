import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame.*;
import java.awt.*;

public class Swing1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4;
    JButton b1;
    ButtonGroup group;

    public static void main(String args[])
    {
            Swing1 a=new Swing1();
    }

    public Swing1()
    {
        super("STUDENT'S DETAILS");

        setVisible(true);
        setSize(700,700);
        setLayout(null);

        l1=new JLabel("NAME");
        l1.setBounds(20,40,100,40);
        add(l1);

        l2=new JLabel("STREET");
        l2.setBounds(20,90,100,40);
        add(l2);

        l3=new JLabel("CITY");
        l3.setBounds(20,140,100,40);
        add(l3);

        l4=new JLabel("PINCODE");
        l4.setBounds(20,190,100,40);
        add(l4);

        l5=new JLabel();
        l5.setBounds(225,250,150,80);
        add(l5);

        l6=new JLabel();
        l6.setBounds(225,350,150,80);
        add(l6);

        l7=new JLabel();
        l7.setBounds(225,450,150,80);
        add(l7);

        l8=new JLabel();
        l8.setBounds(225,550,150,80);
        add(l8);

        t1=new JTextField();
        t1.setBounds(150,40,100,40);
        add(t1);

        t2=new JTextField();
        t2.setBounds(150,90,100,40);
        add(t2);

        t3=new JTextField();
        t3.setBounds(150,140,100,40);
        add(t3);

        t4=new JTextField();
        t4.setBounds(150,190,100,40);
        add(t4);

        b1=new JButton("MyInfo");
        b1.setBounds(20,220,100,40);
        add(b1);

        group=new ButtonGroup();
        group.add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
         
            String name=t1.getText();
            String street=t2.getText();
            String city=t3.getText();
            String pincode=t4.getText();
                   
                l5.setText(name);
                l6.setText(street);
                l7.setText(city);
                l8.setText(pincode);
            


    }

}

