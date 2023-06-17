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
        lblRemoverUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonatario = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblClose2 = new javax.swing.JLabel();
        lblNomeDonatario = new javax.swing.JLabel();
        txtIdDonatario = new javax.swing.JTextField();
        txtEmailDonatario = new javax.swing.JTextField();
        txtSenhaDonatario = new javax.swing.JTextField();
        txtTelefoneDonatario = new javax.swing.JTextField();
        txtCpfDonatario = new javax.swing.JTextField();
        txtRuaDonatario = new javax.swing.JTextField();
        txtBairroDonatario = new javax.swing.JTextField();
        txtNumeroDonatario = new javax.swing.JTextField();
        txtCepDonatario = new javax.swing.JTextField();
        txtCidadeDonatario = new javax.swing.JTextField();
        txtPerfilDonatario = new javax.swing.JTextField();
        txtNomeDonatario = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 590));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        lblRemoverUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblRemoverUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblRemoverUsuario.setText("Remover");
        lblRemoverUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemoverUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoverUsuarioMouseClicked(evt);
            }
        });

        tableDonatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do donatario", "Nome", "Email", "Senha", "Telefone", "CPF", "Rua", "Bairro", "Numero", "CEP", "Cidade", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDonatario.setToolTipText("");
        tableDonatario.setRowHeight(40);
        tableDonatario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDonatarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDonatario);
        if (tableDonatario.getColumnModel().getColumnCount() > 0) {
            tableDonatario.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableDonatario.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconLupa.png")); // NOI18N

        txtPesquisa.setBackground(new java.awt.Color(235, 235, 235));
        txtPesquisa.setBorder(null);
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

        lblNomeDonatario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeDonatario.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeDonatario.setText("Doanatario selecionado:");

        txtIdDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtIdDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtIdDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtEmailDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtEmailDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmailDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEmailDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtSenhaDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtSenhaDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtSenhaDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenhaDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSenhaDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtTelefoneDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefoneDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtTelefoneDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefoneDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTelefoneDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCpfDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtCpfDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtCpfDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCpfDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCpfDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtRuaDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtRuaDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtRuaDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRuaDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRuaDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtBairroDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtBairroDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtBairroDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBairroDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBairroDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtNumeroDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtNumeroDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumeroDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNumeroDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCepDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtCepDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtCepDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCepDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCepDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCidadeDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtCidadeDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtCidadeDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCidadeDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCidadeDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtPerfilDonatario.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilDonatario.setBorder(new javax.swing.border.MatteBorder(null));
        txtPerfilDonatario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPerfilDonatario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPerfilDonatario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtNomeDonatario.setBackground(new java.awt.Color(235, 235, 235));
        txtNomeDonatario.setBorder(null);

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRemoverUsuario)
                .addGap(383, 383, 383))
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblNomeDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRuaDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCepDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidadeDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerfilDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDonatario)
                    .addComponent(txtIdDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuaDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerfilDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtNomeDonatario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblRemoverUsuario)
                .addGap(24, 24, 24))
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

    private void lblRemoverUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoverUsuarioMouseClicked
       // new AdminCadastroDonatario().setVisible(true);
       deletar();
    }//GEN-LAST:event_lblRemoverUsuarioMouseClicked

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisarDonatario();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tableDonatarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDonatarioMouseClicked
        setarCampos();
    }//GEN-LAST:event_tableDonatarioMouseClicked

    //Método para listar os dados do banco na tabela
    public void carregarTabela() {
        connection = MySQL.conector();

        DefaultTableModel modelo = (DefaultTableModel) tableDonatario.getModel();
        modelo.setNumRows(0);

        tableDonatario.getColumnModel().getColumn(0).setPreferredWidth(20);
        tableDonatario.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableDonatario.getColumnModel().getColumn(2).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(3).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(4).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(5).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(6).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(7).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(8).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(9).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(10).setPreferredWidth(1);
        tableDonatario.getColumnModel().getColumn(11).setPreferredWidth(1);
      

        try {

            pst = connection.prepareStatement("select * from tblUsuario where perfil='donatario';");
            rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    //Começa no dois por que nao quero trazer o campo idItem do mySql
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12)
                

                });
            }

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a Tabela de dados: " + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

        //método para pesquisa avançada no banco com filtro
    private void pesquisarDonatario() {
        String sql = "SELECT * FROM tblUsuario WHERE nome LIKE ? AND perfil = 'donatario';";
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
    
    // Método para preencher os campos do formulário com o conteúdo da tabela
public void setarCampos() {
    int setar = tableDonatario.getSelectedRow();
    
    txtIdDonatario.setText(getValueFromTable(setar, 0));
    txtNomeDonatario.setText(getValueFromTable(setar, 1));
    txtEmailDonatario.setText(getValueFromTable(setar, 2));
    txtSenhaDonatario.setText(getValueFromTable(setar, 3));
    txtTelefoneDonatario.setText(getValueFromTable(setar, 4));
    txtCpfDonatario.setText(getValueFromTable(setar, 5));
    txtRuaDonatario.setText(getValueFromTable(setar, 6));
    txtBairroDonatario.setText(getValueFromTable(setar, 7));
    txtNumeroDonatario.setText(getValueFromTable(setar, 8));
    txtCepDonatario.setText(getValueFromTable(setar, 9));
    txtCidadeDonatario.setText(getValueFromTable(setar, 10));
    txtPerfilDonatario.setText(getValueFromTable(setar, 11));
}

// Método auxiliar para obter o valor da tabela, tratando valores nulos
private String getValueFromTable(int row, int column) {
    Object value = tableDonatario.getModel().getValueAt(row, column);
    return (value != null) ? value.toString() : "";
}

  //Metodo para deletar 
    private void deletar(){
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja remover este donatario?","Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
           
            String sql = "delete from tblUsuario where idUsuario=?";
            try {
                pst = connection.prepareStatement(sql);
              
                pst.setString(1, txtIdDonatario.getText());
                int apagado = pst.executeUpdate();
                if(apagado > 0 ){
                    JOptionPane.showMessageDialog(null,"Doanatário removido com sucesso");
                    txtIdDonatario.setText(null);
                    txtNomeDonatario.setText(null);
                    txtEmailDonatario.setText(null);
                    txtSenhaDonatario.setText(null);
                    txtTelefoneDonatario.setText(null);
                    txtCpfDonatario.setText(null);
                    txtRuaDonatario.setText(null);
                    txtBairroDonatario.setText(null);
                    txtNumeroDonatario.setText(null);
                    txtCepDonatario.setText(null);
                    txtCidadeDonatario.setText(null);
                    txtPerfilDonatario.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblNomeDonatario;
    private javax.swing.JLabel lblRemoverUsuario;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    private javax.swing.JTable tableDonatario;
    private javax.swing.JTextField txtBairroDonatario;
    private javax.swing.JTextField txtCepDonatario;
    private javax.swing.JTextField txtCidadeDonatario;
    private javax.swing.JTextField txtCpfDonatario;
    private javax.swing.JTextField txtEmailDonatario;
    private javax.swing.JTextField txtIdDonatario;
    private javax.swing.JTextField txtNomeDonatario;
    private javax.swing.JTextField txtNumeroDonatario;
    private javax.swing.JTextField txtPerfilDonatario;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRuaDonatario;
    private javax.swing.JTextField txtSenhaDonatario;
    private javax.swing.JTextField txtTelefoneDonatario;
    // End of variables declaration//GEN-END:variables
}
