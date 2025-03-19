package com.coffee.shop;

public class CoffeeShop {

    public Coffee prepareOrder(Commands commands){
        Coffee coffee = new Coffee();
        if(commands.isWithMilk()){
            coffee = new CoffeeWithMilk();
        }
        if(commands.isWithSugar()){
            coffee = new CoffeeWithSugar();
        }
        if(commands.isWithSugar() && commands.isWithMilk()){
            // return instance of CoffeeWithSugarAndWithMilk
        }
        return coffee;
    }
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
