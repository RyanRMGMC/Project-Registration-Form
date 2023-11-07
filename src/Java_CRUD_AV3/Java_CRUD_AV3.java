/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_CRUD_AV3;

//Imports necessários
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.util.Vector;

public class Java_CRUD_AV3 extends javax.swing.JFrame {

    private static final String usuario = "root"; //usuário do banco
    private static final String senha = "Bahia@1988"; //senha do banco
    private static final String banco = "jdbc:mysql://localhost:3306/formProjetos"; //caminho do banco
    
    //Criando os conectores do banco
    Connection sqlConn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int q, i, deleteItem; //variáveis para usarmos mais tarde
    
    public Java_CRUD_AV3() {
        initComponents();
        upDateDB();
    }
    
    //===============================FUNÇÕES====================================
    
    public void upDateDB(){
        /*Essa função faz o papel da classe Conexão.
          Ela conecta cada componente do seu Banco de Dados*/
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //inicia o Driver
            sqlConn = DriverManager.getConnection(banco, usuario, senha); //realiza a conexão
            stmt = sqlConn.prepareStatement("SELECT * FROM Projetos"); //faz o script para mostrar tudo na tabela
            
            rs = stmt.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount(); //vai pegar o número da coluna e armazenar numa variável
            
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for(i = 1; i <= q; i++){ //vai percorrer todas as colunas
                    columnData.add(rs.getString("ID"));
                    columnData.add(rs.getString("Titulo"));
                    columnData.add(rs.getString("Categoria"));
                    columnData.add(rs.getString("Cidade"));
                    columnData.add(rs.getString("Estado"));
                    columnData.add(rs.getString("Descricao"));
                }
                RecordTable.addRow(columnData);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //=============================FIM DAS FUNÇÕES==============================
    
    CadastroAlunos alunos = new CadastroAlunos(); //Instância do formulário de cadastro de alunos.

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnDeletar = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnCadastrarAlunos = new javax.swing.JButton();
        jbtnReset1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDescricao = new javax.swing.JTextArea();
        jcboxUF = new javax.swing.JComboBox<>();
        jcboxCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Categoria", "Cidade", "UF", "Descrição"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 160));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 890, 180));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jbtnDeletar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 40));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPrint.setText("Imprimir");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        jbtnAlterar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 40));

        jbtnCadastrarAlunos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCadastrarAlunos.setText("Cadastrar Alunos");
        jbtnCadastrarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarAlunosActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnCadastrarAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 40));

        jbtnReset1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset1.setText("Resetar");
        jbtnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReset1ActionPerformed(evt);
            }
        });
        jPanel13.add(jbtnReset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 40));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 250, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("Cadastro de Projetos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 830, 80));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Título");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jtxtTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloActionPerformed(evt);
            }
        });
        jPanel14.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 500, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ID");
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jtxtID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel14.add(jtxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 500, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Categoria");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cidade");
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jtxtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel14.add(jtxtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 500, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("UF");
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Descrição");
        jPanel14.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jtxtDescricao.setColumns(20);
        jtxtDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtDescricao.setLineWrap(true);
        jtxtDescricao.setRows(5);
        jtxtDescricao.setWrapStyleWord(true);
        jtxtDescricao.setAutoscrolls(false);
        jScrollPane1.setViewportView(jtxtDescricao);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 500, 180));

        jcboxUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcboxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcboxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxUFActionPerformed(evt);
            }
        });
        jPanel14.add(jcboxUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jcboxCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Astronomia", "Biologia", "Cidadania", "Engenharia", "Física", "Gastronomia", "Linguagens", "Matemática", "Psicologia", "Química", "Saúde", "Sociologia", "Tecnologia" }));
        jcboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxCategoriaActionPerformed(evt);
            }
        });
        jPanel14.add(jcboxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 500, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 630, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        
        try{
            //Estabelece a conexão
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(banco, usuario, senha);
                                  
            //Adciona os dados digitados
            String uf = jcboxUF.getSelectedItem().toString(); //Pega o Estado selecionado e transforma em String
            String categ = jcboxCategoria.getSelectedItem().toString(); //Pega a Categoria selecionada e transforma em String
            
            stmt = sqlConn.prepareStatement("UPDATE Projetos SET Titulo = ?, Categoria = ?, Cidade = ?,"
                    + "Estado = ?, Descricao = ? WHERE ID = ?");
            
            stmt.setString(6, jtxtID.getText());
            stmt.setString(1, jtxtTitulo.getText());
            stmt.setString(2, categ);
            stmt.setString(3, jtxtCidade.getText());
            stmt.setString(4, uf);
            stmt.setString(5, jtxtDescricao.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
            upDateDB(); //carrega os dados atualizados do seu banco
            
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        
        try{
            //Estabelece a conexão
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(banco, usuario, senha);
                                  
            //Adciona os dados digitados
            String uf = jcboxUF.getSelectedItem().toString(); //Pega o Estado selecionado e transforma em String
            String categ = jcboxCategoria.getSelectedItem().toString(); //Pega a Categoria selecionada e transforma em String
            
            stmt = sqlConn.prepareStatement("INSERT INTO Projetos(ID, Titulo, Categoria, Cidade, Estado, Descricao)"
                    + "VALUES (?,?,?,?,?,?)");
            stmt.setString(1, jtxtID.getText());
            stmt.setString(2, jtxtTitulo.getText());
            stmt.setString(3, categ);
            stmt.setString(4, jtxtCidade.getText());
            stmt.setString(5, uf);
            stmt.setString(6, jtxtDescricao.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Projeto cadastrado com sucesso!");
            upDateDB(); //carrega os dados atualizados do seu banco
            
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header = new MessageFormat("Processando...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try{
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
            
        }catch(java.awt.print.PrinterException e){
            System.err.format("Impressora não encontrada", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jtxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTituloActionPerformed

    private void jbtnCadastrarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarAlunosActionPerformed
        alunos.setVisible(true);
    }//GEN-LAST:event_jbtnCadastrarAlunosActionPerformed

    private void jcboxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboxUFActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int selectedRows = jTable1.getSelectedRow();
        
        try{
            
            deleteItem = JOptionPane.showConfirmDialog(null, "Confirme se você quer deletar um item.", "ALERTA!", 
                    JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(banco, usuario, senha);
                stmt = sqlConn.prepareStatement("DELETE FROM Projetos WHERE ID = ?"); //Manda o script para deletar
                
                stmt.setString(1, jtxtID.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Remoção dos dados concluída!");
                upDateDB();
                
                //Reseta os campos do formulário
                jtxtID.setText("");
                jtxtID.requestFocus();
                jtxtTitulo.setText("");
                jcboxCategoria.setSelectedIndex(0);
                jtxtCidade.setText("");
                jtxtDescricao.setText("");
                jcboxUF.setSelectedIndex(0);
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }catch(SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReset1ActionPerformed
        jtxtTitulo.setText("");
        jtxtID.setText("");
        jcboxCategoria.setSelectedIndex(0);
        jtxtCidade.setText("");
        jtxtDescricao.setText("");
        jcboxUF.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnReset1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /*Basicamente, vai preencher automaticamente os dados ao clicar em uma
        das linhas já preenchidas da tabela.*/
        
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int selectedRows = jTable1.getSelectedRow();
        
        jtxtID.setText(RecordTable.getValueAt(selectedRows, 0).toString());
        jtxtTitulo.setText(RecordTable.getValueAt(selectedRows, 1).toString());
        jcboxCategoria.setSelectedItem(RecordTable.getValueAt(selectedRows, 2).toString());
        jtxtCidade.setText(RecordTable.getValueAt(selectedRows, 3).toString());
        jcboxUF.setSelectedItem(RecordTable.getValueAt(selectedRows, 4).toString());
        jtxtDescricao.setText(RecordTable.getValueAt(selectedRows, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jcboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboxCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_CRUD_AV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_CRUD_AV3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnCadastrarAlunos;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset1;
    private javax.swing.JComboBox<String> jcboxCategoria;
    private javax.swing.JComboBox<String> jcboxUF;
    private javax.swing.JTextField jtxtCidade;
    private javax.swing.JTextArea jtxtDescricao;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables

}
