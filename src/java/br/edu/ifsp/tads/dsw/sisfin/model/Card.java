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
    private String number;
    private String brand;
    private String valid;
    
    public Card (String number, String brand, String valid) {
        this.number = number;
        this.brand = brand;
        this.valid = valid; 
    }

    public Card() {
        
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
