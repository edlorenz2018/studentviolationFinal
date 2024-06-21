/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dean;

import config.dbConnector;
import javax.swing.JOptionPane;
import sao.saoDashboard;

/**
 *
 * @author NiQby
 */
public class editDashboard extends javax.swing.JFrame {

    /**
     * Creates new form editDashboard
     */
    public editDashboard() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bee_fn = new javax.swing.JTextField();
        bee_ln = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bee_section = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        bee_sanction = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        bee_type = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        bee_course = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bee_violation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-94.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 20, 94, 94);

        accname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        accname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accname.setText("FIRST NAME");
        jPanel2.add(accname);
        accname.setBounds(0, 110, 180, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("DEAN");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 150, 50, 14);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setText("BACK");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 0, 40, 20);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 440, 80, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 180, 460);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("STUDENT VIOLATION MANAGEMENT SYSTEM");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(10, 0, 585, 50);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(10, 20, 600, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(280, 0, 290, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 290, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(340, 0, 290, 90);

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 3, 14)); // NOI18N
        jLabel15.setText("STUDENT VIOLATION MANAGEMENT SYSTEM");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 340, 17);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(-1, 0, 620, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/objects (1).jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 290, 90);

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel21.setText("FIRST NAME");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(30, 100, 83, 30);

        bee_fn.setEnabled(false);
        jPanel3.add(bee_fn);
        bee_fn.setBounds(30, 130, 180, 30);

        bee_ln.setEnabled(false);
        jPanel3.add(bee_ln);
        bee_ln.setBounds(30, 190, 180, 30);

        jLabel22.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel22.setText("LAST NAME");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(30, 160, 78, 30);

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel23.setText("COURSE");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(30, 220, 60, 30);

        bee_section.setEnabled(false);
        jPanel3.add(bee_section);
        bee_section.setBounds(30, 310, 180, 30);

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel24.setText("SECTION");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(30, 280, 83, 30);

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel25.setText("VIOLATION");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(380, 110, 83, 30);
        jPanel3.add(bee_sanction);
        bee_sanction.setBounds(380, 270, 180, 30);

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel26.setText("SANCTION");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(380, 250, 83, 20);

        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel27.setText("TYPE OF OFFENSE");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(380, 310, 130, 20);

        bee_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minor Offense", "Major Offense" }));
        jPanel3.add(bee_type);
        bee_type.setBounds(380, 330, 180, 20);

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(470, 370, 100, 23);

        bee_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEED", "BSIT", "BSHM", "BSED", "BSCRIM", "BSTM", "BSBA" }));
        bee_course.setEnabled(false);
        jPanel3.add(bee_course);
        bee_course.setBounds(30, 250, 180, 30);

        bee_violation.setColumns(20);
        bee_violation.setRows(5);
        jScrollPane1.setViewportView(bee_violation);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(380, 140, 230, 100);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(180, 0, 620, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
      editStudents eds = new editStudents();
      eds.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(editDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    public javax.swing.JComboBox<String> bee_course;
    public javax.swing.JTextField bee_fn;
    public javax.swing.JTextField bee_ln;
    public javax.swing.JTextField bee_sanction;
    public javax.swing.JTextField bee_section;
    public javax.swing.JComboBox<String> bee_type;
    public javax.swing.JTextArea bee_violation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
