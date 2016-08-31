/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Card;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddCard;
import br.edu.ifsp.tads.dsw.sisfin.servlet.FindCard;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author fsantos
 */
public class CardDAO {
    private String sqlScript;
    private Connection conn;
    
    public CardDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Card card) {
        this.sqlScript = "insert into CARD (number,brand,valid) values (?,?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) {
            stmt.setString(1, card.getNumber()); 
            stmt.setString(2, card.getBrand());
            stmt.setString(3, card.getValid());
            stmt.execute();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AddCard.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Card find(Card card) {
        this.sqlScript = "select top 1 * from CARD where number like '?'";
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) {
            stmt.setString(1, card.getNumber()); 
            ResultSet res = stmt.executeQuery(sqlScript);
            while (res.next()) {
                card.setNumber(res.getString("number"));
                card.setBrand(res.getString("brand"));
                card.setValid(res.getString("valid"));
            }
            return card;
        } catch (SQLException ex) {
            Logger.getLogger(FindCard.class.getName()).log(Level.SEVERE, null, ex);
            card = null;
            return card;
        }
    }
    public List<Card> list() {
        this.sqlScript = "select * from CARD";
        
        Card card = new Card();
        List<Card> cardList;
        cardList = null;
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) { 
            ResultSet res = stmt.executeQuery(sqlScript);
            while (res.next()) {
                card.setNumber(res.getString("number"));
                card.setBrand(res.getString("brand"));
                card.setValid(res.getString("valid"));
                cardList.add(card);
            }
            return cardList;
        } catch (SQLException ex) {
            Logger.getLogger(FindCard.class.getName()).log(Level.SEVERE, null, ex);
            return cardList;
        }
    }
    
}
