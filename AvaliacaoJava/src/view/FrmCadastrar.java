package view;

import model.Cliente;
import uteis.BDcliente;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FrmCadastrar{
    JLabel lblNome,lblLogin,lblSenha,lblEmail;
    JTextField txtNome,txtLogin,txtSenha,txtEmail;
    JButton btnSalvar,btnVoltar;

    public FrmCadastrar(){
        JFrame frame = new JFrame("Cadastro Cliente");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        TitledBorder borda = new TitledBorder("");
        panel.setBorder(borda);

        lblEmail = new JLabel("Email:");
        lblLogin = new JLabel("Login:");
        lblNome = new JLabel("Nome:");
        lblSenha = new JLabel("Senha:");

        txtNome = new JTextField(20);
        txtLogin = new JTextField(20);
        txtEmail = new JTextField(20);
        txtSenha = new JTextField(20);

        btnSalvar = new JButton("SALVAR");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Cliente cliente = new Cliente();
                    cliente.setNome(txtNome.getText());
                    cliente.setLogin(txtLogin.getText());
                    cliente.setSenha(txtSenha.getText());
                    cliente.setEmail(txtEmail.getText());

                    BDcliente c = new BDcliente();
                    c.adicionarRegistro(cliente);
                    JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!", "Cadastro Efetuado", JOptionPane.INFORMATION_MESSAGE);
                    Sucesso();
                } catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Erro, Cadastro não efetuado","ERRO",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnVoltar = new JButton("SAIR");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmLogin login = new FrmLogin();
                frame.dispose();

            }
        });


        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblLogin);
        panel.add(txtLogin);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(lblSenha);
        panel.add(txtSenha);
        panel.add(btnSalvar);
        panel.add(btnVoltar);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private void Sucesso() {
        txtSenha.setText("");
        txtLogin.setText("");
        txtEmail.setText("");
        txtNome.setText("");
    }
}
