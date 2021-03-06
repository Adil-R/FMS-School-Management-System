/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.sql.SQLException;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewTerm extends javax.swing.JFrame {

    /**
     * Creates new form NewTerm
     */
    
    private static int userid;
    private static int schoolid;
    
    
    public NewTerm() {
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

        jPanel1 = new javax.swing.JPanel();
        jstartdate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jclosedate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbtermname = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaremarks = new javax.swing.JTextArea();
        jbtsave = new javax.swing.JButton();
        jbtcancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Term Details");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel4.setForeground(new java.awt.Color(0, 0, 240));
        jLabel4.setText("Important Remarks");

        jLabel5.setForeground(new java.awt.Color(0, 0, 240));
        jLabel5.setText("Closing Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter The Term Details");

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Term Name");

        cmbtermname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "First Term", "Second Term", "Third Term" }));

        jtaremarks.setColumns(20);
        jtaremarks.setRows(5);
        jScrollPane2.setViewportView(jtaremarks);

        jbtsave.setText("Save");
        jbtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsaveActionPerformed(evt);
            }
        });

        jbtcancel.setText("Cancel");
        jbtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancelActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 240));
        jLabel7.setText("Start Date");

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbtermname, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtcancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnok)
                        .addGap(200, 200, 200)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtsave)
                    .addComponent(jclosedate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jstartdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbtermname)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jclosedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtcancel)
                    .addComponent(jbtsave)
                    .addComponent(btnok))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtcancelActionPerformed

    private void jbtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsaveActionPerformed
        // TODO add your handling code here:
        String name,starts,ends,remarks;
        String year;
        remarks = null;
        starts = null;
        ends = null;
        
        name = cmbtermname.getSelectedItem().toString().toUpperCase();
        java.util.Date utildate;
        utildate = jstartdate.getDate();;
        
        if(utildate!=null)
        {
        java.sql.Date sqldate = new java.sql.Date(utildate.getYear(),utildate.getMonth(),utildate.getDate());
        starts = sqldate.toString();
        }
        
        java.util.Date utilclosedate;
        utilclosedate = jclosedate.getDate();
        
        if(utilclosedate!=null)
        {
        java.sql.Date sqlclosedate = new java.sql.Date(utilclosedate.getYear(),utilclosedate.getMonth(),utilclosedate.getDate());
        ends = sqlclosedate.toString();
        }
        
        year = selects.QueryMainDetails.getCurrentYear();
        remarks = jtaremarks.getText();
        if(name == null||"".equals(name)||cmbtermname.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Term Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(starts==null||"".equals(starts))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Terms Starting Date to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(ends==null||"".equals(ends))
        {
             JOptionPane.showMessageDialog(null,
                        "Please Enter Terms Closing Date to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try {
               sqlinserts.NewTerm.createnewTerm(name, starts, ends, year, remarks);
                JOptionPane.showMessageDialog(null, "New Term Details Have been Saved \n" +
                        "Press Ok to Continue", "Success", JOptionPane.INFORMATION_MESSAGE);
                btnok.setEnabled(true);
            } catch (SQLException ex) {
                if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Term You are Trying to Create Has Already Been Created Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                        "Please contact the system administrator", "Error ", JOptionPane.ERROR_MESSAGE);
                }
                this.hide();
            }
        }
        
    }//GEN-LAST:event_jbtsaveActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewTerm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTerm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTerm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTerm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewTerm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbtermname;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtcancel;
    private javax.swing.JButton jbtsave;
    private com.toedter.calendar.JDateChooser jclosedate;
    private com.toedter.calendar.JDateChooser jstartdate;
    private javax.swing.JTextArea jtaremarks;
    // End of variables declaration//GEN-END:variables
}
