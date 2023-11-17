package uteis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Livro;
public class BdLivro {
    private Connection conexao;
    public BdLivro() throws SQLException {
        this.conexao = CriarConexao.getConexao();
    }
    public void adicionarLivro(Livro l) throws SQLException{
        String sql = "INSERT INTO livro(exemplar,autor,edicao,ano,disponibilidade)"+"VALUES (?,?,?,?,?)";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,l.getExemplar());
        stmt.setString(2,l.getAutor());
        stmt.setString(3,String.valueOf(l.getEdicao()));
        stmt.setString(4,String.valueOf(l.getAno()));
        stmt.setString(5,l.getDisponibilidade());
        stmt.execute();
        stmt.close();
    }
    public void excluirLivro(Livro l)throws SQLException{
        String sql = "DELETE FROM livro(exemplar,autor,edicao,ano,disponibilidade)"+"VALUES (?,?,?,?,?)";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,l.getExemplar());
        stmt.setString(2,l.getAutor());
        stmt.setString(3,String.valueOf(l.getEdicao()));
        stmt.setString(4,String.valueOf(l.getAno()));
        stmt.setString(5,l.getDisponibilidade());
        stmt.execute();
        stmt.close();
    }
    public void mostrarGrid(Livro l){

    }
}
