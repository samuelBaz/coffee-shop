package com.coffee.shop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        //Order 1
        Commands commands = new Commands(true, false);
        Coffee myCoffee = coffeeShop.prepareOrder(commands);
        coffeeShop.printInvoice(myCoffee);

        //Order 2
        Commands commands2 = new Commands(false, true);
        Coffee myCoffee2 = coffeeShop.prepareOrder(commands2);
        coffeeShop.printInvoice(myCoffee2);

        //Order 3
        Commands commands3 = new Commands(true, true);
        Coffee myCoffee3 = coffeeShop.prepareOrder(commands3);
        coffeeShop.printInvoice(myCoffee3);
    }
}