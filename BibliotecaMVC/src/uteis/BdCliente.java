package uteis;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BdCliente {
    private Connection conexao;
    public BdCliente() throws SQLException{
        this.conexao = CriarConexao.getConexao();
    }
    //ADICIONAR UM REGISTRO
    public void adicionaCliente() throws SQLException{
        String sql = "INSERT INTO cliente(nome,data_nasc,sexo,cpf,endereco,fone)"+ "VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,"Pong");
        stmt.setString(2,"1995/11/02");
        stmt.setString(3,"M");
        stmt.setString(4,"24423545660");
        stmt.setString(5,"Rua Pongolândia,69");
        stmt.setString(6,"123456");

        stmt.execute();
        stmt.close();
    }
}
