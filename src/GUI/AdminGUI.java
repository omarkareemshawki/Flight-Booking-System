/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Ze2reda
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminGUI
     */
    public AdminGUI() {
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
        UsernameLable = new javax.swing.JLabel();
        UsernameLable1 = new javax.swing.JLabel();
        UpdateFlightButton = new javax.swing.JButton();
        AddFlightButton = new javax.swing.JButton();
        RemoveFlightButton = new javax.swing.JButton();
        UpdateBookingButton = new javax.swing.JButton();
        RemoveBookingButton = new javax.swing.JButton();
        CreateReportButton = new javax.swing.JButton();
        AddBooking = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsernameLable.setFont(new java.awt.Font("Javanese Text", 3, 24)); // NOI18N
        UsernameLable.setText("What do you wanna do?");

        UsernameLable1.setFont(new java.awt.Font("Javanese Text", 3, 30)); // NOI18N
        UsernameLable1.setText("Welcome Admin");

        UpdateFlightButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        UpdateFlightButton.setText("Update Flight");
        UpdateFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateFlightButtonActionPerformed(evt);
            }
        });

        AddFlightButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        AddFlightButton.setText("Add Flight");
        AddFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlightButtonActionPerformed(evt);
            }
        });

        RemoveFlightButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        RemoveFlightButton.setText("Remove Flight");
        RemoveFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFlightButtonActionPerformed(evt);
            }
        });

        UpdateBookingButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        UpdateBookingButton.setText("Update Booking");
        UpdateBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBookingButtonActionPerformed(evt);
            }
        });

        RemoveBookingButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        RemoveBookingButton.setText("Remove Booking");
        RemoveBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBookingButtonActionPerformed(evt);
            }
        });

        CreateReportButton.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        CreateReportButton.setText("Generate Report");
        CreateReportButton.setToolTipText("");
        CreateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateReportButtonActionPerformed(evt);
            }
        });

        AddBooking.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        AddBooking.setText("Add Booking");
        AddBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookingActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(102, 153, 255));
        LogoutButton.setFont(new java.awt.Font("Californian FB", 1, 16)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(UsernameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CreateReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RemoveBookingButton, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RemoveFlightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpdateBookingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateFlightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(214, 214, 214)
                    .addComponent(UsernameLable1)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(UsernameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CreateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(UsernameLable1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateFlightButtonActionPerformed
       
    }//GEN-LAST:event_UpdateFlightButtonActionPerformed

    private void AddFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlightButtonActionPerformed
        
    }//GEN-LAST:event_AddFlightButtonActionPerformed

    private void RemoveFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFlightButtonActionPerformed
        
    }//GEN-LAST:event_RemoveFlightButtonActionPerformed

    private void UpdateBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBookingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBookingButtonActionPerformed

    private void RemoveBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBookingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBookingButtonActionPerformed

    private void CreateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateReportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateReportButtonActionPerformed

    private void AddBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBookingActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new WelcomeGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBooking;
    private javax.swing.JButton AddFlightButton;
    private javax.swing.JButton CreateReportButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RemoveBookingButton;
    private javax.swing.JButton RemoveFlightButton;
    private javax.swing.JButton UpdateBookingButton;
    private javax.swing.JButton UpdateFlightButton;
    private javax.swing.JLabel UsernameLable;
    private javax.swing.JLabel UsernameLable1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
