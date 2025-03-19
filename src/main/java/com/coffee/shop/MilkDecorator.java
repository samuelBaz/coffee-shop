package com.coffee.shop;

public class MilkDecorator extends DrinkDecorator {
    public MilkDecorator(Drink drink){
        super(drink);
    }

    @Override
    public String description() {
        return drink.description() + ", with milk";
    }

    @Override
    public Double price() {
        return drink.price() + 2.0;
    }
}
