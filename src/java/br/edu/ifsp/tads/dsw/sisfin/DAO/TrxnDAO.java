/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Trxn;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddTrxn;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author fsantos
 */
public class TrxnDAO {
    private String insertScript;
    private Connection conn;
    
    public TrxnDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Trxn trxn) throws ParseException {
        this.insertScript = "insert into TRXN (cardNumber,value,date) values (?,?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(insertScript)) {
            stmt.setLong(1, trxn.getCardNumber()); 
            stmt.setInt(2, trxn.getValue());
            stmt.setString(3, trxn.getDate());
            stmt.execute();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AddTrxn.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
