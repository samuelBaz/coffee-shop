package com.coffee.shop;

public class Commands {
    private boolean withMilk;
    private boolean withSugar;

    public Commands(boolean withMilk, boolean withSugar){
        this.withSugar = withSugar;
        this.withMilk = withMilk;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public boolean isWithMilk() {
        return withMilk;
    }
}
