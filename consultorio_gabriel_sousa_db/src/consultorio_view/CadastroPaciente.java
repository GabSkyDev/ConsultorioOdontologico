package consultorio_view;

import consultorio_gabriel_sousa.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastroPaciente extends javax.swing.JFrame {


    public CadastroPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        respNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        respCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        respEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        respTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        respData = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("CPF:");

        respNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Nome do Paciente:");

        respCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Email:");

        respEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Telefone:");

        respTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Data de Nascimento:");

        respData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respData, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(respTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(respEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(respCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(respNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        respNome.setText("");
        respCPF.setText("");
        respEmail.setText("");
        respTelefone.setText("");
        respData.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String nome = respNome.getText();
        String cpf = respCPF.getText();
        String email = respEmail.getText();
        String telefone = respTelefone.getText();
        String data = respData.getText();

        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || telefone.isEmpty() || data.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            Paciente paciente = new Paciente(nome, cpf, email, telefone, data);
            
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorio_db_gabriel_sousa", "root", "root");

                String sql = "INSERT INTO paciente (nome, cpf, email, telefone, data_nascimento) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, paciente.getNome());
                statement.setString(2, paciente.getCPF());
                statement.setString(3, paciente.getEmail());
                statement.setString(4, paciente.getTelefone());
                statement.setString(5, paciente.getDataNascimento());

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar paciente no banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }      
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JMenuItem botaoCadastroConsulta;
    private javax.swing.JMenuItem botaoCadastroPaciente;
    private javax.swing.JMenuItem botaoFechar;
    private javax.swing.JMenuItem botaoGestaoEstoque;
    private javax.swing.JButton botaoLimpar;
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
    private javax.swing.JTextField respCPF;
    private javax.swing.JTextField respData;
    private javax.swing.JTextField respEmail;
    private javax.swing.JTextField respNome;
    private javax.swing.JTextField respTelefone;
    private javax.swing.JMenuItem tabelaPacientes;
    // End of variables declaration//GEN-END:variables
}
