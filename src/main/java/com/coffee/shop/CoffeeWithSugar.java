package com.coffee.shop;

public class CoffeeWithSugar extends Coffee {
    @Override
    public String description() {
        return super.description() +  ", with sugar";
    }

    @Override
    public Double price() {
        return super.price() + 1.0;
    }
}