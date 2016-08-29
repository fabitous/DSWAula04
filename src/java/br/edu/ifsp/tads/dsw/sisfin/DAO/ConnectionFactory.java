/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:derby://localhost:1527/sisfin","adm","adm");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
