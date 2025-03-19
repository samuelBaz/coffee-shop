package com.coffee.shop.decorators;

import com.coffee.shop.Drink;

public class CinnamonDecorator extends DrinkDecorator {

    public CinnamonDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return drink.description() + ", with cinnamon";
    }

    @Override
    public Double price() {
        return drink.price() + 0.5;
    }
}
