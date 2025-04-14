package org.example;

public class Espresso extends Coffee {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getRecipe() {
        return "Strong black coffee with no milk";
    }
}
