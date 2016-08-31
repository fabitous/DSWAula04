/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.model;

import java.sql.Date;
/**
 *
 * @author fsantos
 */
public class Trxn {
    private long cardNumber;
    private int value;
    private String date;

    public Trxn (long cardNumber, int value, String date) {
        this.cardNumber = cardNumber;
        this.value = value;
        this.date = date;
    }
    
    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
