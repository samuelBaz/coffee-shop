package com.coffee.shop;

public class SugarDecorator extends  DrinkDecorator{

    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return drink.description() + ", with sugar";
    }

    @Override
    public Double price() {
        return drink.price() + 1.0;
    }
}
