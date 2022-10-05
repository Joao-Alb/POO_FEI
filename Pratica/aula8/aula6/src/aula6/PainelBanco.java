/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula6;
import java.text.DecimalFormat;
/**
 *
 * @author uniejoalbuquerque
 */
public class PainelBanco extends javax.swing.JFrame {

    /**
     * Creates new form PainelBanco
     */
    boolean b = false;
    int flag = 0;
    int dia, mes, ano;
    double saldo, limite, debito;
    String s, cpf;
    ClienteBanco cliente = new ClienteBanco();
    DecimalFormat formatador = new DecimalFormat("0.00");
    public PainelBanco() {
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

        txtCanalSet = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        buttonIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSetNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSetCPF = new javax.swing.JLabel();
        txtSetSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSetLimite = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        buttonOK = new javax.swing.JToggleButton();
        setData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCanalSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanalSetActionPerformed(evt);
            }
        });

        txtTitulo.setText("Clique em iniciar");

        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        txtSetNome.setText("                        ");

        jLabel2.setText("CPF:");

        txtSetCPF.setText("                ");

        txtSetSaldo.setText("                      ");

        jLabel3.setText("Saldo:");

        jLabel4.setText("Limite:");

        txtSetLimite.setText("                           ");

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        buttonOK.setText("Ok");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        setData.setText("                       ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSetNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSetSaldo)
                                    .addComponent(txtSetCPF)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSetLimite))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCanalSet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                                .addComponent(buttonIniciar)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setData)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCanalSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonIniciar)
                        .addComponent(buttonOK)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSetNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSetCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSetSaldo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSetLimite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(setData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCanalSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanalSetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanalSetActionPerformed

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        // TODO add your handling code here:
        txtInfo.setText("Seja Bem vindo! Vamos começar!\n"
                + "Primeiramente, escreva o seu nome na caixa acima");
        txtTitulo.setText("Escreva seu nome e clique em ok: ");
        b = true;
        
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        // TODO add your handling code here:
        if (b){
            switch(flag){
                case 0:                
                    s = txtCanalSet.getText();
                txtInfo.setText("Show de bola, "+s+"!\n"
                    + "Agora, digite seu CPF");
                    txtTitulo.setText("Digite seu CPF e clique em OK: ");
                    flag++;
                    txtSetNome.setText(s);
                    break;
                    
                case 1:
                    cpf = txtCanalSet.getText();
                    txtInfo.setText("Ok, seu cpf é: "+cpf+"!\n"
                    + "Agora, digite o dia de hoje");
                    txtTitulo.setText("Digite o DIA de hoje e clique em OK: ");
                    flag++;
                    txtSetCPF.setText(cpf);
                    break;
                
                case 2:
                    dia = Integer.parseInt(txtCanalSet.getText());
                    txtInfo.setText("Ok, o dia de hoje é: "+dia+"!\n"
                    + "Agora, digite o mês de hoje");
                    txtTitulo.setText("Digite o MÊS de hoje e clique em OK: ");
                    flag++;
                    break;
                case 3:
                    mes = Integer.parseInt(txtCanalSet.getText());
                    txtInfo.setText("Ok, o mês de hoje é: "+mes+"!\n"
                    + "Agora, digite o ano de hoje");
                    txtTitulo.setText("Digite o ANO de hoje e clique em OK: ");
                    flag++;
                    break;
                case 4:
                    ano = Integer.parseInt(txtCanalSet.getText());
                    txtInfo.setText("Ok, o ano de hoje é: "+ano+"!\n"
                    + "Agora, digite o saldo inicial");
                    txtTitulo.setText("Digite o saldo e clique em OK: ");
                    flag++;
                    Data data = new Data(dia,mes,ano);
                    cliente = new ClienteBanco(s, cpf, data);
                    setData.setText(data.toString());
                    break;
                case 5:
                    String sd = txtCanalSet.getText();
                    saldo = Double.parseDouble(sd);
                    boolean p = cliente.abreConta(tipoConta.CORRENTE, 1000);
                    System.out.println(p);
                    cliente.creditarCC(saldo);
                    txtInfo.setText("Ok, o saldo é: "+sd+"!\n"
                    + "Agora, digite o limite inicial");
                    txtTitulo.setText("Digite o limite e clique em OK: ");
                    flag++;
                    txtSetSaldo.setText(sd);
                    break;
                    
                case 6:
                    String li = txtCanalSet.getText();
                    limite = Double.parseDouble(li);
                    txtInfo.setText("Ok, o limite é: "+limite+"!\n"
                    + "Agora, digite o valor a ser debitado");
                    txtTitulo.setText("Digite o valor e clique em OK: ");
                    flag++;
                    txtSetLimite.setText(li);
                    break;
                case 7:
                    String db = txtCanalSet.getText();
                    debito = Double.parseDouble(db);
                    boolean o = cliente.debitarCC(debito);
                    System.out.println(o);
                    txtInfo.setText("Ok, o valor é: "+db+"!\n"
                    + "Agora, o valor foi debitado da sua conta");
                    txtTitulo.setText("Fim");
                    flag++;
                    
                    debito = cliente.getSaldoCC();
                    //int e = Integer.parseInt( ""+debito );
                    
                    txtSetSaldo.setText(""+formatador.format(debito));
                    break;
                
            }
        }
    }//GEN-LAST:event_buttonOKActionPerformed

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
            java.util.logging.Logger.getLogger(PainelBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JToggleButton buttonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel setData;
    private javax.swing.JTextField txtCanalSet;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JLabel txtSetCPF;
    private javax.swing.JLabel txtSetLimite;
    private javax.swing.JLabel txtSetNome;
    private javax.swing.JLabel txtSetSaldo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
