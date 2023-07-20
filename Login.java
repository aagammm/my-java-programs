import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener {
    Container c;
    JLabel lbUsername, lbPassword;
    JTextField txtUsername;
    JTextField txtPassword;
    JButton btnSubmit, btnClear, btnExit;
    String strUsername, strPassword;

    Login() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        lbUsername = new JLabel("Enter Username");
        lbPassword = new JLabel("Enter Password");
        txtUsername = new JTextField(10);
        txtPassword = new JTextField(10);
        // txtPassword.setEchoChar('*');
        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        c.add(lbUsername);
        c.add(txtUsername);
        c.add(lbPassword);
        c.add(txtPassword);
        c.add(btnSubmit);
        c.add(btnClear);
        c.add(btnExit);
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSubmit) {
            strUsername = txtUsername.getText();
            strPassword = txtPassword.getText();
            if (strUsername.equals("aagam") && strPassword.equals("123")) {
                JOptionPane.showMessageDialog(c, "Succesful Login");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(c, "Unsuccesful Login");
                txtUsername.setText("");
                txtPassword.setText("");
                txtUsername.requestFocus();
            }
        } else if (ae.getSource() == btnClear) {
            txtUsername.setText("");
            txtPassword.setText("");
            txtUsername.requestFocus();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
        l.setBounds(200, 200, 250, 150);
        l.setTitle("Login");

    }
}