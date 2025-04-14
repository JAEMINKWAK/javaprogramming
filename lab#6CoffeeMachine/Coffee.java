package org.example;

public abstract class Coffee {
    protected String name;

    public Coffee(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract String getRecipe();

    @Override
    public String toString() {
        return "Coffee: " + name;
    }
}
