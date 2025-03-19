package com.coffee.shop;

public class CoffeeShop {
    public void printInvoice(Coffee coffee){
        System.out.println("===============================");
        System.out.println("        COFFEE SHOP");
        System.out.println("===============================");
        System.out.printf("Item: %-20s\n", coffee.description());
        System.out.printf("Price: $%.2f\n", coffee.price());
        System.out.println("===============================");
        System.out.println(" Thank you for your purchase!");
    }
}
