package consultorio_view;

import javax.swing.JOptionPane;
import java.util.Random;
import consultorio_gabriel_sousa.Conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PagamentoConsulta extends javax.swing.JFrame {

    public PagamentoConsulta() {
        initComponents();
        gerarNotaFiscal();
        carregarDadosTabela();
        carregarPacientes();
    }
    
    private int getPacienteId(String nomePaciente) throws SQLException {
    try (Connection conn = Conexao.getConnection()) {
        String sql = "SELECT id_paciente FROM paciente WHERE nome = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomePaciente);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_paciente");
            }
        }
    }
    return -1;
}
    
    private void carregarPacientes() {
        try (Connection conn = Conexao.getConnection()) {
            String sql = "SELECT nome FROM paciente";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                pacienteBox.removeAllItems();
                while (rs.next()) {
                    String nomePaciente = rs.getString("nome");
                    pacienteBox.addItem(nomePaciente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os pacientes.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarDadosTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        try (Connection conn = Conexao.getConnection()) {
            String sql = "SELECT paciente.nome, pagamento.valor, pagamento.tipo_pagamento, pagamento.parcelas " +
                         "FROM pagamento " +
                         "JOIN consulta ON pagamento.id_pagamento = consulta.fk_pagamento " +
                         "JOIN paciente ON consulta.fk_paciente = paciente.id_paciente";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    float valor = rs.getFloat("valor");
                    String tipoPagamento = rs.getString("tipo_pagamento");
                    int parcelas = rs.getInt("parcelas");
                    modelo.addRow(new Object[]{nome, valor, tipoPagamento, parcelas});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados da tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        respValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        respParcela = new javax.swing.JTextField();
        botaoConfirmarPagamento = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pacienteBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Selecione o método de pagamento:");

        respValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Digite o nome do Paciente:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito", "Pix" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Digite a quantidade de parcelas:");

        respParcela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        botaoConfirmarPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoConfirmarPagamento.setText("Confirmar Pagamento");
        botaoConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarPagamentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Digite o valor (R$):");

        pacienteBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pacienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito", "Pix" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome do Paciente", "Valor (R$)", "Método de Pagamento", "Quantidade de parcelas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pacienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(respValor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botaoConfirmarPagamento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(pacienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botaoConfirmarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    public int gerarNotaFiscal() {
    Random random = new Random();
    return 1000000 + random.nextInt(9000000);
}
    
    private void botaoConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarPagamentoActionPerformed
        String nomePaciente = (String) pacienteBox.getSelectedItem();
        String tipoPagamento = (String) jComboBox1.getSelectedItem();
        float valor = Float.parseFloat(respValor.getText());
        int parcelas = Integer.parseInt(respParcela.getText());
        int numeroAleatorio = new Random().nextInt(1000000);
        
        try (Connection conn = Conexao.getConnection()) {
            String sql = "INSERT INTO pagamento (valor, tipo_pagamento, parcelas, nota_fiscal) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmt.setFloat(1, valor);
                pstmt.setString(2, tipoPagamento);
                pstmt.setInt(3, parcelas);
                pstmt.setInt(4, numeroAleatorio);
                pstmt.executeUpdate();

                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int idPagamento = rs.getInt(1);

                    String sqlUpdateConsulta = "UPDATE consulta SET fk_pagamento = ? WHERE fk_paciente = ?";
                    try (PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdateConsulta)) {
                        pstmtUpdate.setInt(1, idPagamento);
                        pstmtUpdate.setInt(2, getPacienteId(nomePaciente));
                        pstmtUpdate.executeUpdate();
                    }
                }
                String mensagem = "Pagamento Confirmado!\n"
                        + "Nome do Paciente: " + nomePaciente + "\n"
                        + "Valor: R$ " + valor + "\n"
                        + "Método de Pagamento: " + tipoPagamento + "\n"
                        + "Parcelas: " + parcelas + "\n"
                        + "Nota Fiscal: " + numeroAleatorio;
                
                JOptionPane.showMessageDialog(null, mensagem, "Confirmação de Pagamento", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao confirmar o pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        carregarDadosTabela();
    }//GEN-LAST:event_botaoConfirmarPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoCadastroConsulta;
    private javax.swing.JMenuItem botaoCadastroPaciente;
    private javax.swing.JButton botaoConfirmarPagamento;
    private javax.swing.JMenuItem botaoFechar;
    private javax.swing.JMenuItem botaoGestaoEstoque;
    private javax.swing.JMenu botaoOpcoes;
    private javax.swing.JMenuItem botaoPagamentoConsulta;
    private javax.swing.JMenu botaoSair;
    private javax.swing.JMenuItem botaoTabelaFuncionarios;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> pacienteBox;
    private javax.swing.JTextField respParcela;
    private javax.swing.JTextField respValor;
    private javax.swing.JMenuItem tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
