package com.coffee.shop.decorators;

import com.coffee.shop.Drink;
import com.coffee.shop.decorators.DrinkDecorator;

public class SugarDecorator extends DrinkDecorator {

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
