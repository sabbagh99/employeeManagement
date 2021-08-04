/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employermanagment;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class EmployeePanel extends javax.swing.JPanel {

    /**
     * Creates new form employeePanel
     */
    public EmployeePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbDepartment = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtId = new javax.swing.JFormattedTextField();
        btnView = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setText("ID:");
        add(jLabel1);
        jLabel1.setBounds(15, 19, 23, 20);

        jLabel2.setText("Name:");
        add(jLabel2);
        jLabel2.setBounds(15, 61, 47, 20);

        jLabel3.setText("Department :");
        add(jLabel3);
        jLabel3.setBounds(15, 104, 94, 20);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(140, 60, 82, 26);

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "IT", "Manegment", "Sales" }));
        add(cmbDepartment);
        cmbDepartment.setBounds(140, 100, 120, 26);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(414, 100, 79, 29);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 548, 130);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(10, 330, 61, 29);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(90, 330, 83, 29);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(200, 330, 77, 29);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        add(btnClose);
        btnClose.setBounds(480, 330, 71, 29);

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        add(txtId);
        txtId.setBounds(140, 20, 80, 26);

        btnView.setText("View");
        add(btnView);
        btnView.setBounds(390, 330, 67, 29);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        add(btnClear);
        btnClear.setBounds(300, 330, 70, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddDialog addDialog = new AddDialog(new javax.swing.JFrame(), true);
        addDialog.setBounds(200, 200, 0, 0);
        addDialog.setSize(500, 550);
        addDialog.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            // TODO add your handling code here:

            AddDialog addDialog = new AddDialog();
            File file = new File("allUsersObject.txt");

            list = addDialog.read(file);
            tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.setRowCount(0);
            for (User oneUser : list) {

                if ((checkIdText() == oneUser.getId()) || (txtName.getText().equals(oneUser.getName())) || (cmbDepartment.getSelectedItem().toString().equals(oneUser.getDepartment()))) {
                    String userData[] = {String.valueOf(oneUser.getId()), oneUser.getName(), oneUser.getDepartment()};
                    tableModel.addRow(userData);

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:

        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRowCount() == 1) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    updatedUser = new User();
                    updatedUser.setName(list.get(i).getName());
                    updatedUser.setId(list.get(i).getId());
                    updatedUser.setAddress(list.get(i).getAddress());
                    updatedUser.setDepartment(list.get(i).getDepartment());
                    updatedUser.setStatus(list.get(i).getStatus());
                    updatedUser.setGender(list.get(i).getGender());
                    updatedUser.setBarthDate(list.get(i).getBarthDate());


                    UpdateDialog updateDialog = new UpdateDialog(new javax.swing.JFrame(), true);
                    updateDialog.setBounds(200, 200, 0, 0);
                    updateDialog.setSize(500, 550);
                    updateDialog.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "please select only one  user to update");

        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        tableModel = (DefaultTableModel) jTable1.getModel();
        id = Long.valueOf(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Please enter a number");
            evt.consume();
        }

    }//GEN-LAST:event_txtIdKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        tableModel = (DefaultTableModel) jTable1.getModel();
        try {
            File file = new File("allUsersObject.txt");

            if (jTable1.getSelectedRowCount() == 1) {

                tableModel.removeRow(jTable1.getSelectedRow());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() == id) {
                        list.remove(i);
                        System.out.println("User deleted");
                    }
                }
                delete(file);
                this.repaint();
            } else {
                if (jTable1.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Table is empty...!");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select single row to delete ");
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRowCount() == 0) {
            tableModel.setRowCount(0);
        }

    }//GEN-LAST:event_btnClearActionPerformed

    public long checkIdText() {
        long temp = 0;
        if (txtId.getText().equals("")) {
            temp = -1;
        } else {
            temp = Integer.valueOf(txtId.getText());
        }
        return temp;
    }

    public void delete(File file) throws Exception {
        FileOutputStream fileOut = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fileOut);
        for (User oneUser : list) {
            oos.writeObject(oneUser);
        }
        oos.close();

    }

    private long id;
    private String tblDepatment = "";
    private List<User> list;
    private DefaultTableModel tableModel;
    public static User updatedUser;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}