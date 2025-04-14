package org.example;

public class Latte extends Coffee {
    public Latte() {
        super("Latte");
    }

    @Override
    public double getPrice() {
        return 3.5;
    }

    @Override
    public String getRecipe() {
        return "Espresso with steamed milk";
    }
}
