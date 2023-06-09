/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacina;


import Vacina.TelaVacinas;
import Cidadão.TelaConsultarCidadão;
import Cidadão.TelaCadastroCidadão;
import Atendente.TelaAtendente;
import Atendente.TelaRelatorio;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class TelaConsultarVacinas extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultarVacinas
     */
    public TelaConsultarVacinas() {
        initComponents();
        setIcon();
        ConultarVacinaMenuItem.setEnabled(false); 
        jButton5.setEnabled(false);
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
        voltar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        nomeVacinaTextField = new javax.swing.JTextField();
        periodoDosesLabel = new javax.swing.JLabel();
        intervaloTextField = new javax.swing.JTextField();
        sla = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantidadeDeDosesTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        periodoDosesLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        nomeTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastrosCidadãoMenuItem = new javax.swing.JMenuItem();
        CadastrarVacinaMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ConultarVacinaMenuItem = new javax.swing.JMenuItem();
        ConsultarCidadãoMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SairDoSistemaMenuItem = new javax.swing.JMenuItem();
        VoltarAoMenuMenuItem = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        voltar.setBackground(new java.awt.Color(204, 255, 255));
        voltar.setText("←");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(10, 510, 43, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade de Doses");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 320, 160, 20);
        getContentPane().add(nomeVacinaTextField);
        nomeVacinaTextField.setBounds(610, 240, 110, 30);

        periodoDosesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        periodoDosesLabel.setText("Intervalo entre as doses");
        getContentPane().add(periodoDosesLabel);
        periodoDosesLabel.setBounds(450, 280, 170, 20);
        getContentPane().add(intervaloTextField);
        intervaloTextField.setBounds(610, 280, 110, 30);

        sla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sla.setText("Nome da Vacina");
        getContentPane().add(sla);
        sla.setBounds(450, 240, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Informe o nome da vacina para consultar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 60, 530, 29);
        getContentPane().add(quantidadeDeDosesTextField);
        quantidadeDeDosesTextField.setBounds(610, 320, 40, 30);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 440, 90, 70);

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 440, 100, 70);

        periodoDosesLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        periodoDosesLabel1.setText("Codigo da vacina");
        getContentPane().add(periodoDosesLabel1);
        periodoDosesLabel1.setBounds(450, 360, 150, 30);

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField);
        idTextField.setBounds(610, 360, 40, 30);

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setText("Consultar vacina");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 440, 130, 70);
        getContentPane().add(nomeTextField);
        nomeTextField.setBounds(520, 120, 125, 30);

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarVacina.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(70, 130, 80, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Cadastrar Vacina");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 110, 100, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Consultar Vacina");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 330, 140, 14);

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarVacina.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(70, 350, 80, 80);

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarCidadão.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(70, 460, 80, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Consultar Cidadão");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 440, 140, 14);

        jButton7.setBackground(new java.awt.Color(0, 153, 204));
        jButton7.setForeground(new java.awt.Color(204, 204, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarCidadão.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(70, 240, 80, 80);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Cadastrar Cidadão");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 220, 140, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Informações sobre a Vacina");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 190, 340, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nome");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 120, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaMenu2.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 960, 550);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(222, 30));
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu1.setBackground(new java.awt.Color(0, 51, 51));
        jMenu1.setText("Cadastrar");

        CadastrosCidadãoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarCidadãoMenu.png"))); // NOI18N
        CadastrosCidadãoMenuItem.setText("Cadastrar Cidadão");
        CadastrosCidadãoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrosCidadãoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrosCidadãoMenuItem);

        CadastrarVacinaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarVacinaMenu.png"))); // NOI18N
        CadastrarVacinaMenuItem.setText("Cadastrar Vacina");
        CadastrarVacinaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarVacinaMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarVacinaMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        ConultarVacinaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarVacinaMenu.png"))); // NOI18N
        ConultarVacinaMenuItem.setText("Consultar Vacina");
        ConultarVacinaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConultarVacinaMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ConultarVacinaMenuItem);

        ConsultarCidadãoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarCidadãoMenu.png"))); // NOI18N
        ConsultarCidadãoMenuItem.setText("Consultar Cidadão");
        ConsultarCidadãoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarCidadãoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ConsultarCidadãoMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Realatorio");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/RelatorioMenu.png"))); // NOI18N
        jMenuItem2.setText("Relatorio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        SairDoSistemaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/SairMenu.png"))); // NOI18N
        SairDoSistemaMenuItem.setText("Fechar Sistema");
        SairDoSistemaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoSistemaMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(SairDoSistemaMenuItem);

        VoltarAoMenuMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/VoltarMenu.png"))); // NOI18N
        VoltarAoMenuMenuItem.setText("Voltar ao menu");
        VoltarAoMenuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarAoMenuMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(VoltarAoMenuMenuItem);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(973, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.setVisible(false);
        TelaAtendente Atendente = new TelaAtendente();
        Atendente.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = idTextField.getText();
        Vacina v = new Vacina();
    
    nomeVacinaTextField.setText("");
    quantidadeDeDosesTextField.setText("");
    intervaloTextField.setText("");
    idTextField.setText("");
    
    if (idTextField.getText().equals("")){
         idTextField.setEnabled(true);
    }
    if (idTextField.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Vacina deletada com sucesso.");
    }
        v.setId(id);
        v.Deletar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = nomeVacinaTextField.getText();
        String intervalo = intervaloTextField.getText();
        String doses = quantidadeDeDosesTextField.getText(); 
        String id = idTextField.getText();
        
        if (nomeVacinaTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Insira o nome da vacina para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if (intervaloTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Insira um intervalo para a vacinação para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if (quantidadeDeDosesTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Insira a quantidade de doses da vacinação para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if (idTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Insira um id para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE );
            return;
        }else {
        JOptionPane.showMessageDialog(null,"Vacina atualizada com sucesso.");
        }

        Vacina v = new Vacina();
        v.setNome(nome);
        v.setIntervalo(intervalo);
        v.setDoses(doses);
        v.setId(id);
        v.atualizar();
        
    nomeVacinaTextField.setText("");
    quantidadeDeDosesTextField.setText("");
    intervaloTextField.setText("");
    idTextField.setText("");
    
    if (idTextField.getText().equals("")){
         idTextField.setEnabled(true);   
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String nome = nomeTextField.getText();
    Vacina va = new Vacina();
    va.setNome(nome);
    va = va.consultar();
    
    if (nomeTextField.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Insira o nome da vacina para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE );
        return;
    } else {
        JOptionPane.showMessageDialog(null,"Vacina encontrada com sucesso.");
    }
    
    nomeVacinaTextField.setText(va.getNome());
    quantidadeDeDosesTextField.setText(va.getDoses());
    intervaloTextField.setText(va.getIntervalo());
    idTextField.setText(va.getId());
    
    idTextField.setEnabled(false);
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        TelaConsultarCidadão cadastro = new TelaConsultarCidadão();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        TelaCadastroCidadão consultar = new TelaCadastroCidadão();
        consultar.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void CadastrosCidadãoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrosCidadãoMenuItemActionPerformed
        this.setVisible(false);
        TelaCadastroCidadão cadastro = new TelaCadastroCidadão();
        cadastro.setVisible(true);
    }//GEN-LAST:event_CadastrosCidadãoMenuItemActionPerformed

    private void CadastrarVacinaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarVacinaMenuItemActionPerformed
        this.setVisible(false);
        TelaVacinas vacinas = new TelaVacinas();
        vacinas.setVisible(true);
    }//GEN-LAST:event_CadastrarVacinaMenuItemActionPerformed

    private void ConultarVacinaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConultarVacinaMenuItemActionPerformed
        this.setVisible(false);
        TelaConsultarVacinas Vacina = new TelaConsultarVacinas();
        Vacina.setVisible(true);
    }//GEN-LAST:event_ConultarVacinaMenuItemActionPerformed

    private void ConsultarCidadãoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarCidadãoMenuItemActionPerformed
        this.setVisible(false);
        TelaConsultarCidadão consultar = new TelaConsultarCidadão();
        consultar.setVisible(true);
    }//GEN-LAST:event_ConsultarCidadãoMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        TelaRelatorio telas = new TelaRelatorio();
        telas.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void SairDoSistemaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoSistemaMenuItemActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SairDoSistemaMenuItemActionPerformed

    private void VoltarAoMenuMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarAoMenuMenuItemActionPerformed
        this.setVisible(false);
        TelaAtendente telas = new TelaAtendente();
        telas.setVisible(true);
    }//GEN-LAST:event_VoltarAoMenuMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultarVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarVacinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarVacinaMenuItem;
    private javax.swing.JMenuItem CadastrosCidadãoMenuItem;
    private javax.swing.JMenuItem ConsultarCidadãoMenuItem;
    private javax.swing.JMenuItem ConultarVacinaMenuItem;
    private javax.swing.JMenuItem SairDoSistemaMenuItem;
    private javax.swing.JMenuItem VoltarAoMenuMenuItem;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField intervaloTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField nomeVacinaTextField;
    private javax.swing.JLabel periodoDosesLabel;
    private javax.swing.JLabel periodoDosesLabel1;
    private javax.swing.JTextField quantidadeDeDosesTextField;
    private javax.swing.JLabel sla;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Zimagens/unnamed.png")));
    }
}
