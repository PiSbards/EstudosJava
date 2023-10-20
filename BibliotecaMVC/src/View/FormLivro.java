package View;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormLivro{
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
        JPanel panelDados = new JPanel(new GridBagLayout());
        TitledBorder tituloDadosLivros = new TitledBorder("Dados Livros");
        panelDados.setBorder(tituloDadosLivros);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        String [] labels = {"Id:","Exemplar:","Autor:","Edição:","Ano:","Disponibilidade:"};
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

        panelBotoes.add(new JButton("EXCLUIR"));
        panelBotoes.add(new JButton("ALTERAR"));
        panelBotoes.add(new JButton("NOVO"));
        panelBotoes.add(new JButton("CADASTRAR"));
        panelBotoes.add(new JButton("SAIR"));

        panelFormulario.add(panelDados,BorderLayout.CENTER);
        panelFormulario.add(panelBotoes,BorderLayout.EAST);

        //ADICIONANDO NO FRAME
        frame.add(panelPesquisar,BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelFormulario,BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
