import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rating extends JFrame implements ActionListener {
    Container c;
    JLabel lb1, lb2, lb3, lb4, lb5;
    JRadioButton rbtn1A, rbtn2A, rbtn3A, rbtn4A, rbtn5A, rbtn1B, rbtn2B, rbtn3B, rbtn4B, rbtn5B, rbtn1C, rbtn2C, rbtn3C,
            rbtn4C, rbtn5C, rbtn1D, rbtn2D, rbtn3D, rbtn4D, rbtn5D, rbtn1E, rbtn2E, rbtn3E, rbtn4E, rbtn5E;
    JButton btnSubmit, btnClear, btnExit;
    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();
    ButtonGroup bg4 = new ButtonGroup();
    ButtonGroup bg5 = new ButtonGroup();

    Rating() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        lb1 = new JLabel("1.Technicality");
        lb2 = new JLabel("2.Idea");
        lb3 = new JLabel("3.Presentation");
        lb4 = new JLabel("4.Knowledge");
        lb5 = new JLabel("5.Documentation");
        rbtn1A = new JRadioButton("1");
        rbtn2A = new JRadioButton("2");
        rbtn3A = new JRadioButton("3");
        rbtn4A = new JRadioButton("4");
        rbtn5A = new JRadioButton("5");
        rbtn1B = new JRadioButton("1");
        rbtn2B = new JRadioButton("2");
        rbtn3B = new JRadioButton("3");
        rbtn4B = new JRadioButton("4");
        rbtn5B = new JRadioButton("5");
        rbtn1C = new JRadioButton("1");
        rbtn2C = new JRadioButton("2");
        rbtn3C = new JRadioButton("3");
        rbtn4C = new JRadioButton("4");
        rbtn5C = new JRadioButton("5");
        rbtn1D = new JRadioButton("1");
        rbtn2D = new JRadioButton("2");
        rbtn3D = new JRadioButton("3");
        rbtn4D = new JRadioButton("4");
        rbtn5D = new JRadioButton("5");
        rbtn1E = new JRadioButton("1");
        rbtn2E = new JRadioButton("2");
        rbtn3E = new JRadioButton("3");
        rbtn4E = new JRadioButton("4");
        rbtn5E = new JRadioButton("5");
        bg.add(rbtn1A);
        bg.add(rbtn2A);
        bg.add(rbtn3A);
        bg.add(rbtn4A);
        bg.add(rbtn5A);

        bg2.add(rbtn1B);
        bg2.add(rbtn2B);
        bg2.add(rbtn3B);
        bg2.add(rbtn4B);
        bg2.add(rbtn5B);

        bg3.add(rbtn1C);
        bg3.add(rbtn2C);
        bg3.add(rbtn3C);
        bg3.add(rbtn4C);
        bg3.add(rbtn5C);

        bg4.add(rbtn1D);
        bg4.add(rbtn2D);
        bg4.add(rbtn3D);
        bg4.add(rbtn4D);
        bg4.add(rbtn5D);

        bg5.add(rbtn1E);
        bg5.add(rbtn2E);
        bg5.add(rbtn3E);
        bg5.add(rbtn4E);
        bg5.add(rbtn5E);
        btnSubmit = new JButton("SUBMIT");
        btnClear = new JButton("CLEAR");
        btnExit = new JButton("EXIT");

        c.setBackground(Color.LIGHT_GRAY);
        btnSubmit.setForeground(Color.BLUE);
        btnExit.setForeground(Color.RED);
        btnClear.setForeground(Color.BLACK);

        lb1.setBounds(10, 20, 150, 20);
        rbtn1A.setBounds(10, 50, 100, 20);
        rbtn2A.setBounds(120, 50, 100, 20);
        rbtn3A.setBounds(240, 50, 100, 20);
        rbtn4A.setBounds(360, 50, 100, 20);
        rbtn5A.setBounds(480, 50, 100, 20);

        lb2.setBounds(10, 90, 150, 20);
        rbtn1B.setBounds(10, 120, 100, 20);
        rbtn2B.setBounds(120, 120, 100, 20);
        rbtn3B.setBounds(240, 120, 100, 20);
        rbtn4B.setBounds(360, 120, 100, 20);
        rbtn5B.setBounds(480, 120, 100, 20);

        lb3.setBounds(10, 160, 150, 20);
        rbtn1C.setBounds(10, 190, 100, 20);
        rbtn2C.setBounds(120, 190, 100, 20);
        rbtn3C.setBounds(240, 190, 100, 20);
        rbtn4C.setBounds(360, 190, 100, 20);
        rbtn5C.setBounds(480, 190, 100, 20);

        lb4.setBounds(10, 230, 150, 20);
        rbtn1D.setBounds(10, 260, 100, 20);
        rbtn2D.setBounds(120, 260, 100, 20);
        rbtn3D.setBounds(240, 260, 100, 20);
        rbtn4D.setBounds(360, 260, 100, 20);
        rbtn5D.setBounds(480, 260, 100, 20);

        lb5.setBounds(10, 300, 150, 20);
        rbtn1E.setBounds(10, 330, 100, 20);
        rbtn2E.setBounds(120, 330, 100, 20);
        rbtn3E.setBounds(240, 330, 100, 20);
        rbtn4E.setBounds(360, 330, 100, 20);
        rbtn5E.setBounds(480, 330, 100, 20);

        btnSubmit.setBounds(30, 400, 100, 20);
        btnClear.setBounds(220, 400, 100, 20);
        btnExit.setBounds(410, 400, 100, 20);

        c.add(lb1);
        c.add(rbtn1A);
        c.add(rbtn2A);
        c.add(rbtn3A);
        c.add(rbtn4A);
        c.add(rbtn5A);
        c.add(lb2);
        c.add(rbtn1B);
        c.add(rbtn2B);
        c.add(rbtn3B);
        c.add(rbtn4B);
        c.add(rbtn5B);
        c.add(lb3);
        c.add(rbtn1C);
        c.add(rbtn2C);
        c.add(rbtn3C);
        c.add(rbtn4C);
        c.add(rbtn5C);
        c.add(lb4);
        c.add(rbtn1D);
        c.add(rbtn2D);
        c.add(rbtn3D);
        c.add(rbtn4D);
        c.add(rbtn5D);
        c.add(lb5);
        c.add(rbtn1E);
        c.add(rbtn2E);
        c.add(rbtn3E);
        c.add(rbtn4E);
        c.add(rbtn5E);
        c.add(btnSubmit);
        c.add(btnClear);
        c.add(btnExit);

        rbtn1A.addActionListener(this);
        rbtn2A.addActionListener(this);
        rbtn3A.addActionListener(this);
        rbtn4A.addActionListener(this);
        rbtn5A.addActionListener(this);
        rbtn1B.addActionListener(this);
        rbtn2B.addActionListener(this);
        rbtn3B.addActionListener(this);
        rbtn4B.addActionListener(this);
        rbtn5B.addActionListener(this);
        rbtn1C.addActionListener(this);
        rbtn2C.addActionListener(this);
        rbtn3C.addActionListener(this);
        rbtn4C.addActionListener(this);
        rbtn5C.addActionListener(this);
        rbtn1D.addActionListener(this);
        rbtn2D.addActionListener(this);
        rbtn3D.addActionListener(this);
        rbtn4D.addActionListener(this);
        rbtn5D.addActionListener(this);
        rbtn1E.addActionListener(this);
        rbtn2E.addActionListener(this);
        rbtn3E.addActionListener(this);
        rbtn4E.addActionListener(this);
        rbtn5E.addActionListener(this);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
    }

    Boolean count1 = false, count2 = false, count3 = false, count4 = false, count5 = false;

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnExit) {
            System.exit(0);
        } else if (ae.getSource() == btnClear) {
            bg.clearSelection();
            bg2.clearSelection();
            bg3.clearSelection();
            bg4.clearSelection();
            bg5.clearSelection();

        } else if ((ae.getSource() == rbtn1A || ae.getSource() == rbtn2A || ae.getSource() == rbtn3A
                || ae.getSource() == rbtn4A || ae.getSource() == rbtn5A))
            count1 = true;
        else if (ae.getSource() == rbtn1B || ae.getSource() == rbtn2B || ae.getSource() == rbtn3B
                || ae.getSource() == rbtn4B || ae.getSource() == rbtn5B)
            count2 = true;
        else if ((ae.getSource() == rbtn1C || ae.getSource() == rbtn2C || ae.getSource() == rbtn3C
                || ae.getSource() == rbtn4C || ae.getSource() == rbtn5C))
            count3 = true;
        else if ((ae.getSource() == rbtn1D || ae.getSource() == rbtn2D || ae.getSource() == rbtn3D
                || ae.getSource() == rbtn4D || ae.getSource() == rbtn5D))
            count4 = true;
        else if (ae.getSource() == rbtn1E || ae.getSource() == rbtn2E || ae.getSource() == rbtn3E
                || ae.getSource() == rbtn4E || ae.getSource() == rbtn5E)
            count5 = true;
        else if (ae.getSource() == btnSubmit && count1 == true && count2 == true && count3 == true && count4 == true
                && count5 == true) {
            JOptionPane.showMessageDialog(c, "Your Response Has Been Submitted");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Rating r = new Rating();
        r.setLayout(null);
        r.setVisible(true);
        r.setBounds(450, 100, 610, 500);
        r.setTitle("Feedback");
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}