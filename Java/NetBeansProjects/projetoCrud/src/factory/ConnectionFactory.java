package factory;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
        
public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projetocrud","root","");
        }catch(SQLException excesao){
            throw new RuntimeException(excesao);
        }
    } 
}

