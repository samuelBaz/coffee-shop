package com.coffee.shop;

public class CoffeeWithMilk extends Coffee {
    @Override
    public String description() {
        return super.description() + ", with milk";
    }

    @Override
    public Double price() {
        return super.price() + 2.0;
    }
}