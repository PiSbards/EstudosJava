package View;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormCliente{
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
        JPanel panelDados = new JPanel(new GridBagLayout());
        TitledBorder tituloDadosClientes = new TitledBorder("Dados Clientes");
        panelDados.setBorder(tituloDadosClientes);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        String [] labels = {"Id","Nome","Data de Nascimento", "Sexo","Endereço","Telefone"};
        int [] tamanhoCampo = {5,20,10,14,30,15};
        for (int i=0;i<tamanhoCampo.length;i++){
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.weightx = 1;
            panelDados.add(new JLabel(labels[i]),gbc);
            gbc.gridx = 1;
            gbc.weightx = 1;
            panelDados.add(new JTextField(tamanhoCampo[i]),gbc);
        }

        //PANEL SEPARAÇÃO DE FRAME
        JPanel panelFormulario = new JPanel(new BorderLayout());
        panelFormulario.add(panelDados, BorderLayout.CENTER);

        //Botões à direita do formulário
        JPanel panelBotoes = new JPanel(new GridLayout(5,1));
        TitledBorder botoes = new TitledBorder("");
        panelBotoes.setBorder(botoes);
        JButton btnExcluir = new JButton("Excluir");
        JButton btnAlterar = new JButton("Alterar");
        JButton btnNovo = new JButton("Novo");
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnSair = new JButton("Sair");

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList exclusao = ;

            }
        });
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList alterar = ;

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
                ArrayList cadastro = ;

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
}
