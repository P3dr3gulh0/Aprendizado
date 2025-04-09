//Criando conexão com um banco de dados

package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
        
public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
//            Esse codigo funciona para a conexão de qualquer banco de dados, basta mudar o a url
            return DriverManager.getConnection("jdbc:mysql://localhost/projetocrud","root","");
        }catch(SQLException excesao){
            throw new RuntimeException(excesao);
        }
    } 
}

