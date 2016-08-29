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
public class Card {
    private long number;
    private String brand;
    private Date valid;
    
    public Card (long number, String brand, Date valid) {
        this.number = number;
        this.brand = brand;
        this.valid = valid; 
    }
    
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public Date getValid() {
        return valid;
    }

    public void setValid(Date valid) {
        this.valid = valid;
    }
}
