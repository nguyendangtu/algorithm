package DesignPattern.creational.builder;

/***
 * The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems
 * in object-oriented programming.
 * The intent of the Builder design pattern is to separate the construction of a complex object from its representation
 */
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
