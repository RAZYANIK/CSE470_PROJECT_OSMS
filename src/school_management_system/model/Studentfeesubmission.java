/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system;

import javax.swing.JOptionPane;


public class Studentfeesubmission extends javax.swing.JFrame {

    /**
     * Creates new form Studentfeesubmission
     */
    public Studentfeesubmission() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        admfee = new javax.swing.JTextField();
        sfee = new javax.swing.JTextField();
        mfee = new javax.swing.JTextField();
        efee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Student's Fee Counter");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Admission Fee:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Sports Fee:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Monthly Fee:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Extracurriculum Fee:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfeeActionPerformed(evt);
            }
        });

        efee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(371, 371, 371))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sfee, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admfee, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mfee, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(efee, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(efee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int af=Integer.parseInt(admfee.getText());
        int sf=Integer.parseInt(sfee.getText());
        int ef=Integer.parseInt(efee.getText());
        int mf=Integer.parseInt(mfee.getText());
        
        int total=af+sf+ef+mf;
        JOptionPane.showMessageDialog(rootPane, total+" taka only");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sfeeActionPerformed

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
            java.util.logging.Logger.getLogger(Studentfeesubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentfeesubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentfeesubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentfeesubmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentfeesubmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admfee;
    private javax.swing.JTextField efee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mfee;
    private javax.swing.JTextField sfee;
    // End of variables declaration//GEN-END:variables
}
