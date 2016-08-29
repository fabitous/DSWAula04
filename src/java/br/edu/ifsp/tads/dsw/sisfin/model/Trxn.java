/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.model;

import java.util.Date;
/**
 *
 * @author fsantos
 */
public class Trxn {
    private long cardNumber;
    private int value;
    private Date date;

    public Trxn (long cardNumber, int value, Date date) {
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
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
