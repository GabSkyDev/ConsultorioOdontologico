package consultorio_view;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import consultorio_gabriel_sousa.Conexao;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class CadastroConsulta extends javax.swing.JFrame {

    public CadastroConsulta() {
        initComponents();
        carregarConsultas();
        carregarPacientes(); 
        carregarDentistas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomePacienteBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        respTratamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        respProntuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoDeletarConsulta = new javax.swing.JButton();
        nomeDentistaBox = new javax.swing.JComboBox<>();
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

        nomePacienteBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomePacienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito", "Pix" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome do Paciente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Nome do Dentista:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Tipo de Tratamento:");

        respTratamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Prontuário:");

        respProntuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome do Dentista", "Tipo de Tratamento", "Prontuário"
            }
        ));
        jScrollPane1.setViewportView(tabelaConsulta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Consultas Recentes:");

        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoDeletarConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoDeletarConsulta.setText("Deletar Consulta");
        botaoDeletarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarConsultaActionPerformed(evt);
            }
        });

        nomeDentistaBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeDentistaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito", "Pix" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(respProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(respTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(nomePacienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeDentistaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoDeletarConsulta)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(nomePacienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeDentistaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(botaoDeletarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
    
    private int getIdFromName(String tabela, String nome) {
    String sql = "SELECT id_" + tabela + " FROM " + tabela + " WHERE nome = ?";
    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nome);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao obter ID: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    return -1; // Retorna -1 se não encontrar o ID
}

private int getIdPagamento() {
    // Implementar lógica para obter o id_pagamento
    // Aqui pode ser um valor fixo ou selecionado de outra fonte
    return 1; // Exemplo fixo
}
    
    private void carregarPacientes() {
    String sql = "SELECT id_paciente, nome FROM paciente";
    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        while (rs.next()) {
            String nomePaciente = rs.getString("nome");
            model.addElement(nomePaciente);
        }
        nomePacienteBox.setModel(model);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar pacientes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

private void carregarDentistas() {
    String sql = "SELECT id_dentista, nome FROM dentista";
    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        while (rs.next()) {
            String nomeDentista = rs.getString("nome");
            model.addElement(nomeDentista);
        }
        nomeDentistaBox.setModel(model);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar dentistas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void carregarConsultas() {
        DefaultTableModel model = (DefaultTableModel) tabelaConsulta.getModel();
        model.setRowCount(0);

        String sql = "SELECT nome_paciente, nome_dentista, tipo_tratamento, prontuario FROM consulta";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nomePaciente = rs.getString("nome_paciente");
                String nomeDentista = rs.getString("nome_dentista");
                String tipoTratamento = rs.getString("tipo_tratamento");
                String prontuario = rs.getString("prontuario");

                model.addRow(new Object[]{nomePaciente, nomeDentista, tipoTratamento, prontuario});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar consultas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
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

    private void botaoTabelaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTabelaFuncionariosActionPerformed
        this.dispose();
        TabelaFuncionarios tabelaFuncionarios = new TabelaFuncionarios();
        tabelaFuncionarios.setVisible(true);
    }//GEN-LAST:event_botaoTabelaFuncionariosActionPerformed

    private void botaoPagamentoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagamentoConsultaActionPerformed
        this.dispose();
        PagamentoConsulta pagamentoConsulta = new PagamentoConsulta();
        pagamentoConsulta.setVisible(true);
    }//GEN-LAST:event_botaoPagamentoConsultaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nomePaciente = nomePacienteBox.getSelectedItem().toString();
    String nomeDentista = nomeDentistaBox.getSelectedItem().toString();
    String tipoTratamento = respTratamento.getText();
    String prontuario = respProntuario.getText();

    if (nomePaciente.isEmpty() || nomeDentista.isEmpty() || tipoTratamento.isEmpty() || prontuario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obter IDs
    int idPaciente = getIdFromName("paciente", nomePaciente);
    int idDentista = getIdFromName("dentista", nomeDentista);
    int idPagamento = getIdPagamento(); // Você precisa implementar a lógica para obter o id_pagamento

    String sql = "INSERT INTO consulta (nome_paciente, nome_dentista, tipo_tratamento, prontuario, fk_dentista, fk_paciente, fk_pagamento) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nomePaciente);
        stmt.setString(2, nomeDentista);
        stmt.setString(3, tipoTratamento);
        stmt.setString(4, prontuario);
        stmt.setInt(5, idDentista);
        stmt.setInt(6, idPaciente);
        stmt.setInt(7, idPagamento);

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        carregarConsultas();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoDeletarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarConsultaActionPerformed
        int selectedRow = tabelaConsulta.getSelectedRow();
        
        if (selectedRow >= 0) {
        DefaultTableModel model = (DefaultTableModel) tabelaConsulta.getModel();
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Consulta deletada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma consulta para deletar.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoDeletarConsultaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tabelaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaPacientesActionPerformed
        this.dispose();
        TabelaPacientes tabelaPaciente = new TabelaPacientes();
        tabelaPaciente.setVisible(true);
    }//GEN-LAST:event_tabelaPacientesActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoFecharActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JMenuItem botaoCadastroConsulta;
    private javax.swing.JMenuItem botaoCadastroPaciente;
    private javax.swing.JButton botaoDeletarConsulta;
    private javax.swing.JMenuItem botaoFechar;
    private javax.swing.JMenuItem botaoGestaoEstoque;
    private javax.swing.JMenu botaoOpcoes;
    private javax.swing.JMenuItem botaoPagamentoConsulta;
    private javax.swing.JMenu botaoSair;
    private javax.swing.JMenuItem botaoTabelaFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nomeDentistaBox;
    private javax.swing.JComboBox<String> nomePacienteBox;
    private javax.swing.JTextField respProntuario;
    private javax.swing.JTextField respTratamento;
    private javax.swing.JTable tabelaConsulta;
    private javax.swing.JMenuItem tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
