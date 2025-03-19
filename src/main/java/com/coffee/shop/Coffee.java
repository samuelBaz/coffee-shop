package com.coffee.shop;

public class Coffee implements Drink {

    private String description;
    private Double price;

    public Coffee(){
        this.description = "Coffee simple";
        this.price = 5.0;
    }
    @Override
    public String description() {
        return this.description;
    }

    @Override
    public Double price() {
        return this.price;
    }
}
