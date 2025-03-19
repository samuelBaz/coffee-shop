package com.coffee.shop;

public class Commands {
    private boolean withMilk;
    private boolean withSugar;

    private boolean withCinnamon;

    public Commands(boolean withMilk, boolean withSugar, boolean withCinnamon){
        this.withMilk = withMilk;
        this.withSugar = withSugar;
        this.withCinnamon = withCinnamon;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public boolean isWithCinnamon() {
        return withCinnamon;
    }
}
