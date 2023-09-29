package View;

import Model.Cliente;
import Model.Livro;
import uteis.BdCliente;
import uteis.BdLivro;
import uteis.CriarConexao;

import java.sql.SQLException;

public class Biblioteca {
    public static void main(String[] args) throws SQLException {
        BdLivro conexao = new BdLivro();
        Livro livro1 = new Livro("Senhor dos Anéis","Tolkien",13,1999,"S");
        conexao.adicionarLivro(livro1);


    }

}
