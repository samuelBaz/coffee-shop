package com.coffee.shop;

public abstract class DrinkDecorator implements Drink {

    protected Drink drink;

    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public String description() {
        return drink.description();
    }

    @Override
    public Double price() {
        return drink.price();
    }
}
