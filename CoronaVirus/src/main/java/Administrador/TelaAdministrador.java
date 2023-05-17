/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import Atendente.TelaConsultarAtendente;
import Atendente.TelaCadastrarAtendente;
import ABProjeto.TelaLogin;
import java.awt.Toolkit;

/**
 *
 * @author gusta
 */
public class TelaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmnistrador
     */
    public TelaAdministrador() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        voltar = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        VoltarAoMenuMenuItem = new javax.swing.JMenuItem();
        SairDoSistemaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Consultar Atendente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 380, 149, 70);

        jButton2.setText("Cadastrar Atendente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 220, 149, 70);

        jButton3.setText("Cadastrar Administrador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 220, 149, 70);

        voltar.setText("←");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(30, 500, 43, 23);

        jButton5.setText("Consultar adm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 380, 150, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaMenu2_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1000, 560);

        jMenu1.setText("Consultar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        VoltarAoMenuMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/VoltarMenu.png"))); // NOI18N
        VoltarAoMenuMenuItem.setText("Voltar ao menu");
        VoltarAoMenuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarAoMenuMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(VoltarAoMenuMenuItem);

        SairDoSistemaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/SairMenu.png"))); // NOI18N
        SairDoSistemaMenuItem.setText("Fechar Sistema");
        SairDoSistemaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoSistemaMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(SairDoSistemaMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1012, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        //Passar de para outras telas
        this.setVisible(false);
        TelaLogin telas = new TelaLogin();
        telas.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Passar de para outras telas
        this.setVisible(false);
        TelaConsultarAtendente telas = new TelaConsultarAtendente();
        telas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Passar de para outras telas
        this.setVisible(false);
        TelaCadastrarAtendente telas = new TelaCadastrarAtendente();
        telas.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Passar de para outras telas
        this.setVisible(false);
        TelaCadastrarAdministrador telas = new TelaCadastrarAdministrador();
        telas.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        TelaConsultaAdministrador telas = new TelaConsultaAdministrador();
        telas.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void VoltarAoMenuMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarAoMenuMenuItemActionPerformed
        this.setVisible(false);
        TelaAdministrador telas = new TelaAdministrador();
        telas.setVisible(true);
    }//GEN-LAST:event_VoltarAoMenuMenuItemActionPerformed

    private void SairDoSistemaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoSistemaMenuItemActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SairDoSistemaMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SairDoSistemaMenuItem;
    private javax.swing.JMenuItem VoltarAoMenuMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Zimagens/unnamed.png")));
    }
}
