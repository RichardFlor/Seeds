package com.mycompany.projeto.Dashboard;


import com.mycompany.projeto.TableCustom.TableCustom;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.projeto.JDBC.MySQL;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Richard
 */
public class AdminDonatario extends javax.swing.JPanel {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdminDonatario() {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        lblCadastrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonatario = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblClose2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 590));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        lblCadastrar.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(25, 118, 211));
        lblCadastrar.setText("Cadastrar");
        lblCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });

        tableDonatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Editar/Excluir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDonatario.setToolTipText("");
        tableDonatario.setRowHeight(40);
        jScrollPane1.setViewportView(tableDonatario);
        if (tableDonatario.getColumnModel().getColumnCount() > 0) {
            tableDonatario.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableDonatario.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableDonatario.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconLupa.png")); // NOI18N

        txtPesquisa.setBackground(new java.awt.Color(235, 235, 235));
        txtPesquisa.setBorder(null);
        txtPesquisa.setCaretPosition(0);
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        lblClose2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClose2.setForeground(new java.awt.Color(255, 255, 255));
        lblClose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconSair.png")); // NOI18N
        lblClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose2.setName(""); // NOI18N
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblCadastrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCadastrar)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        new AdminCadastroEstoque().setVisible(true);


    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisarDonatario();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    //Método para listar os dados do banco na tabela
    public void carregarTabela() {
        connection = MySQL.conector();

        DefaultTableModel modelo = (DefaultTableModel) tableDonatario.getModel();
        modelo.setNumRows(0);

        tableDonatario.getColumnModel().getColumn(0).setPreferredWidth(80);
        tableDonatario.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableDonatario.getColumnModel().getColumn(2).setPreferredWidth(10);

        try {

            pst = connection.prepareStatement("select nome,cpf from tblUsuario where perfil='donatario';");
            rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    //Começa no dois por que nao quero trazer o campo idItem do mySql
                    rs.getString(1),
                    rs.getString(2)
                // rs.getString(3)

                });
            }

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a Tabela de dados: " + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

        //método para pesquisa avançada no banco com filtro
    private void pesquisarDonatario() {
        String sql = "SELECT nome, cpf FROM tblUsuario WHERE nome LIKE ? AND perfil = 'donatario';";
        try {
            pst = connection.prepareStatement(sql);
            //Passando o conteudo da caixa de pesquisa para o ?
            //atenção ao "%" - continuação da String sql
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();

            //A linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            tableDonatario.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblClose2;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    private javax.swing.JTable tableDonatario;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
