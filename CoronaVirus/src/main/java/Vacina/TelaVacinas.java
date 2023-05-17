/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vacina;

import Cidadão.TelaConsultarCidadão;
import Cidadão.TelaCadastroCidadão;
import Atendente.TelaAtendente;
import Atendente.TelaRelatorio;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliveira
 */
public class TelaVacinas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVacinas
     */
    public TelaVacinas() {
        initComponents();
        setIcon();
        CadastrarVacinaMenuItem.setEnabled(false);
        jButton4.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoCadastrarVacina = new javax.swing.JButton();
        voltar = new javax.swing.JToggleButton();
        vacinaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doses1RadioButton = new javax.swing.JRadioButton();
        doses2RadioButton = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade de Doses:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 230, 150, 14);

        botaoCadastrarVacina.setBackground(new java.awt.Color(153, 255, 204));
        botaoCadastrarVacina.setText("Cadastrar");
        botaoCadastrarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarVacinaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarVacina);
        botaoCadastrarVacina.setBounds(530, 410, 110, 90);

        voltar.setBackground(new java.awt.Color(153, 204, 255));
        voltar.setText("←");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(10, 480, 43, 23);

        vacinaTextField.setForeground(new java.awt.Color(102, 102, 102));
        vacinaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vacinaTextFieldFocusGained(evt);
            }
        });
        vacinaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacinaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(vacinaTextField);
        vacinaTextField.setBounds(490, 160, 230, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Informações sobre a Vacina");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 80, 440, 29);

        doses1RadioButton.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(doses1RadioButton);
        doses1RadioButton.setText("1");
        doses1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doses1RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doses1RadioButton);
        doses1RadioButton.setBounds(630, 220, 40, 30);

        doses2RadioButton.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(doses2RadioButton);
        doses2RadioButton.setText("2");
        doses2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doses2RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doses2RadioButton);
        doses2RadioButton.setBounds(670, 220, 50, 30);

        jButton6.setBackground(new java.awt.Color(0, 153, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarCidadão.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(80, 460, 80, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Consultar Cidadão");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 440, 130, 14);

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/ConsultarVacina.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(80, 350, 80, 80);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Consultar Vacina");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 330, 120, 14);

        jButton7.setBackground(new java.awt.Color(0, 153, 204));
        jButton7.setForeground(new java.awt.Color(204, 204, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarCidadão.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(80, 240, 80, 80);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Cadastrar Cidadão");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 220, 140, 14);

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/CadastrarVacina.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 130, 80, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Cadastrar Vacina");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 110, 130, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o intervalo entre dias", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288", "289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324", "325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335", "336", "337", "338", "339", "340", "341", "342", "343", "344", "345", "346", "347", "348", "349", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "360", "361", "362", "363", "364", "365" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(490, 280, 230, 30);

        jLabel1.setText("Nome da Vacina");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 134, 90, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zimagens/TelaMenu2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 970, 560);

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(540, 130, 60, 20);

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

        setSize(new java.awt.Dimension(984, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarVacinaActionPerformed
        String nome = vacinaTextField.getText();
        String intervalo = (String) jComboBox1.getSelectedItem();
        String doses1 = doses1RadioButton.getText();
        String doses2 = doses2RadioButton.getText();
        
        Vacina v = new Vacina();
        
        if (vacinaTextField.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Insira o nome da vacina para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (doses1RadioButton.getText() == null){
        JOptionPane.showMessageDialog(null,"Insira a quantidade de doses para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (doses2RadioButton.getText() == null){
        JOptionPane.showMessageDialog(null,"Insira a quantidade de doses para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (jComboBox1.getSelectedItem().equals("Selecione o intervalo entre dias")){
            JOptionPane.showMessageDialog(null,"Selecione o intervalo de dias para continuar.", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            JOptionPane.showMessageDialog(null, "A vacina foi cadastrada com sucesso");
        }

        if (doses1RadioButton.isSelected()){
            v.setDoses(doses1);
        } else if (doses2RadioButton.isSelected()){
            v.setDoses(doses2);
        }
        v.setNome(nome);
        v.setIntervalo(intervalo);
        v.inserir();
        
        
        vacinaTextField.setText("");
        //intervaloTextField.setText("");
    }//GEN-LAST:event_botaoCadastrarVacinaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.setVisible(false);
        TelaAtendente Atendente = new TelaAtendente();
        Atendente.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void vacinaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacinaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacinaTextFieldActionPerformed

    private void vacinaTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vacinaTextFieldFocusGained
        if (vacinaTextField.getText().equals("Nome da Vacina")){
            vacinaTextField.setText("");
            vacinaTextField.setForeground(new Color(0,0,0));
        }
        //if (intervaloTextField.getText().equals("")){
            //intervaloTextField.setText("Intervalo entre doses");
        //}
    }//GEN-LAST:event_vacinaTextFieldFocusGained

    private void doses2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doses2RadioButtonActionPerformed

    }//GEN-LAST:event_doses2RadioButtonActionPerformed

    private void doses1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doses1RadioButtonActionPerformed

    }//GEN-LAST:event_doses1RadioButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        TelaConsultarCidadão consulta = new TelaConsultarCidadão();
        consulta.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        TelaConsultarVacinas cadastro = new TelaConsultarVacinas();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        TelaCadastroCidadão cadastrar = new TelaCadastroCidadão();
        cadastrar.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVacinas().setVisible(true);
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
    private javax.swing.JButton botaoCadastrarVacina;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton doses1RadioButton;
    private javax.swing.JRadioButton doses2RadioButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField vacinaTextField;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Zimagens/unnamed.png")));
    }
}
