package uteis;
import Model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BdCliente {
    private Connection conexao;
    public BdCliente() throws SQLException{
        this.conexao = CriarConexao.getConexao();
    }
    //ADICIONAR UM REGISTRO
    public void adicionaCliente(Cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente(nome,data_nasc,sexo,endereco,fone)"+ "VALUES(?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,cliente.getNome());
        stmt.setString(2,cliente.getDataNasc());
        stmt.setString(3,cliente.getSexo());
        stmt.setString(4,cliente.getEndereco());
        stmt.setString(5, cliente.getFone());

        stmt.execute();
        stmt.close();
    }
}
