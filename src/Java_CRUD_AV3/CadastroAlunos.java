/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_CRUD_AV3;

//Imports necessários
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class CadastroAlunos extends javax.swing.JFrame {

    private static final String usuario = "root"; //usuário do banco
    private static final String senha = "Bahia@1988"; //senha do banco
    private static final String banco = "jdbc:mysql://localhost:3306/formProjetos"; //caminho do banco
    
    //Criando os conectores do banco
    Connection sqlConn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int q, i,deleteItem;

    public CadastroAlunos() {
        initComponents();
        upDateDB();
    }
    
    public void upDateDB(){
        /*Essa função faz o papel da classe Conexão.
          Ela conecta cada componente do seu Banco de Dados*/
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //inicia o Driver
            sqlConn = DriverManager.getConnection(banco, usuario, senha); //realiza a conexão
            stmt = sqlConn.prepareStatement("SELECT * FROM Equipes"); //faz o script para mostrar tudo na tabela
            
            rs = stmt.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount(); //vai pegar o número da coluna e armazenar numa variável
            
            DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for(i = 1; i <= q; i++){ //vai percorrer todas as colunas
                    columnData.add(rs.getString("ID"));
                    columnData.add(rs.getString("Nome"));
                    columnData.add(rs.getString("CPF"));
                    columnData.add(rs.getString("Telefone"));
                    columnData.add(rs.getString("Email"));
                }
                RecordTable.addRow(columnData);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtEMail1 = new javax.swing.JTextField();
        jtxtNomeAluno1 = new javax.swing.JTextField();
        jtxtCPF1 = new javax.swing.JTextField();
        jtxtTelefone1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtIDProjeto1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jbtnReset2 = new javax.swing.JButton();
        jbtnCadAluno3 = new javax.swing.JButton();
        jbtnAltAluno2 = new javax.swing.JButton();
        jbtnDelAluno2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jbtnReset3 = new javax.swing.JButton();
        jbtnCadAluno4 = new javax.swing.JButton();
        jbtnAltAluno3 = new javax.swing.JButton();
        jbtnDelAluno3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Cadastrar Alunos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 28, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Cadastrar Alunos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 28, 580, 90));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102), 8));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("E-Mail");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nome");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("CPF");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telefone");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jtxtEMail1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jtxtEMail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 290, -1));

        jtxtNomeAluno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jtxtNomeAluno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 290, -1));

        jtxtCPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jtxtCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 290, -1));

        jtxtTelefone1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jtxtTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 290, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ID do Projeto");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jtxtIDProjeto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jtxtIDProjeto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 290, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 460, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102), 8));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Projeto", "Aluno", "CPF", "Telefone", "E-Mail"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 130));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 720, 150));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102), 8));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnReset2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset2.setText("Resetar");
        jbtnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReset2ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnReset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, -1));

        jbtnCadAluno3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCadAluno3.setText("Cadastrar");
        jbtnCadAluno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadAluno3ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnCadAluno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, -1));

        jbtnAltAluno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAltAluno2.setText("Alterar");
        jbtnAltAluno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAltAluno2ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnAltAluno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 130, -1));

        jbtnDelAluno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDelAluno2.setText("Deletar");
        jbtnDelAluno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelAluno2ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnDelAluno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 8));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnReset3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset3.setText("Resetar");
        jbtnReset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReset3ActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnReset3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, -1));

        jbtnCadAluno4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCadAluno4.setText("Cadastrar");
        jbtnCadAluno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadAluno4ActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnCadAluno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, -1));

        jbtnAltAluno3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAltAluno3.setText("Alterar");
        jbtnAltAluno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAltAluno3ActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnAltAluno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 130, -1));

        jbtnDelAluno3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDelAluno3.setText("Deletar");
        jbtnDelAluno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelAluno3ActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnDelAluno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 110, -1, 150));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 250, 200));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 250, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReset2ActionPerformed
        jtxtIDProjeto1.setText("");
        jtxtNomeAluno1.setText("");
        jtxtCPF1.setText("");
        jtxtEMail1.setText("");
        jtxtTelefone1.setText("");
    }//GEN-LAST:event_jbtnReset2ActionPerformed

    private void jbtnCadAluno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadAluno3ActionPerformed
        try{
            //Estabelece a conexão
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(banco, usuario, senha);
                                  
            //Adciona os dados digitados
            stmt = sqlConn.prepareStatement("INSERT INTO Equipes(Nome, CPF, Email, Telefone, ID)"
                    + "VALUES (?,?,?,?,?)");
            stmt.setString(1, jtxtNomeAluno1.getText());
            stmt.setString(2, jtxtCPF1.getText());
            stmt.setString(3, jtxtEMail1.getText());
            stmt.setString(4, jtxtTelefone1.getText());
            stmt.setString(5, jtxtIDProjeto1.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            upDateDB(); //carrega os dados atualizados do seu banco
            
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCadAluno3ActionPerformed

    private void jbtnAltAluno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAltAluno2ActionPerformed
        try{
            //Estabelece a conexão
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(banco, usuario, senha);
                                  
            //Adciona os dados digitados          
            stmt = sqlConn.prepareStatement("UPDATE Equipes SET Nome = ?, ID = ?, Email = ?,"
                    + "Telefone = ? WHERE CPF = ?");
            
            stmt.setString(5, jtxtCPF1.getText());
            stmt.setString(1, jtxtNomeAluno1.getText());
            stmt.setString(2, jtxtIDProjeto1.getText());
            stmt.setString(3, jtxtEMail1.getText());
            stmt.setString(4, jtxtTelefone1.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
            upDateDB(); //carrega os dados atualizados do seu banco
            
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAltAluno2ActionPerformed

    private void jbtnDelAluno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelAluno2ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int selectedRows = jTable2.getSelectedRow();
        
        try{
            
            deleteItem = JOptionPane.showConfirmDialog(null, "Confirme se você quer deletar um item.", "ALERTA!", 
                    JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(banco, usuario, senha);
                stmt = sqlConn.prepareStatement("DELETE FROM Equipes WHERE CPF = ?"); //Manda o script para deletar
                
                stmt.setString(1, jtxtCPF1.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Remoção dos dados concluída!");
                upDateDB();
                
                //Reseta os campos do formulário
                jtxtIDProjeto1.setText("");
                jtxtIDProjeto1.requestFocus();
                jtxtNomeAluno1.setText("");
                jtxtCPF1.setText("");
                jtxtEMail1.setText("");
                jtxtTelefone1.setText("");
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_jbtnDelAluno2ActionPerformed

    private void jbtnReset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReset3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReset3ActionPerformed

    private void jbtnCadAluno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadAluno4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCadAluno4ActionPerformed

    private void jbtnAltAluno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAltAluno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAltAluno3ActionPerformed

    private void jbtnDelAluno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelAluno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDelAluno3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        /*Basicamente, vai preencher automaticamente os dados ao clicar em uma
        das linhas já preenchidas da tabela.*/
        
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int selectedRows = jTable2.getSelectedRow();
        
        jtxtIDProjeto1.setText(RecordTable.getValueAt(selectedRows, 0).toString());
        jtxtNomeAluno1.setText(RecordTable.getValueAt(selectedRows, 1).toString());
        jtxtCPF1.setText(RecordTable.getValueAt(selectedRows, 2).toString());
        jtxtTelefone1.setText(RecordTable.getValueAt(selectedRows, 3).toString());
        jtxtEMail1.setText(RecordTable.getValueAt(selectedRows, 4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton jbtnAltAluno2;
    private javax.swing.JButton jbtnAltAluno3;
    private javax.swing.JButton jbtnCadAluno3;
    private javax.swing.JButton jbtnCadAluno4;
    private javax.swing.JButton jbtnDelAluno2;
    private javax.swing.JButton jbtnDelAluno3;
    private javax.swing.JButton jbtnReset2;
    private javax.swing.JButton jbtnReset3;
    private javax.swing.JTextField jtxtCPF1;
    private javax.swing.JTextField jtxtEMail1;
    private javax.swing.JTextField jtxtIDProjeto1;
    private javax.swing.JTextField jtxtNomeAluno1;
    private javax.swing.JTextField jtxtTelefone1;
    // End of variables declaration//GEN-END:variables


}
