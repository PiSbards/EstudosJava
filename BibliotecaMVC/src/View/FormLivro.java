package View;

import Model.Livro;
import javafx.scene.SnapshotParametersBuilder;
import uteis.BdLivro;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FormLivro{
    JButton btnExcluir,btnAlterar,btnNovo,btnCadastrar,btnSair;

    JLabel lblId, lblExemplar, lblAutor, lblEdicao, lblAno,lblDisponibilidade;

    JTextField txtExemplar,txtId,txtAutor,txtEdicao,txtAno,txtDisponibilidade;
    public FormLivro(){
        //FRAME
        JFrame frame = new JFrame("Formulário Livro");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //PANEL "PESQUISAR LIVRO"
        JPanel panelPesquisar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        TitledBorder tituloPesquisar = new TitledBorder("Pesquisar Livro");
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

            //GRID LIVROS
        String [] colunas = {"Id","Exemplar","Autor","Ano","Disponibilidade"};
        DefaultTableModel model = new DefaultTableModel(colunas,1);
        JTable tbLivros = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tbLivros);
        frame.add(scrollPane, BorderLayout.CENTER);

            //ADICIONANDO NO PANEL "PESQUISAR LIVROS"
        panelPesquisar.add(lblPesquisar);
        panelPesquisar.add(inputNome);
        panelPesquisar.add(btnPesquisar);


        //PANEL "DADOS DOS LIVROS"
        JPanel panelDados = new JPanel(new GridLayout(6,2));
        TitledBorder tituloDadosLivros = new TitledBorder("Dados Livros");
        panelDados.setBorder(tituloDadosLivros);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        lblAno = new JLabel("Ano:");
        lblId = new JLabel("Id:");
        lblAutor = new JLabel("Autor:");
        lblEdicao = new JLabel("Edição:");
        lblDisponibilidade = new JLabel("Disponibilidade:");
        lblExemplar = new JLabel("Exemplar:");

        txtId = new JTextField(200);
        txtAno = new JTextField(200);
        txtAutor = new JTextField(200);
        txtEdicao = new JTextField(200);
        txtExemplar = new JTextField(200);
        txtDisponibilidade = new JTextField(200);

        panelDados.add(lblId);
        panelDados.add(txtId);
        panelDados.add(lblExemplar);
        panelDados.add(txtExemplar);
        panelDados.add(lblAutor);
        panelDados.add(txtAutor);
        panelDados.add(lblEdicao);
        panelDados.add(txtEdicao);
        panelDados.add(lblAno);
        panelDados.add(txtAno);
        panelDados.add(lblDisponibilidade);
        panelDados.add(txtDisponibilidade);



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

        panelBotoes.add(btnNovo);
        panelBotoes.add(btnCadastrar);
        panelBotoes.add(btnAlterar);
        panelBotoes.add(btnExcluir);
        panelBotoes.add(btnSair);

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
                habilitaCampos();

            }
        });
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Livro livro = new Livro();
                    livro.setExemplar(txtExemplar.getText());
                    livro.setAutor(txtAutor.getText());
                    livro.setEdicao(Short.valueOf(txtEdicao.getText()));
                    livro.setAno(Short.valueOf(txtAno.getText()));
                    livro.setDisponibilidade(txtDisponibilidade.getText());

                    BdLivro l = new BdLivro();
                    l.adicionarLivro(livro);

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
        txtExemplar.setText("");
        txtAno.setText("");
        txtEdicao.setText("");
        txtDisponibilidade.setText("");
        txtAutor.setText("");
    }

    private void desabilitaCampos(){
        txtId.setEditable(false);
        txtExemplar.setEditable(false);
        txtAno.setEditable(false);
        txtEdicao.setEditable(false);
        txtDisponibilidade.setEditable(false);
        txtAutor.setEditable(false);
    }

    private void habilitaCampos(){
        txtId.setEditable(true);
        txtExemplar.setEditable(true);
        txtAno.setEditable(true);
        txtEdicao.setEditable(true);
        txtDisponibilidade.setEditable(true);
        txtAutor.setEditable(true);
    }
}
