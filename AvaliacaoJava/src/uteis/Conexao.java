package uteis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conectado com banco de dados");
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prova","root","");
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
}
