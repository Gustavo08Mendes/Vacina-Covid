/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.awt.Toolkit;

/**
 *
 * @author gusta
 */
public class TelaConsultaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaAdministrador
     */
    public TelaConsultaAdministrador() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RGTextField = new javax.swing.JTextField();
        SenhaTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        celularTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        nascimentoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        RgTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AtualizarjButton = new javax.swing.JButton();
        DeletarjButton = new javax.swing.JButton();
        ConsultarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(RGTextField);
        RGTextField.setBounds(590, 370, 316, 30);
        getContentPane().add(SenhaTextField);
        SenhaTextField.setBounds(590, 450, 209, 30);

        jLabel10.setText("Senha");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 460, 50, 14);

        jLabel8.setText("Celular");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 420, 50, 14);
        getContentPane().add(celularTextField);
        celularTextField.setBounds(590, 410, 150, 30);

        jLabel4.setText("RG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 380, 40, 20);

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTextField);
        nomeTextField.setBounds(590, 290, 268, 30);
        getContentPane().add(nascimentoTextField);
        nascimentoTextField.setBounds(590, 330, 86, 30);

        jLabel2.setText("Data de Nascimento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 340, 130, 14);

        jLabel3.setText("Nome Completo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 300, 110, 14);

        jLabel13.setText("ID");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 260, 40, 14);
        getContentPane().add(IdTextField);
        IdTextField.setBounds(590, 250, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Informações:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(570, 200, 147, 30);

        RgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RgTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(RgTextField);
        RgTextField.setBounds(590, 140, 159, 30);

        jLabel6.setText("RG");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 140, 40, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Informe o RG para pesquisar um cidadão.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 80, 401, 22);

        AtualizarjButton.setText("Atualizar");
        AtualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarjButton);
        AtualizarjButton.setBounds(600, 560, 80, 60);

        DeletarjButton.setText("Deletar");
        DeletarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeletarjButton);
        DeletarjButton.setBounds(700, 560, 80, 60);

        ConsultarjButton.setText("Consultar Atendente");
        ConsultarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarjButton);
        ConsultarjButton.setBounds(800, 560, 140, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaMenuAdm.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1040, 680);

        setSize(new java.awt.Dimension(1053, 713));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void RgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RgTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RgTextFieldActionPerformed

    private void AtualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarjButtonActionPerformed
        String nome = nomeTextField.getText();
        String nasc = nascimentoTextField.getText();
        String RG = RGTextField.getText();
        String celular = celularTextField.getText();
        String senha = SenhaTextField.getText();

        Administrador p = new Administrador();
        p.setNome(nome);
        p.setNasc(nasc);
        p.setRg(RG);
        p.setCelular(celular);
        p.setSenha(senha);
        p.atualizar();
    }//GEN-LAST:event_AtualizarjButtonActionPerformed

    private void DeletarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarjButtonActionPerformed
        String id = IdTextField.getText();
        Administrador p = new Administrador();
        p.setId(id);
        p.Deletar();

        IdTextField.setText("");
        nomeTextField.setText("");
        nascimentoTextField.setText("");
        RGTextField.setText("");
        celularTextField.setText("");
        SenhaTextField.setText("");
    }//GEN-LAST:event_DeletarjButtonActionPerformed

    private void ConsultarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarjButtonActionPerformed
        String RG = RgTextField.getText();
        Administrador p = new Administrador();
        p.setRg(RG);
        p = p.consulta();
        //idTextField.setText(p.getId());
        IdTextField.setText(p.getId());
        nomeTextField.setText(p.getNome());
        nascimentoTextField.setText(p.getNasc());
        RGTextField.setText(p.getRg());
        celularTextField.setText(p.getCelular());
        SenhaTextField.setText(p.getSenha());
        //endereçoTextField.setText(p.getEndereço());

        IdTextField.setEnabled(false);
        RGTextField.setEnabled(false);
    }//GEN-LAST:event_ConsultarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarjButton;
    private javax.swing.JButton ConsultarjButton;
    private javax.swing.JButton DeletarjButton;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTextField RGTextField;
    private javax.swing.JTextField RgTextField;
    private javax.swing.JTextField SenhaTextField;
    private javax.swing.JTextField celularTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nascimentoTextField;
    private javax.swing.JTextField nomeTextField;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Zimagens/unnamed.png")));
    }
}
