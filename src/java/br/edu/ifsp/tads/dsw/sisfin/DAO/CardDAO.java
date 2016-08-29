/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Card;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddCard;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author fsantos
 */
public class CardDAO {
    private String insertScript;
    private Connection conn;
    
    public CardDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Card card) {
        this.insertScript = "insert into CARD (number,brand,valid) values (?,?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(insertScript)) {
            stmt.setLong(1, card.getNumber()); 
            stmt.setString(2, card.getBrand());
            stmt.setDate(3, (Date) card.getValid());
            stmt.execute();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AddCard.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
