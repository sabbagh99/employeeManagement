/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package employermanagment;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class LoginPage extends JFrame {

    private JLabel userName;
    private JLabel password;
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;
    private String loginUserName;
    private String loginPassWord;

    public LoginPage() throws Exception {
        super("Login Page"); // title for the frame
        setLayout(null); // set the layout to null
// Init the component
        userName = new JLabel("UserName");
        password = new JLabel("Password");
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        txtUserName = new JTextField();
        txtPassword = new JPasswordField();

// set Boundes for component
        txtUserName.setBounds(200, 70, 215, 40);
        txtPassword.setBounds(200, 120, 215, 40);
        userName.setBounds(130, 70, 170, 40);
        password.setBounds(130, 120, 170, 40);
        btnLogin.setBounds(200, 220, 100, 50);
        btnCancel.setBounds(310, 220, 100, 50);

// add action Lisnenr to the button
        btnLogin.addActionListener(e -> {
            if (String.valueOf(txtUserName.getText()).equals(loginUserName) && String.valueOf(txtPassword.getPassword()).equals(loginPassWord)) {

                new MainPage();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Username or Password");
            }
           
        });

        btnCancel.addActionListener(e -> {
            dispose();
        });

// add component to the frame
        add(userName);
        add(password);
        add(txtUserName);
        add(txtPassword);
        add(btnLogin);
        add(btnCancel);
        setBounds(200, 200, 0, 0);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600, 350);
        setVisible(true);

        readFile();
    }

    public void readFile() throws Exception {
        FileReader file = new FileReader("user.txt");
        BufferedReader bufferedReader = new BufferedReader(file);

        loginUserName = bufferedReader.readLine();
        loginPassWord = bufferedReader.readLine();
    }

}
