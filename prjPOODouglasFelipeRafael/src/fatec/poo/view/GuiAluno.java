package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAluno;
import fatec.poo.model.Aluno;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class GuiAluno extends javax.swing.JFrame {

    public GuiAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbbxSexo = new javax.swing.JComboBox<>();
        cmbbxEstadoCivil = new javax.swing.JComboBox<>();
        cmbbxEscolaridade = new javax.swing.JComboBox<>();
        jftxtCpf = new javax.swing.JFormattedTextField();
        jftxtRg = new javax.swing.JFormattedTextField();
        jftxtCelular = new javax.swing.JFormattedTextField();
        jftxtTelRes = new javax.swing.JFormattedTextField();
        jftxtCep = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        cmbbxEstado = new javax.swing.JComboBox<>();
        jftxtDataNascto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Sexo");

        jLabel4.setText("Endereço");

        jLabel5.setText("Bairro");

        jLabel6.setText("Cidade");

        jLabel7.setText("RG");

        jLabel8.setText("Email");

        jLabel9.setText("Estado Civil");

        jLabel10.setText("Estado");

        jLabel11.setText("Data Nascto");

        jLabel12.setText("Escolaridade");

        jLabel13.setText("N°");

        jLabel14.setText("CEP");

        jLabel15.setText("Tel. Res");

        jLabel16.setText("Celular");

        cmbbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cmbbxSexo.setToolTipText("");
        cmbbxSexo.setEnabled(false);

        cmbbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado" }));
        cmbbxEstadoCivil.setEnabled(false);

        cmbbxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Fundamental", "Ensino Médio", "Ensino Superior", "Pós-graduado" }));
        cmbbxEscolaridade.setEnabled(false);

        try {
            jftxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jftxtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtRg.setEnabled(false);

        try {
            jftxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtCelular.setEnabled(false);
        jftxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftxtCelularActionPerformed(evt);
            }
        });

        try {
            jftxtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtTelRes.setEnabled(false);

        try {
            jftxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtCep.setEnabled(false);

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        txtEmail.setEnabled(false);

        txtNumero.setEnabled(false);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        cmbbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA ", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cmbbxEstado.setEnabled(false);

        try {
            jftxtDataNascto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtDataNascto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jftxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cmbbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel9))
                                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cmbbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cmbbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(109, 109, 109)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel15))
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jftxtCelular)
                                            .addComponent(jftxtTelRes, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jftxtCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jftxtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jftxtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(cmbbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(cmbbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jftxtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jftxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        aluno = daoAluno.consultar(jftxtCpf.getText().replace(".","").replace("-",""));
        int i = jftxtCpf.getText().replace(" ", "").length();
        if(i != 14) {
            JOptionPane.showMessageDialog(null, "O CPF inserido não contém caracteres suficientes. Por favor, digite um CPF válido.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
        } else {
            if(Aluno.validarCPF(jftxtCpf.getText())){
                if (aluno == null){
                jftxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtNome.requestFocus();
                cmbbxSexo.setEnabled(true);
                cmbbxEstadoCivil.setEnabled(true);
                cmbbxEscolaridade.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                jftxtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                cmbbxEstado.setEnabled(true);
                jftxtTelRes.setEnabled(true);
                jftxtCelular.setEnabled(true);
                jftxtRg.setEnabled(true);
                txtEmail.setEnabled(true);
                jftxtDataNascto.setEnabled(true);

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                }
                else{
                    txtNome.setText(aluno.getNome());
                    cmbbxSexo.setSelectedItem(aluno.getSexo());
                    cmbbxEstadoCivil.setSelectedItem(aluno.getEstadoCivil());
                    cmbbxEscolaridade.setSelectedItem(aluno.getEscolaridade());
                    txtEndereco.setText(aluno.getEndereco());
                    txtNumero.setText(Integer.toString(aluno.getNumero()));
                    txtBairro.setText(aluno.getBairro());
                    jftxtCep.setText(aluno.getCep());
                    txtCidade.setText(aluno.getCidade());
                    cmbbxEstado.setSelectedItem(aluno.getEstado());
                    jftxtTelRes.setText(aluno.getTelefone());
                    jftxtCelular.setText(aluno.getCelular());
                    jftxtRg.setText(aluno.getRg());
                    txtEmail.setText(aluno.getEmail());
                    jftxtDataNascto.setText(aluno.getDataNasc());

                    jftxtCpf.setEnabled(false);
                    txtNome.setEnabled(true);
                    txtNome.requestFocus();
                    cmbbxSexo.setEnabled(true);
                    cmbbxEstadoCivil.setEnabled(true);
                    cmbbxEscolaridade.setEnabled(true);
                    txtEndereco.setEnabled(true);
                    txtNumero.setEnabled(true);
                    txtBairro.setEnabled(true);
                    jftxtCep.setEnabled(true);
                    txtCidade.setEnabled(true);
                    cmbbxEstado.setEnabled(true);
                    jftxtTelRes.setEnabled(true);
                    jftxtCelular.setEnabled(true);
                    jftxtRg.setEnabled(true);
                    txtEmail.setEnabled(true);
                    jftxtDataNascto.setEnabled(true);

                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(false);
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "O CPF inserido é inválido. Por favor, digite um CPF válido.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jftxtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftxtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftxtCelularActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("root","root");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoAluno = new DaoAluno(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        aluno = new Aluno(jftxtCpf.getText().replace(".","").replace("-","").replace(" ", ""),txtNome.getText());
        aluno.setEndereco(txtEndereco.getText());
        aluno.setDataNasc(jftxtDataNascto.getText().replace("/","").replace(" ", ""));
        if(!(txtNumero.getText().equals(""))){
            aluno.setNumero(parseInt(txtNumero.getText()));
        }
        aluno.setBairro(txtBairro.getText());
        aluno.setCidade(txtCidade.getText());
        aluno.setEstado(String.valueOf(cmbbxEstado.getSelectedItem()));
        aluno.setCep(jftxtCep.getText().replace("-", "").replace(" ", ""));
        aluno.setTelefone(jftxtTelRes.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        aluno.setCelular(jftxtCelular.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        aluno.setSexo(String.valueOf(cmbbxSexo.getSelectedItem()));
        aluno.setEstadoCivil(String.valueOf(cmbbxEstadoCivil.getSelectedItem()));
        aluno.setRg(jftxtRg.getText().replace(".", "").replace("-", "").replace(" ", ""));
        aluno.setEmail(txtEmail.getText());
        aluno.setEscolaridade(String.valueOf(cmbbxEscolaridade.getSelectedItem())); 
        daoAluno.inserir(aluno);
         
        jftxtCpf.setText("");
        txtNome.setText("");
        jftxtDataNascto.setText("");
        cmbbxSexo.setSelectedIndex(0);
        cmbbxEstadoCivil.setSelectedIndex(0);
        cmbbxEscolaridade.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        jftxtCep.setText("");
        txtCidade.setText("");
        cmbbxEstado.setSelectedIndex(0);
        jftxtTelRes.setText("");
        jftxtCelular.setText("");
        jftxtRg.setText("");
        txtEmail.setText("");
        
        
        btnInserir.setEnabled(false);
        jftxtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        jftxtDataNascto.setEnabled(false);
        cmbbxSexo.setEnabled(false);
        cmbbxEstadoCivil.setEnabled(false);
        cmbbxEscolaridade.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        jftxtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        cmbbxEstado.setEnabled(false);
        jftxtTelRes.setEnabled(false);
        jftxtCelular.setEnabled(false);
        jftxtRg.setEnabled(false);
        txtEmail.setEnabled(false);
        
        
        jftxtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma alteração?") == 0){
            aluno.setNome(txtNome.getText());
            aluno.setEndereco(txtEndereco.getText());
            aluno.setDataNasc(jftxtDataNascto.getText().replace("/","").replace(" ", ""));
            if(!(txtNumero.getText().replace(".", "").replace("-", "").replace(" ", "").equals(""))){
                aluno.setNumero(parseInt(txtNumero.getText()));
            }
            aluno.setBairro(txtBairro.getText());
            aluno.setCidade(txtCidade.getText());
            aluno.setEstado(String.valueOf(cmbbxEstado.getSelectedItem()));
            aluno.setCep(jftxtCep.getText().replace("-", "").replace(" ", ""));
            aluno.setTelefone(jftxtTelRes.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            aluno.setCelular(jftxtCelular.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            aluno.setSexo(String.valueOf(cmbbxSexo.getSelectedItem()));
            aluno.setEstadoCivil(String.valueOf(cmbbxEstadoCivil.getSelectedItem()));
            aluno.setRg(jftxtRg.getText().replace(".", "").replace("-", "").replace(" ", ""));
            aluno.setEmail(txtEmail.getText());
            aluno.setEscolaridade(String.valueOf(cmbbxEscolaridade.getSelectedItem()));
           daoAluno.alterar(aluno);
        } 
        
        jftxtCpf.setText("");
        txtNome.setText("");
        jftxtDataNascto.setText("");
        cmbbxSexo.setSelectedIndex(0);
        cmbbxEstadoCivil.setSelectedIndex(0);
        cmbbxEscolaridade.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        jftxtCep.setText("");
        txtCidade.setText("");
        cmbbxEstado.setSelectedIndex(0);
        jftxtTelRes.setText("");
        jftxtCelular.setText("");
        jftxtRg.setText("");
        txtEmail.setText("");
        
        
        btnInserir.setEnabled(false);
        jftxtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        jftxtDataNascto.setEnabled(false);
        cmbbxSexo.setEnabled(false);
        cmbbxEstadoCivil.setEnabled(false);
        cmbbxEscolaridade.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        jftxtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        cmbbxEstado.setEnabled(false);
        jftxtTelRes.setEnabled(false);
        jftxtCelular.setEnabled(false);
        jftxtRg.setEnabled(false);
        txtEmail.setEnabled(false);
        
        
        jftxtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma exclusão?") == 0){
            daoAluno.excluir(aluno); 
            
            jftxtCpf.setText("");
            txtNome.setText("");
            jftxtDataNascto.setText("");
            cmbbxSexo.setSelectedIndex(0);
            cmbbxEstadoCivil.setSelectedIndex(0);
            cmbbxEscolaridade.setSelectedIndex(0);
            txtEndereco.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            jftxtCep.setText("");
            txtCidade.setText("");
            cmbbxEstado.setSelectedIndex(0);
            jftxtTelRes.setText("");
            jftxtCelular.setText("");
            jftxtRg.setText("");
            txtEmail.setText("");


            btnInserir.setEnabled(false);
            jftxtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            jftxtDataNascto.setEnabled(false);
            cmbbxSexo.setEnabled(false);
            cmbbxEstadoCivil.setEnabled(false);
            cmbbxEscolaridade.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtBairro.setEnabled(false);
            jftxtCep.setEnabled(false);
            txtCidade.setEnabled(false);
            cmbbxEstado.setEnabled(false);
            jftxtTelRes.setEnabled(false);
            jftxtCelular.setEnabled(false);
            jftxtRg.setEnabled(false);
            txtEmail.setEnabled(false);


            jftxtCpf.requestFocus();

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbbxEscolaridade;
    private javax.swing.JComboBox<String> cmbbxEstado;
    private javax.swing.JComboBox<String> cmbbxEstadoCivil;
    private javax.swing.JComboBox<String> cmbbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jftxtCelular;
    private javax.swing.JFormattedTextField jftxtCep;
    private javax.swing.JFormattedTextField jftxtCpf;
    private javax.swing.JFormattedTextField jftxtDataNascto;
    private javax.swing.JFormattedTextField jftxtRg;
    private javax.swing.JFormattedTextField jftxtTelRes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
    private DaoAluno daoAluno=null;
    private Aluno aluno=null;
    private Conexao conexao=null;
}
