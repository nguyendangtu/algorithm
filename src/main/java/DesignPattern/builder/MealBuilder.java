package DesignPattern.builder;

public class MealBuilder {
    public Meal prepareVegBuger() {
        Meal meal = new Meal();
        meal.addItem(new VegBuger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegBuger() {
        Meal meal = new Meal();
        meal.addItem(new NonVegBuger());
        meal.addItem(new Coca());
        return meal;
    }
}
