//  Processo de CRUD, Criar, Consultar, Atualizar, Deletar
package dao;

import factory.ConnectionFactory;
import model.UsuarioModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Importando a conexão criada em Factory
public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
//Criando Criador (Criate)
    public void adiciona(UsuarioModel usuario) {
        String sql = "INSERT INTO usuario (nome, cpf, email, telefone, idade)VALUES (?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setInt(5, usuario.getIdade());
            stmt.execute();
            stmt.close();
        } catch (SQLException excesao) {
            JOptionPane.showMessageDialog(null, "Falha ao adicionar!");
            throw new RuntimeException(excesao);
        }
    }
//Criando Consultor(Retrieve)
    public List<UsuarioModel> leitura() {
        connection = new ConnectionFactory().getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<UsuarioModel> usuarioArray = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                UsuarioModel usuario = new UsuarioModel();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setIdade(rs.getInt("idade"));

                usuarioArray.add(usuario);

            }
        } catch (SQLException excecao) {
            excecao.printStackTrace();
        }
        return usuarioArray;
    }
    
//    Criando Atualizar(Update) 
    public void atualizar(UsuarioModel usuario) {
        String sql = "UPDATE usuario SET nome = ?,cpf = ?,email = ?,telefone = ?,idade = ? WHERE idUsuario = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setInt(5, usuario.getIdade());
            stmt.setInt(6, usuario.getIdUsuario());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucessso!");
        } catch (SQLException excecao) {

            JOptionPane.showMessageDialog(null, "Falha ao Atualizar!");
            throw new RuntimeException(excecao);
        }
    }
    
//  Criando Deletar(Delete)
    public void delete(UsuarioModel usuario) {
        String sql = "DELETE FROM usuario WHERE idUsuario = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");

        } catch (SQLException excecao) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(excecao);
        }
    }
}
