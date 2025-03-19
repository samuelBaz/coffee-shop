package com.coffee.shop;

public class Commands {
    private boolean withMilk;
    private boolean withSugar;

    public Commands(boolean withMilk, boolean withSugar){
        this.withMilk = withMilk;
        this.withSugar = withSugar;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public boolean isWithSugar() {
        return withSugar;
    }
}
