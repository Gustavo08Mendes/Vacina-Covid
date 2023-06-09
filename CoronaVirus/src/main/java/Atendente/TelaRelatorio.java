/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atendente;

import Administrador.TelaAdministrador;
import Administrador.TelaAdministrador;
import ABProjeto.ConnectionFactory;
import Administrador.TelaAdministrador;
import Cidadão.TelaCadastroCidadão;
import Cidadão.TelaConsultarCidadão;
import Vacina.TelaConsultarVacinas;
import Vacina.TelaVacinas;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Oliveira
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
        setIcon();
        jMenuItem2.setEnabled(false);
    }
    
    public ArrayList<relatorio> userList(){
        ArrayList<relatorio> usersList = new ArrayList<>();
        
        String sql = "SELECT * FROM coronavirus WHERE PrimeiraDose <> '' AND SegundaDose = ''";
        
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            relatorio re;
            while (rs.next()) {
                re = new relatorio(rs.getString("codigo"),rs.getString("nome"),rs.getString("nasc"),rs.getString("cpf"),rs.getString("email"),rs.getString("celular"),rs.getString("nomeDaVacinaAplicada"),rs.getString("PrimeiraDose"),rs.getString("SegundaDose"));
                usersList.add(re);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void show_user(){
        ArrayList<relatorio> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[9];
        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getCodigo();
            row[1]=list.get(i).getNome();
            row[2]=list.get(i).getNasc();
            row[3]=list.get(i).getCpf();
            row[4]=list.get(i).getEmail();
            row[5]=list.get(i).getCelular();
            row[6]=list.get(i).getVacina();
            row[7]=list.get(i).getDose1();
            row[8]=list.get(i).getDose2();
            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        voltar = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Relatório de Vacinação");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 70, 220, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Nasc", "CPF", "E-mail", "Celular", "Vacina aplicada", "1º Dose", "2º Dose"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 100, 1016, 294);

        voltar.setText("←");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(20, 490, 59, 23);

        jButton1.setText("Lista de pessas que ainda não foi aplicada a segunda dose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 460, 383, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaFundoRelarorio.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 0, 1040, 560);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaMenu2.1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 220, 640);

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

        setSize(new java.awt.Dimension(1254, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.setVisible(false);
        TelaAdministrador telas = new TelaAdministrador();
        telas.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    show_user();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Zimagens/unnamed.png")));
    }
}
