package View;

import Model.Cliente;
import uteis.BdCliente;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class FormCliente{
    JButton btnExcluir,btnAlterar,btnNovo,btnCadastrar,btnSair;

    JLabel lblId,lblNome,lblData_de_Nascimento, lblSexo, lblEndereco, lblTelefone;

    JTextField txtId,txtNome,txtData_de_Nascimento, txtSexo, txtEndereco, txtTelefone;
    public FormCliente() {
        //FRAME
        JFrame frame = new JFrame("Formulário Cliente");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //PANEL "PESQUISAR CLIENTE"
        JPanel panelPesquisar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        TitledBorder tituloPesquisar = new TitledBorder("Pesquisar Cliente");
        panelPesquisar.setBorder(tituloPesquisar);
        JLabel lblPesquisar = new JLabel("Nome:");
        JTextField inputNome = new JTextField(50);
        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = inputNome.getText();

            }
        });


        //GRID CLIENTES
        String [] colunas = {"Id","Nome","Data de Nascimento", "Sexo","Endereço","Telefone"};
        DefaultTableModel model = new DefaultTableModel(colunas,1);
        JTable tbLivros = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tbLivros);
        frame.add(scrollPane, BorderLayout.CENTER);

        //ADICIONANDO NO PANEL "PESQUISAR CLIENTES"
        panelPesquisar.add(lblPesquisar);
        panelPesquisar.add(inputNome);
        panelPesquisar.add(btnPesquisar);


        //PANEL "DADOS DOS CLIENTES"
        JPanel panelDados = new JPanel(new GridLayout(6,2));
        TitledBorder tituloDadosClientes = new TitledBorder("Dados Clientes");
        panelDados.setBorder(tituloDadosClientes);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        lblData_de_Nascimento = new JLabel("Data de Nascimento:");
        lblId = new JLabel("Id:");
        lblNome = new JLabel("Nome:");
        lblSexo = new JLabel("Sexo:");
        lblEndereco = new JLabel("Endereço:");
        lblTelefone = new JLabel("Telefone:");

        txtId = new JTextField(200);
        txtNome = new JTextField(200);
        txtSexo = new JTextField(200);
        txtEndereco = new JTextField(200);
        txtData_de_Nascimento = new JTextField(200);
        txtTelefone = new JTextField(200);

        panelDados.add(lblId);
        panelDados.add(txtId);
        panelDados.add(lblNome);
        panelDados.add(txtNome);
        panelDados.add(lblData_de_Nascimento);
        panelDados.add(txtData_de_Nascimento);
        panelDados.add(lblSexo);
        panelDados.add(txtSexo);
        panelDados.add(lblEndereco);
        panelDados.add(txtEndereco);
        panelDados.add(lblTelefone);
        panelDados.add(txtTelefone);

        //PANEL SEPARAÇÃO DE FRAME
        JPanel panelFormulario = new JPanel(new BorderLayout());
        panelFormulario.add(panelDados, BorderLayout.CENTER);

        //Botões à direita do formulário
        JPanel panelBotoes = new JPanel(new GridLayout(5,1));
        TitledBorder botoes = new TitledBorder("");
        panelBotoes.setBorder(botoes);
        btnExcluir = new JButton("Excluir");
        btnAlterar = new JButton("Alterar");
        btnNovo = new JButton("Novo");
        btnCadastrar = new JButton("Cadastrar");
        btnSair = new JButton("Sair");

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //"Nome","Data de Nascimento", "Sexo","Endereço","Telefone";
                    Cliente cliente = new Cliente();
                    cliente.setDataNasc(Date.valueOf(txtData_de_Nascimento.getText()));
                    cliente.setNome(txtNome.getText());
                    cliente.setSexo(txtSexo.getText());
                    cliente.setEndereco(txtEndereco.getText());
                    cliente.setFone(txtTelefone.getText());

                    BdCliente c = new BdCliente();
                    c.adicionaCliente(cliente);

                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
                    limpaCampos();
                    desabilitaCampos();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar dados!");
                }

            }
        });
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });

        panelBotoes.add(btnExcluir);
        panelBotoes.add(btnAlterar);
        panelBotoes.add(btnNovo);
        panelBotoes.add(btnCadastrar);
        panelBotoes.add(btnSair);


        panelFormulario.add(panelDados,BorderLayout.CENTER);
        panelFormulario.add(panelBotoes,BorderLayout.EAST);

        //ADICIONANDO NO FRAME
        frame.add(panelPesquisar,BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelFormulario,BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    private void limpaCampos(){
        txtId.setText("");
        txtNome.setText("");
        txtData_de_Nascimento.setText("");
        txtEndereco.setText("");
        txtSexo.setText("");
        txtTelefone.setText("");
    }

    private void desabilitaCampos(){
        txtId.setEditable(false);
        txtNome.setEditable(false);
        txtData_de_Nascimento.setEditable(false);
        txtEndereco.setEditable(false);
        txtSexo.setEditable(false);
        txtTelefone.setEditable(false);
    }

    private void habilitaCampos(){
        txtId.setEditable(true);
        txtNome.setEditable(true);
        txtData_de_Nascimento.setEditable(true);
        txtEndereco.setEditable(true);
        txtSexo.setEditable(true);
        txtTelefone.setEditable(true);
    }
}
