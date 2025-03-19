package com.coffee.shop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        CoffeeWithMilk myCoffee = new CoffeeWithMilk();
        coffeeShop.printInvoice(myCoffee);
    }
}