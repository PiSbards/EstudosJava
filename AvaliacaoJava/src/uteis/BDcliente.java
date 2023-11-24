package uteis;

import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BDcliente {
    private Connection conexao;

    public BDcliente() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionarRegistro(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO usuario(nome, login, senha, email) values (?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,cliente.getNome());
        stmt.setString(2,cliente.getLogin());
        stmt.setString(3,cliente.getSenha());
        stmt.setString(4,cliente.getEmail());


        stmt.execute();
        stmt.close();
    }

    public void loginEfetuado(Cliente cliente) throws SQLException{

        String sql = "SELECT id, nome, login, senha , email from usuario where login = ? and senha = ?";
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,cliente.getLogin());
        stmt.setString(2,cliente.getSenha());

        ResultSet rs = stmt.executeQuery();
        if(rs == null){
            return;
        }
        stmt.execute();
        stmt.close();

    }
}
