
package dao;
    import factory.ConnectionFactory;
    import model.UsuarioModel;
    import java.sql.*;
    import java.sql.PreparedStatement;
    import java.util.ArrayList;
    import java.util.List;
public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(UsuarioModel usuario){
        String sql = "INSERT INTO usuario (nome, cpf, email, telefone, idade)VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setInt(5, usuario.getIdade());
            stmt.execute();
            stmt.close();
        }catch(SQLException excesao){
            throw new RuntimeException(excesao);
        }
       
    }
    
}
