/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Trxn;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddTrxn;
import br.edu.ifsp.tads.dsw.sisfin.servlet.FindTrxn;
import br.edu.ifsp.tads.dsw.sisfin.servlet.ListTrxn;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author fsantos
 */
public class TrxnDAO {
    private String sqlScript;
    private Connection conn;
    
    public TrxnDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Trxn trxn) throws ParseException {
        this.sqlScript = "insert into TRXN (cardNumber,value,date) values (?,?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) {
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
    
    public Trxn find(Trxn trxn) {
        this.sqlScript = "select top 1 * from TRXN where cardNumber = ? and value = ? and date like ?";
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) {
            stmt.setLong(1, trxn.getCardNumber());
            stmt.setInt(2, trxn.getValue());
            stmt.setString(3, trxn.getDate());
            ResultSet res = stmt.executeQuery(sqlScript);
            while (res.next()) {
                trxn.setCardNumber(res.getLong("cardNumber"));
                trxn.setValue(res.getInt("value"));
                trxn.setDate(res.getString("date"));
            }
            return trxn;
        } catch (SQLException ex) {
            Logger.getLogger(FindTrxn.class.getName()).log(Level.SEVERE, null, ex);
            trxn = null;
            return trxn;
        }
    }
    
    public List<Trxn> list() {
        this.sqlScript = "select * from TRXN";
        
        Trxn trxn = new Trxn();
        List<Trxn> trxnList;
        trxnList = null;
        
        try(PreparedStatement stmt = conn.prepareStatement(sqlScript)) { 
            ResultSet res = stmt.executeQuery(sqlScript);
            while (res.next()) {
                trxn.setCardNumber(res.getLong("cardNumber"));
                trxn.setValue(res.getInt("value"));
                trxn.setDate(res.getString("date"));
                trxnList.add(trxn);
            }
            return trxnList;
        } catch (SQLException ex) {
            Logger.getLogger(ListTrxn.class.getName()).log(Level.SEVERE, null, ex);
            return trxnList;
        }
    }
}
