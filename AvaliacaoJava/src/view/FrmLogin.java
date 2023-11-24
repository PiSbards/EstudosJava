package view;

import model.Cliente;
import uteis.BDcliente;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FrmLogin {
    JButton btnEntrar, btnCadastrar;
    JLabel lblLogin,lblSenha;
    JTextField txtLogin, txtSenha;
    public FrmLogin() {
        JFrame frame = new JFrame("Log In");
        frame.setSize(600,150);
        frame.setLayout(new BorderLayout());


        JPanel panelLogin = new JPanel();
        TitledBorder borda = new TitledBorder("");
        panelLogin.setBorder(borda);


        btnEntrar = new JButton("ENTRAR");
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Cliente cliente = new Cliente();
                    cliente.setLogin(txtLogin.getText());
                    cliente.setSenha(txtSenha.getText());

                    BDcliente c = new BDcliente();
                    c.loginEfetuado(cliente);
                    JOptionPane.showMessageDialog(null, "LOGIN COM SUCESSO!", "Log In Efetuado", JOptionPane.INFORMATION_MESSAGE);
                    Sucesso();
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null,"Erro no login!");
                }
            }
        });

        btnCadastrar = new JButton("CADASTRAR NOVO USUÁRIO");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmCadastrar cadastro = new FrmCadastrar();
                frame.dispose();
            }
        });


        lblLogin = new JLabel("Login:");
        lblSenha = new JLabel("Senha:");
        txtLogin = new JTextField(20);
        txtSenha = new JTextField(20);

        panelLogin.add(lblLogin);
        panelLogin.add(txtLogin);
        panelLogin.add(lblSenha);
        panelLogin.add(txtSenha);
        panelLogin.add(btnEntrar);
        panelLogin.add(btnCadastrar);



        frame.add(panelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private void Sucesso(){
        txtSenha.setText("");
        txtLogin.setText("");
    }
}
