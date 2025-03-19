package com.coffee.shop;

public class Coffee {

    private String description;
    private Double price;

    public Coffee(){
        this.description = "Coffee simple";
        this.price = 5.0;
    }
    public String description() {
        return this.description;
    }

    public Double price() {
        return this.price;
    }
}
