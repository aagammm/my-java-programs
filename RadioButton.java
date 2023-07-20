import javax.swing.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener
{
    double a,b,c;
    JLabel l1,l2,l3;
    JRadioButton r1,r2,r3;
    JTextField t1,t2;
    ButtonGroup group;

    public static void main(String args[])
    {
        RadioButton a=new RadioButton();
    }

    public RadioButton()
    {
        super("ADDITION,SUBTRACTION,MULTIPLICATION USING RADIOBUTTON");
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        l1=new JLabel("2nd NUMBER");
        l1.setBounds(20,40,100,30);
        add(l1);

        l2=new JLabel("1st NUMBER");
        l2.setBounds(20,80,100,30);
        add(l2);

        l3=new JLabel();
        l3.setBounds(20,190,100,30);
        add(l3);

        t1=new JTextField();
        t1.setBounds(130,40,100,30);
        add(t1);

        t2=new JTextField();
        t2.setBounds(130,80,100,30);
        add(t2);

        r1=new JRadioButton("ADD");
        r1.setBounds(20,110,100,30);
        add(r1);

        r2=new JRadioButton("SUBTRACT");
        r2.setBounds(130,110,100,30);
        add(r2);

        r3=new JRadioButton("MULTIPLY");
        r3.setBounds(230,110,100,30);
        add(r3);

        group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae)
        {
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());

            if(r1.isSelected())
            {
                c=a+b;
                l3.setText("RESULT OF ADDITION IS"+c);
            }
            if(r2.isSelected())
            {
                c=a-b;
                l3.setText("RESULT OF SUBTRACTION IS"+c);
            }
            if(r3.isSelected())
            {
                c=a*b;
                l3.setText("RESULT OF MULTIPLICATION IS"+c);
            }
        }

}