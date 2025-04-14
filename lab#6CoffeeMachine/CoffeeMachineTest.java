package org.example;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        Coffee[] coffeeList = new Coffee[2];
        coffeeList[0] = new Espresso();
        coffeeList[1] = new Latte();

        double total = 0.0;

        for (Coffee coffee : coffeeList) {
            System.out.println(coffee.toString());
            System.out.println("Price: $" + coffee.getPrice());
            System.out.println("Recipe: " + coffee.getRecipe());
            System.out.println();

            total += coffee.getPrice();
        }

        System.out.println("Total cost: $" + total);
    }
}
