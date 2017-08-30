/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Vinicius
 */
public class BuscaUsuarioMDI extends javax.swing.JInternalFrame {
    Usuario user = new Usuario();
    /**
     * Creates new form BuscaUsuarioMDI
     */
    public BuscaUsuarioMDI() {
        initComponents();
        Listar();
    }
    public void Listar(){
        try {
            
            DefaultTableModel model = (DefaultTableModel)tblConsulta.getModel();
            model.setNumRows(0);
            UsuarioDAO dao = new UsuarioDAO();        
            
            for(Usuario u: dao.consultar()){
                model.addRow(new Object[]{
                    u.getCpf(),
                    u.getNome(),
                    u.getUsuario(),
                    u.getEmail()
                    
                });  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e);
        }
    }
    
    public void ListarNome(String nome){
        try {
            
            DefaultTableModel model = (DefaultTableModel)tblConsulta.getModel();
            model.setNumRows(0);
            UsuarioDAO dao = new UsuarioDAO();        
            
            for(Usuario u: dao.consultarNome(nome)){
                model.addRow(new Object[]{
                    u.getCpf(),
                    u.getNome(),
                    u.getUsuario(),
                    u.getEmail()
                    
                });  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        lblChave = new javax.swing.JLabel();
        txtChave = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Busca de usuários");

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Nome de usuário", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaMouseClicked(evt);
            }
        });
        tblConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblConsultaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsulta);

        lblChave.setText("Nome:");

        txtChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChaveActionPerformed(evt);
            }
        });
        txtChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChaveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChaveKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnBuscarKeyTyped(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(179, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChave)
                    .addComponent(btnBuscar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(190, 30, 701, 241);
    }// </editor-fold>//GEN-END:initComponents

    private void tblConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaMouseClicked
        if (tblConsulta.getSelectedRow() != -1){
            txtChave.setText(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblConsultaMouseClicked

    private void tblConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConsultaKeyReleased
        if (tblConsulta.getSelectedRow() != -1){
            txtChave.setText(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblConsultaKeyReleased

    private void txtChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChaveActionPerformed

    }//GEN-LAST:event_txtChaveActionPerformed

    private void txtChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ListarNome(txtChave.getText());
        }
    }//GEN-LAST:event_txtChaveKeyPressed

    private void txtChaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyTyped

    }//GEN-LAST:event_txtChaveKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ListarNome(txtChave.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            ListarNome(txtChave.getText());
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyTyped

    }//GEN-LAST:event_btnBuscarKeyTyped

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblConsulta.getSelectedRow() != -1){
            ConfigUsuarioMDI confMDI = new ConfigUsuarioMDI();
            confMDI.user.setUserLog(this.user.getUserLog());
            confMDI.user.setUserCnfg(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 2).toString());
            JDesktopPane desktopPaneT = getDesktopPane();
            desktopPaneT.add(confMDI);
            confMDI.setVisible(true);  
            this.dispose();     
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um usuário para alterar!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblConsulta.getSelectedRow() != -1){
            Usuario user = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            user.setUserLog(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 0).toString());

            dao.excluir(user);
            txtChave.setText("");
            Listar();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um usuário para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChave;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtChave;
    // End of variables declaration//GEN-END:variables
}