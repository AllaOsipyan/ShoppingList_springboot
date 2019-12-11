package com.example.demoweb.model;

import java.security.PolicySpi;
import java.util.Date;

public class Product {
    private int id;
    private String text;
    private boolean isBought;
    private String status;

    public Product(int id, String text){
        this.id = id;
        this.text = text;
        this.isBought = false;
        this.status="☐";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getIsBought(){
        return isBought;
    }

    public void setIsBought(boolean isBought){
        this.isBought= isBought;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }
}
