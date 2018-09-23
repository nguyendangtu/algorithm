package DesignPattern.creational.builder;

public class MainBuilder {
    public static void main(String args[]) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegBuger();
        meal.showPrices();
        System.out.println("Total Cost:" + meal.getCost());
        System.out.println("\n");

        Meal meal1 = mealBuilder.prepareVegBuger();
        meal1.showPrices();
        System.out.println("Total Cost:" + meal1.getCost());

    }

}
