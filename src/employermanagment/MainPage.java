/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employermanagment;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class MainPage extends JFrame {
    
    private JPanel payRollPanel;
    private JPanel menuPanel;
    private JPanel mainPanel;
    private JLabel welcMassage;
    private JLabel id;
    private JLabel name;
    private JLabel department;
    private JTextField txtId;
    private JTextField txtname;
    private JTextField txtSearch;
    private JComboBox cmbDepartment;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnClear;
    private JButton btnClose;
    private JButton btnEmployeeTab;
    private EmployeePanel employeePanel = new EmployeePanel();
    
    Border blackline = BorderFactory.createLineBorder(Color.black);
    
    public MainPage() {
        
        super("Main screen");
        setLayout(null); // set layout too null

//        Init the component
        payRollPanel = new JPanel();
        menuPanel = new JPanel();
        mainPanel = new JPanel();
        
        menuPanel.setLayout(null);

//      set border to the panels
        payRollPanel.setBorder(blackline);
        menuPanel.setBorder(blackline);
        mainPanel.setBorder(blackline);
        employeePanel.setBorder(blackline);

//        Set bond to the panels
        payRollPanel.setBounds(0, 0, 800, 150);
        menuPanel.setBounds(0, 150, 200, 650);
        mainPanel.setBounds(200, 150, 600, 650);
        employeePanel.setBounds(200, 150, 600, 650);
        setBounds(200, 180, 0, 0);
        
        btnEmployeeTab = new JButton("Employee Manegment");
        btnEmployeeTab.setBounds(50, 50, 100, 30);
        btnEmployeeTab.setFocusable(false);
        btnEmployeeTab.addActionListener(e -> {
            mainPanel.setVisible(false);
            employeePanel.setVisible(true);
            
        });
        
        
        
        payRollPanel.setLayout(null);
        welcMassage = new JLabel("Employees Management");
        welcMassage.setFont(new Font (Font.SANS_SERIF,  Font.BOLD, 18));
        welcMassage.setBounds(300, 50, 250, 50);
        menuPanel.add(btnEmployeeTab);

//        Adding the panels to the Frame
        employeePanel.setVisible(false);
        add(employeePanel);
        
        payRollPanel.add(welcMassage);
        add(payRollPanel);
        add(menuPanel);
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setVisible(true);
    }
    
}
