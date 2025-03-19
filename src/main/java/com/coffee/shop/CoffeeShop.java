package com.coffee.shop;

import com.coffee.shop.decorators.MilkDecorator;
import com.coffee.shop.decorators.SugarDecorator;

public class CoffeeShop {

    public Drink prepareOrder(Commands commands){
        Drink coffee = new Coffee();
        if(commands.isWithMilk()){
            coffee = new MilkDecorator(coffee);
        }
        if(commands.isWithSugar()){
            coffee = new SugarDecorator(coffee);
        }
        return coffee;
    }
    public void printInvoice(Drink coffee){
        System.out.println("===============================");
        System.out.println("        COFFEE SHOP");
        System.out.println("===============================");
        System.out.printf("Item: %-20s\n", coffee.description());
        System.out.printf("Price: $%.2f\n", coffee.price());
        System.out.println("===============================");
        System.out.println(" Thank you for your purchase!");
    }
}
