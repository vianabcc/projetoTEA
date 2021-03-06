/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
import model.beans.Formacao;
import model.beans.Usuario;
import model.beans.UsuarioGrupo;
import model.dao.FormacaoDAO;
import model.dao.UsuarioDAO;
import model.dao.UsuarioGrupoDAO;

/**
 *
 * @author Vinicius
 */
public class TelaCadastroUsuario extends javax.swing.JFrame{
    /**
     * Creates new form TelaCadastroUsuario
     */
    Usuario user = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();
    Formacao f = new Formacao();
    FormacaoDAO fdao = new FormacaoDAO();
    UsuarioGrupo user_grp = new UsuarioGrupo();
    UsuarioGrupoDAO user_grp_dao = new UsuarioGrupoDAO();
        
    public TelaCadastroUsuario() {
        initComponents();
        txtQtdAulas.setText("0");
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAulas = new javax.swing.ButtonGroup();
        bgAulasP = new javax.swing.ButtonGroup();
        bgAtuouAutismo = new javax.swing.ButtonGroup();
        bgAtuouDeficiencia = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlDados = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lblDataNasc = new javax.swing.JLabel();
        txtfDataNasc = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblInstituicao = new javax.swing.JLabel();
        txtInstituição = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblTempoL = new javax.swing.JLabel();
        txtTempoL = new javax.swing.JTextField();
        lblTempoLA = new javax.swing.JLabel();
        txtTempoLA = new javax.swing.JTextField();
        rbSimAulas = new javax.swing.JRadioButton();
        rbNaoAulas = new javax.swing.JRadioButton();
        lblAulas = new javax.swing.JLabel();
        txtQtdAulas = new javax.swing.JTextField();
        lblAulasP = new javax.swing.JLabel();
        rbSimAulasP = new javax.swing.JRadioButton();
        rbNaoAulasP = new javax.swing.JRadioButton();
        lblAtuouAutismo = new javax.swing.JLabel();
        rbSimAtuaAutismo = new javax.swing.JRadioButton();
        rbNaoAtuaAutismo = new javax.swing.JRadioButton();
        lblAtuouDeficiencia = new javax.swing.JLabel();
        rbSimAtuouDeficiencia = new javax.swing.JRadioButton();
        rbNaoAtuouDeficiencia = new javax.swing.JRadioButton();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblChaveSecreta = new javax.swing.JLabel();
        txtChaveSecreta = new javax.swing.JTextField();
        btnCadastrarU = new javax.swing.JButton();
        btnCancelarU = new javax.swing.JButton();
        lblFormacao = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtfCpf = new javax.swing.JFormattedTextField();
        btnrmv = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFormacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do usuário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNome.setText("Nome Completo");

        lblSexo.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        lblDataNasc.setText("Data de nascimento");

        try {
            txtfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDataNascActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblInstituicao.setText("Instituição");

        lblLocal.setText("Município / Estado");

        lblTempoL.setText("Tempo que leciona");

        lblTempoLA.setText("Tempo que leciona na área de formação");

        bgAulas.add(rbSimAulas);
        rbSimAulas.setText("Sim");
        rbSimAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimAulasActionPerformed(evt);
            }
        });

        bgAulas.add(rbNaoAulas);
        rbNaoAulas.setText("Não");
        rbNaoAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNaoAulasActionPerformed(evt);
            }
        });

        lblAulas.setText("Tem aulas em mais de uma escola? Se sim, quantas?");

        txtQtdAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQtdAulasMouseClicked(evt);
            }
        });
        txtQtdAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdAulasActionPerformed(evt);
            }
        });

        lblAulasP.setText("Alguma delas é de ensino privado?");

        bgAulasP.add(rbSimAulasP);
        rbSimAulasP.setText("Sim");

        bgAulasP.add(rbNaoAulasP);
        rbNaoAulasP.setText("Não");

        lblAtuouAutismo.setText("Atuou ou atua com alguma criança com autismo?");

        bgAtuouAutismo.add(rbSimAtuaAutismo);
        rbSimAtuaAutismo.setText("Sim");

        bgAtuouAutismo.add(rbNaoAtuaAutismo);
        rbNaoAtuaAutismo.setText("Não");

        lblAtuouDeficiencia.setText("Atuou ou atua com alguma criança com outras formas de deficiência?");

        bgAtuouDeficiencia.add(rbSimAtuouDeficiencia);
        rbSimAtuouDeficiencia.setText("Sim");

        bgAtuouDeficiencia.add(rbNaoAtuouDeficiencia);
        rbNaoAtuouDeficiencia.setText("Não");

        lblUsuario.setText("Usuário");

        lblSenha.setText("Senha");

        lblChaveSecreta.setText("Chave secreta");

        btnCadastrarU.setText("Cadastar");
        btnCadastrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUActionPerformed(evt);
            }
        });

        btnCancelarU.setText("Cancelar");
        btnCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUActionPerformed(evt);
            }
        });

        lblFormacao.setText("Formação");

        lblCpf.setText("CPF");

        try {
            txtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnrmv.setText("Remover");
        btnrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvActionPerformed(evt);
            }
        });

        btnadd.setText("Adicionar");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        tblFormacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nível", "Curso"
            }
        ));
        jScrollPane2.setViewportView(tblFormacao);

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome))
                                .addComponent(lblFormacao, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(66, 66, 66)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSexo)
                                .addComponent(lblLocal)
                                .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCpf)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDataNasc)
                                    .addComponent(txtfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtfDataNasc))))
                        .addComponent(lblAtuouDeficiencia)
                        .addComponent(lblInstituicao)
                        .addComponent(lblAtuouAutismo)
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addComponent(rbSimAtuaAutismo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbNaoAtuaAutismo))
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTempoL)
                                .addComponent(txtTempoL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(136, 136, 136)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTempoLA)
                                .addComponent(txtTempoLA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlDadosLayout.createSequentialGroup()
                                        .addComponent(rbSimAulasP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbNaoAulasP))
                                    .addComponent(lblAulasP, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsuario)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSenha))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblChaveSecreta)
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosLayout.createSequentialGroup()
                                        .addComponent(btnCadastrarU)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelarU))
                                    .addComponent(txtChaveSecreta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addComponent(rbSimAtuouDeficiencia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbNaoAtuouDeficiencia))
                        .addComponent(txtInstituição)
                        .addGroup(pnlDadosLayout.createSequentialGroup()
                            .addComponent(rbSimAulas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbNaoAulas)
                            .addGap(77, 77, 77)
                            .addComponent(txtQtdAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblAulas))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadd)
                    .addComponent(btnrmv))
                .addGap(10, 10, 10))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblSexo)
                    .addComponent(lblDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblLocal)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblFormacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrmv))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstituicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstituição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempoL)
                    .addComponent(lblTempoLA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTempoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAulas)
                    .addComponent(lblAulasP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimAulas)
                    .addComponent(rbNaoAulas)
                    .addComponent(txtQtdAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSimAulasP)
                    .addComponent(rbNaoAulasP))
                .addGap(18, 18, 18)
                .addComponent(lblAtuouAutismo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimAtuaAutismo)
                    .addComponent(rbNaoAtuaAutismo))
                .addGap(15, 15, 15)
                .addComponent(lblAtuouDeficiencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimAtuouDeficiencia)
                    .addComponent(rbNaoAtuouDeficiencia))
                .addGap(30, 30, 30)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblSenha)
                    .addComponent(lblChaveSecreta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtChaveSecreta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarU)
                    .addComponent(btnCancelarU))
                .addGap(10, 10, 10))
        );

        jScrollPane1.setViewportView(pnlDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(825, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            btnrmv.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarUActionPerformed

    private void btnCadastrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUActionPerformed
        user_grp.setCpf(txtfCpf.getText());
        user_grp.setId_grupo(1);
        
        user.setCpf(txtfCpf.getText());
        user.setNome(txtNome.getText());
        user.setEmail(txtEmail.getText());
        user.setMunicipio(txtMunicipio.getText());
        user.setData_nasc(txtfDataNasc.getText());
        user.setInstituicao(txtInstituição.getText());
        user.setTempo_leciona(txtTempoL.getText());
        user.setTempo_leciona_area(txtTempoLA.getText());
        user.setQtd_escolas(Integer.parseInt(txtQtdAulas.getText()));
        user.setUsuario(txtUsuario.getText());
        user.setSenha(new String(txtSenha.getPassword()));
        user.setChave_secreta(txtChaveSecreta.getText());
        user.setTipo_user("aluno");
        
        switch(cbSexo.getSelectedIndex()){
            case 1:
            user.setSexo("F");
            break;
            case 2:
            user.setSexo("M");
            break;
        }
       
        if(rbSimAulas.isSelected())
            user.setAulas_mais_uma_escola(true);
        if(rbNaoAulas.isSelected())
            user.setAulas_mais_uma_escola(false);

        if(rbSimAulasP.isSelected())
            user.setEscola_privada(true);
        if(rbNaoAulasP.isSelected())
            user.setEscola_privada(false);

        if(rbSimAtuaAutismo.isSelected())
            user.setAtua_autismo(true);
        if(rbNaoAtuaAutismo.isSelected())
            user.setAtua_autismo(false);

        if(rbSimAtuouDeficiencia.isSelected())
            user.setAtuou_deficiencia(true);
        if(rbNaoAtuouDeficiencia.isSelected())
            user.setAtuou_deficiencia(false);
        
        if(tblFormacao.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Adicione pelo menos uma formação!");
        }else{
            user_grp_dao.relaciona_user_grp(user_grp);
            dao.cadastrar(user);
            f.setCpf(user.getCpf());
            for(int i=0; i < tblFormacao.getRowCount(); i++){
                f.setNivel(tblFormacao.getValueAt(i, 0).toString());
                f.setCurso(tblFormacao.getValueAt(i, 1).toString());
                fdao.cadastrar(f);
            }
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCadastrarUActionPerformed

    private void txtQtdAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdAulasActionPerformed

    }//GEN-LAST:event_txtQtdAulasActionPerformed

    private void txtQtdAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQtdAulasMouseClicked
        txtQtdAulas.selectAll();
    }//GEN-LAST:event_txtQtdAulasMouseClicked

    private void rbNaoAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNaoAulasActionPerformed
        txtQtdAulas.setText("0");
        txtQtdAulas.setVisible(false);
    }//GEN-LAST:event_rbNaoAulasActionPerformed

    private void rbSimAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimAulasActionPerformed
        txtQtdAulas.setText("Quantas?");
        txtQtdAulas.setVisible(true);
    }//GEN-LAST:event_rbSimAulasActionPerformed

    private void txtfDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDataNascActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void btnrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvActionPerformed
        if(tblFormacao.getSelectedRow() != -1){
            ((DefaultTableModel) tblFormacao.getModel()).removeRow(tblFormacao.getSelectedRow());
            if(tblFormacao.getRowCount() == 0)
                btnrmv.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para remover!");
        }
    }//GEN-LAST:event_btnrmvActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if(tblFormacao.getRowCount() == 0)
            btnrmv.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblFormacao.getModel();
        Object[] linha = {"",""};
        model.addRow(linha);
        
    }//GEN-LAST:event_btnaddActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAtuouAutismo;
    private javax.swing.ButtonGroup bgAtuouDeficiencia;
    private javax.swing.ButtonGroup bgAulas;
    private javax.swing.ButtonGroup bgAulasP;
    private javax.swing.JButton btnCadastrarU;
    private javax.swing.JButton btnCancelarU;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnrmv;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAtuouAutismo;
    private javax.swing.JLabel lblAtuouDeficiencia;
    private javax.swing.JLabel lblAulas;
    private javax.swing.JLabel lblAulasP;
    private javax.swing.JLabel lblChaveSecreta;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblInstituicao;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTempoL;
    private javax.swing.JLabel lblTempoLA;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JRadioButton rbNaoAtuaAutismo;
    private javax.swing.JRadioButton rbNaoAtuouDeficiencia;
    private javax.swing.JRadioButton rbNaoAulas;
    private javax.swing.JRadioButton rbNaoAulasP;
    private javax.swing.JRadioButton rbSimAtuaAutismo;
    private javax.swing.JRadioButton rbSimAtuouDeficiencia;
    private javax.swing.JRadioButton rbSimAulas;
    private javax.swing.JRadioButton rbSimAulasP;
    private javax.swing.JTable tblFormacao;
    private javax.swing.JTextField txtChaveSecreta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtInstituição;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdAulas;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTempoL;
    private javax.swing.JTextField txtTempoLA;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JFormattedTextField txtfCpf;
    private javax.swing.JFormattedTextField txtfDataNasc;
    // End of variables declaration//GEN-END:variables
}
