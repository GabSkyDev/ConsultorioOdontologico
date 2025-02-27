package consultorio_view;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import consultorio_gabriel_sousa.Conexao;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class TabelaPacientes extends javax.swing.JFrame {

    public TabelaPacientes() {
        initComponents();
        carregarDadosPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoDeletar = new javax.swing.JButton();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Paciente", "CPF", "Data de Nascimento", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botaoDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoDeletar.setText("Deletar Paciente");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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
    
    private void carregarDadosPaciente(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); 

        try {
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT nome, cpf, data_nascimento, email, telefone FROM paciente"; 
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String dataNascimento = rs.getString("data_nascimento");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                model.addRow(new Object[]{nome, cpf, dataNascimento, email, telefone});
            }

        rs.close();
        statement.close();
        connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados dos pacientes.");
        }
    }
    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um paciente para deletar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String cpf = model.getValueAt(selectedRow, 1).toString(); // Obtendo o CPF do paciente selecionado

        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja deletar este paciente? Todas as consultas relacionadas serão apagadas!", "Confirmar Deleção", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection connection = Conexao.getConnection();
                String query = "DELETE FROM paciente WHERE cpf = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, cpf);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    model.removeRow(selectedRow); // Removendo a linha da tabela
                    JOptionPane.showMessageDialog(this, "Paciente deletado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao deletar o paciente.");
                }

                preparedStatement.close();
                connection.close();

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao deletar o paciente.");
            }
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaPacientes().setVisible(true);
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
