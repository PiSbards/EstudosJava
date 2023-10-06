package View;
import javax.swing.*;
import java.awt.*;

public class FormCliente extends JFrame {
    JPanel pnlPrincipal, pnlPesquisar, pnlClientes, pnlDadosClientes,pnlBotoes;
    JLabel lblPesquisar;
    JTextField txtPesquisar;
    JButton btnPesquisar, btnExcluir;
    JTable tblPesquisar;
    public FormCliente(){
        //Comandos Gerais1
        setTitle("Clientes");
        setBounds(300,90,900,600);
        Object [][] dados = {
                {"Id","Nome","Data de Nascimento", "Sexo","Endereço","Telefone"},
                {1,"Pietro","09/03/1996","M","Rua das Oliveiras","5646456"},
                {2,"Pong","09/03/2005","M","Rua da pongolândia","159753456"},
                {3,"Jorge","07/07/2007","M","Rua dos Jorge","7777777"}
        };
        String [] colunas = {"Id","Nome","Data de Nascimento", "Sexo", "Endereço", "Telefone"};



        //Painel Principal
        pnlPrincipal = new JPanel(new GridLayout(2,1,5,5));
        pnlPrincipal.setBackground(Color.blue);

        //Painel Pesquisar
        pnlPesquisar = new JPanel();
        pnlPesquisar.setBounds(300,90,900,300);
        pnlPesquisar.setBackground(Color.YELLOW);
        lblPesquisar = new JLabel("Nome:");
        txtPesquisar = new JTextField();
        txtPesquisar.setColumns(60);
        btnPesquisar = new JButton("PESQUISAR");
        tblPesquisar = new JTable(dados,colunas);
        tblPesquisar.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblPesquisar.getColumnModel().getColumn(0).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblPesquisar.getColumnModel().getColumn(1).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblPesquisar.getColumnModel().getColumn(2).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblPesquisar.getColumnModel().getColumn(3).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(4).setPreferredWidth(200);
        tblPesquisar.getColumnModel().getColumn(4).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(5).setPreferredWidth(200);
        tblPesquisar.getColumnModel().getColumn(5).setResizable(false);



        //Painel Cliente
        pnlClientes = new JPanel(new BorderLayout());
        pnlClientes.setBackground(Color.pink);
        pnlDadosClientes = new JPanel();
        pnlDadosClientes.setBackground(Color.MAGENTA);

        pnlBotoes = new JPanel();
        pnlBotoes.setBackground(Color.CYAN);

        //ADD no Painel Principal
        pnlPrincipal.add(pnlPesquisar);
        pnlPrincipal.add(pnlClientes);

        //ADD no Painel Pesquisar
        pnlPesquisar.add(lblPesquisar);
        pnlPesquisar.add(txtPesquisar);
        pnlPesquisar.add(btnPesquisar);
        pnlPesquisar.add(tblPesquisar);


        //ADD no Painel Clientes
        pnlClientes.add(pnlDadosClientes,BorderLayout.CENTER);
        pnlClientes.add(pnlBotoes,BorderLayout.EAST);
        btnExcluir = new JButton("Excluir");
        pnlBotoes.add(btnExcluir);



        //Comandos Gerais2
        getContentPane().add(pnlPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
