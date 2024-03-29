
import java.awt.Color;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author uniejoalbuquerque
 */
public class TV extends javax.swing.JFrame {

    /**
     * Creates new form TV
     */
    Televisao tele = new Televisao();
    public TV() {
        initComponents();
        telaPanela.setBackground(Color.black);
        txtTVPaneFront.setBackground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maisSom1 = new javax.swing.JButton();
        menosSom1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menosSom = new javax.swing.JButton();
        maisSom = new javax.swing.JButton();
        boolCanalSet = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        boolLigada = new javax.swing.JToggleButton();
        telaPanela = new javax.swing.JPanel();
        txtCanalPane = new javax.swing.JScrollPane();
        txtTVPaneFront = new javax.swing.JTextPane();
        progressSom = new javax.swing.JProgressBar();
        txtCanalSet = new javax.swing.JTextField();
        sobeCanal = new javax.swing.JButton();
        desceCanal = new javax.swing.JButton();

        maisSom1.setText("+");
        maisSom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisSom1ActionPerformed(evt);
            }
        });

        menosSom1.setText("-");
        menosSom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosSom1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Televisão"));

        jLabel1.setText("Canal:");

        jLabel2.setText("Som:");

        menosSom.setText("-");
        menosSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosSomActionPerformed(evt);
            }
        });

        maisSom.setText("+");
        maisSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisSomActionPerformed(evt);
            }
        });

        boolCanalSet.setText("Selecionar");
        boolCanalSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boolCanalSetActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "MG", "PN", "PR", "AM" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        boolLigada.setText("Liga/Desliga");
        boolLigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boolLigadaActionPerformed(evt);
            }
        });

        txtCanalPane.setViewportView(txtTVPaneFront);

        javax.swing.GroupLayout telaPanelaLayout = new javax.swing.GroupLayout(telaPanela);
        telaPanela.setLayout(telaPanelaLayout);
        telaPanelaLayout.setHorizontalGroup(
            telaPanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPanelaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtCanalPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        telaPanelaLayout.setVerticalGroup(
            telaPanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaPanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCanalPane, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        progressSom.setMaximum(10);

        txtCanalSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanalSetActionPerformed(evt);
            }
        });

        sobeCanal.setText("+");
        sobeCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobeCanalActionPerformed(evt);
            }
        });

        desceCanal.setText("-");
        desceCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desceCanalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(boolLigada)
                        .addGap(91, 91, 91)
                        .addComponent(sobeCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desceCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(progressSom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCanalSet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boolCanalSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(maisSom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menosSom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(telaPanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(telaPanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boolCanalSet)
                                .addComponent(txtCanalSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(progressSom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menosSom)
                            .addComponent(maisSom)))
                    .addComponent(boolLigada)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(desceCanal)
                                .addComponent(sobeCanal))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maisSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisSomActionPerformed
        // TODO add your handling code here:
        int a; 
        boolean b = tele.aumentarVolume();
        if (b){
            a = tele.getSom();
            progressSom.setValue(a);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_maisSomActionPerformed
    
    private void boolCanalSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boolCanalSetActionPerformed
        // TODO add your handling code here:
        int a;
        if (tele.getLigada()){
            a = Integer.parseInt(txtCanalSet.getText());
            if (a<65){
                tele.setCanal(a);
                a = tele.getCanal();
                txtTVPaneFront.setText("Canal "+a);
            }
            else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_boolCanalSetActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void boolLigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boolLigadaActionPerformed
        // TODO add your handling code here:
        int a;
        tele.LigaouDesligaTV();
        if (tele.getLigada() == true){
            a = tele.getCanal();
            txtTVPaneFront.setText("Canal "+a);
            telaPanela.setBackground(Color.white);
            txtTVPaneFront.setBackground(Color.white);
            a = tele.getSom();
            progressSom.setValue(a);
        }
        
        else{
            txtTVPaneFront.setText("");
            telaPanela.setBackground(Color.black);
            txtTVPaneFront.setBackground(Color.black);
            progressSom.setValue(0);
        }
    }//GEN-LAST:event_boolLigadaActionPerformed

    private void menosSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosSomActionPerformed
        // TODO add your handling code here:
        int a;
        boolean b = tele.reduzirVolume();
        if (b){
            a = tele.getSom();
            progressSom.setValue(a);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menosSomActionPerformed

    private void txtCanalSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanalSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanalSetActionPerformed

    private void maisSom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisSom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maisSom1ActionPerformed

    private void menosSom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosSom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosSom1ActionPerformed

    private void sobeCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobeCanalActionPerformed
        // TODO add your handling code here:
        boolean a = tele.subirCanal();
        if (a){
            int b = tele.getCanal();
            txtTVPaneFront.setText("Canal "+b);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_sobeCanalActionPerformed

    private void desceCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desceCanalActionPerformed
        // TODO add your handling code here:
        boolean a = tele.descerCanal();
        if (a){
            int b = tele.getCanal();
            txtTVPaneFront.setText("Canal "+b);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_desceCanalActionPerformed

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
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boolCanalSet;
    private javax.swing.JToggleButton boolLigada;
    private javax.swing.JButton desceCanal;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton maisSom;
    private javax.swing.JButton maisSom1;
    private javax.swing.JButton menosSom;
    private javax.swing.JButton menosSom1;
    private javax.swing.JProgressBar progressSom;
    private javax.swing.JButton sobeCanal;
    private javax.swing.JPanel telaPanela;
    private javax.swing.JScrollPane txtCanalPane;
    private javax.swing.JTextField txtCanalSet;
    private javax.swing.JTextPane txtTVPaneFront;
    // End of variables declaration//GEN-END:variables
}
