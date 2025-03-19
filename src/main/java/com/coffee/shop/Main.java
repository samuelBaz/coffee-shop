package com.coffee.shop;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee myCoffee = new Coffee();
        coffeeShop.printInvoice(myCoffee);
    }
}