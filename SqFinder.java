import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SqFinder extends JFrame implements ActionListener {
    Container c;
    JTextField txt1;
    JButton btn1;
    JLabel lb1, lb2;

    SqFinder() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        lb1 = new JLabel("Enter a number");
        txt1 = new JTextField(10);
        btn1 = new JButton("Answer");
        lb2 = new JLabel();
        c.add(lb1);
        c.add(txt1);
        c.add(btn1);
        c.add(lb2);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(txt1.getText());
        float s = a * a;
        lb2.setText("SQUARE:" + s);
    }

    public static void main(String[] args) {
        SqFinder sq = new SqFinder();

        sq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sq.setBounds(200, 200, 250, 150);
        sq.setTitle("Square Finder");
        sq.setVisible(true);

    }
}