package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Client;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddClient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

public class ClienteDAO {
    private String insertScript;
    private Connection conn;
    
    public ClienteDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Client cli) {
        this.insertScript = "insert into CLIENT (email,name) values (?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(insertScript)) {
            stmt.setString(1, cli.getName()); 
            stmt.setString(2, cli.getName());
            stmt.execute();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
