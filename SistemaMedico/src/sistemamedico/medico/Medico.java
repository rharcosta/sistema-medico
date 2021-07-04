package sistemamedico.medico;


import java.awt.Color;
import sistemamedico.util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemamedico.Login;

public class Medico extends javax.swing.JFrame {

    public Medico() {
        initComponents();
         
        conexao = new Conexao();
        conexao.abrirConexao();
        
        Color minhaCor = new Color(88, 151, 143);
        getContentPane().setBackground(minhaCor);
    }

    Conexao conexao;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        TxtRG = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        BtnVoltat = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Médico");
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Não é cadastrado? Clique aqui");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        TxtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtRG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 255));
        jLabel2.setText("de Login");

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 255));
        jLabel3.setText("Senha:");

        BtnEntrar.setBackground(new java.awt.Color(255, 140, 0));
        BtnEntrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(248, 248, 255));
        BtnEntrar.setText("ENTRAR");
        BtnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnVoltat.setBackground(new java.awt.Color(255, 140, 0));
        BtnVoltat.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        BtnVoltat.setForeground(new java.awt.Color(248, 248, 255));
        BtnVoltat.setText("VOLTAR");
        BtnVoltat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVoltat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltatActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(255, 140, 0));
        BtnLimpar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(248, 248, 255));
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 255));
        jLabel4.setText("Registro Geral (RG):");

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 255));
        jLabel5.setText("Entre com as suas informações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnVoltat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtRG, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVoltat)
                    .addComponent(BtnEntrar)
                    .addComponent(BtnLimpar))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltatActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVoltatActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        TxtRG.setText(null);
        TxtSenha.setText(null);
        TxtRG.grabFocus();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        new cadastroMedico().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        boolean consulta = false;
            try {
                if (TxtRG.equals("") || TxtSenha.equals("")) {
                    throw new Exception("Por favor, preencha todos os campos!");
                }
                String query = "SELECT * FROM Login WHERE Pessoa_RG=? AND senha=?";
                PreparedStatement stmt = conexao.connection.prepareStatement(query);
                stmt.setString(1, TxtRG.getText());
                stmt.setString(2, TxtSenha.getText());
                ResultSet RS = stmt.executeQuery();
                while (RS.next()) {
                    consulta = true;

                    //ABRIR O MENU PRINCIPAL!
                    new principalMedico().setVisible(true);
                    dispose();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro Comando SQL" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(Medico.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if (!consulta) {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos, por favor revise seus dados!", "Login", JOptionPane.PLAIN_MESSAGE);
            TxtRG.setText(null);
            TxtSenha.setText(null);
            TxtRG.grabFocus();
        }
    }//GEN-LAST:event_BtnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnVoltat;
    private javax.swing.JTextField TxtRG;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
