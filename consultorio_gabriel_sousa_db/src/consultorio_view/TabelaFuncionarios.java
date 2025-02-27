package consultorio_view;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class TabelaFuncionarios extends javax.swing.JFrame {

    public TabelaFuncionarios() {
        initComponents();
        filtro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        filtroActionPerformed(evt);
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        botaoDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filtro = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        botaoFechar = new javax.swing.JMenuItem();
        botaoOpcoes = new javax.swing.JMenu();
        botaoCadastroPaciente = new javax.swing.JMenuItem();
        botaoCadastroConsulta = new javax.swing.JMenuItem();
        botaoGestaoEstoque = new javax.swing.JMenuItem();
        botaoPagamentoConsulta = new javax.swing.JMenuItem();
        botaoTabelaFuncionarios = new javax.swing.JMenuItem();
        tabelaPacientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(692, 449));

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionario);

        botaoDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoDeletar.setText("Deletar Colaborador");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Selecione um filtro:  ");

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentista", "Gestor", "Funcionário" }));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoDeletar)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Voltar ao Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        botaoSair.add(jMenuItem1);

        botaoFechar.setText("Fechar Programa");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });
        botaoSair.add(botaoFechar);

        jMenuBar1.add(botaoSair);

        botaoOpcoes.setText("Opções");

        botaoCadastroPaciente.setText("Cadastro de Paciente");
        botaoCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroPacienteActionPerformed(evt);
            }
        });
        botaoOpcoes.add(botaoCadastroPaciente);

        botaoCadastroConsulta.setText("Cadastro de Consulta");
        botaoCadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroConsultaActionPerformed(evt);
            }
        });
        botaoOpcoes.add(botaoCadastroConsulta);

        botaoGestaoEstoque.setText("Gestão de Estoque");
        botaoGestaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGestaoEstoqueActionPerformed(evt);
            }
        });
        botaoOpcoes.add(botaoGestaoEstoque);

        botaoPagamentoConsulta.setText("Pagamento de Consulta");
        botaoPagamentoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagamentoConsultaActionPerformed(evt);
            }
        });
        botaoOpcoes.add(botaoPagamentoConsulta);

        botaoTabelaFuncionarios.setText("Tabela de Funcionários");
        botaoTabelaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTabelaFuncionariosActionPerformed(evt);
            }
        });
        botaoOpcoes.add(botaoTabelaFuncionarios);

        tabelaPacientes.setText("Tabela de Pacientes");
        tabelaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaPacientesActionPerformed(evt);
            }
        });
        botaoOpcoes.add(tabelaPacientes);

        jMenuBar1.add(botaoOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        String selecaoFiltro = filtro.getSelectedItem().toString();
        DefaultTableModel tableModel = new DefaultTableModel();

        switch (selecaoFiltro) {
            case "Dentista":
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Email");
                tableModel.addColumn("Telefone");
                tableModel.addColumn("CRO");
                tableModel.addColumn("Especialidade");

                tableModel.addRow(new Object[]{"Aline Campos", "784.986.038-31", "aline.campos@gmail.com", "32547896123", "890317", "Odontopediatria"});
                tableModel.addRow(new Object[]{"Jacira Souza Pascoal", "456.874.562-34", "jacira14.pasco@yahoo.com.br", "15874693205", "733028", "Ortodontia"});
                break;
            case "Gestor":
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Email");
                tableModel.addColumn("Telefone");

                tableModel.addRow(new Object[]{"Nicole Azevedo Martins", "956.515.652-56", "niemailmart@hotmail.com", "82987277588"});
                tableModel.addRow(new Object[]{"Guilherme Gomes Cardoso", "433.263.731-39", "guigomes@gmail.com", "61988585237"});
                break;
            case "Funcionário":
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Email");
                tableModel.addColumn("Telefone");
                tableModel.addColumn("Função");

                tableModel.addRow(new Object[]{"João Silva", "123.456.789-00", "joao.silva@email.com", "83971079414", "Radiografia Dentária"});
                tableModel.addRow(new Object[]{"Maria Oliveira", "234.567.890-11", "maria.oliveira@email.com", "67981266904", "Agendamento e Gerenciamento de Registros"});
                break;
            default:
                tableModel.addColumn("Nome");
                tableModel.addColumn("CPF");
                tableModel.addColumn("Email");
                tableModel.addColumn("Telefone");
                break;
    }
    
    tabelaFuncionario.setModel(tableModel);
    }//GEN-LAST:event_filtroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroPacienteActionPerformed
        this.dispose();
        CadastroPaciente cadastroPaciente = new CadastroPaciente();
        cadastroPaciente.setVisible(true);
    }//GEN-LAST:event_botaoCadastroPacienteActionPerformed

    private void botaoGestaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGestaoEstoqueActionPerformed
        this.dispose();
        GestaoEstoque gestaoEstoque = new GestaoEstoque();
        gestaoEstoque.setVisible(true);
    }//GEN-LAST:event_botaoGestaoEstoqueActionPerformed

    private void botaoPagamentoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagamentoConsultaActionPerformed
        this.dispose();
        PagamentoConsulta pagamentoConsulta = new PagamentoConsulta();
        pagamentoConsulta.setVisible(true);
    }//GEN-LAST:event_botaoPagamentoConsultaActionPerformed

    private void botaoTabelaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTabelaFuncionariosActionPerformed
        this.dispose();
        TabelaFuncionarios tabelaFuncionarios = new TabelaFuncionarios();
        tabelaFuncionarios.setVisible(true);
    }//GEN-LAST:event_botaoTabelaFuncionariosActionPerformed

    private void tabelaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaPacientesActionPerformed
        this.dispose();
        TabelaPacientes tabelaPaciente = new TabelaPacientes();
        tabelaPaciente.setVisible(true);
    }//GEN-LAST:event_tabelaPacientesActionPerformed

    private void botaoCadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroConsultaActionPerformed
        this.dispose();
        CadastroConsulta cadastroConsulta = new CadastroConsulta();
        cadastroConsulta.setVisible(true);
    }//GEN-LAST:event_botaoCadastroConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoCadastroConsulta;
    private javax.swing.JMenuItem botaoCadastroPaciente;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JMenuItem botaoFechar;
    private javax.swing.JMenuItem botaoGestaoEstoque;
    private javax.swing.JMenu botaoOpcoes;
    private javax.swing.JMenuItem botaoPagamentoConsulta;
    private javax.swing.JMenu botaoSair;
    private javax.swing.JMenuItem botaoTabelaFuncionarios;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JMenuItem tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
