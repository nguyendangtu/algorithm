package john_java8.lambda.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Type.MEAT),
                    new Dish("beef", false, 700, Type.MEAT),
                    new Dish("chicken", false, 400, Type.MEAT),
                    new Dish("french fries", true, 530, Type.OTHER),
                    new Dish("rice", true, 350, Type.OTHER),
                    new Dish("season fruit", true, 120, Type.OTHER),
                    new Dish("pizza", true, 550, Type.OTHER),
                    new Dish("prawns", false, 400, Type.FISH),
                    new Dish("salmon", false, 450, Type.FISH));

    /**
     * a. Is there any Vegetarian meal available ( return type boolean)
     *
     * @return
     */
    public static final boolean anyVegetarian() {
        return menu.stream().anyMatch(d -> d.isVegetarian());
    }

    /**
     * b. Is there any healthy menu have calories less than 1000 ( return type boolean)
     *
     * @return
     */
    public static final boolean anyHealthyMenu() {
        return menu.stream().anyMatch(d -> d.getCalories() < 1000);
    }

    /**
     * c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
     */
    public static final boolean anyUnHealthMenu() {
        return menu.stream().anyMatch(d -> d.getCalories() > 1000);
    }

    /**
     * d.find and return the first item for the type of MEAT( return type Optional<Dish>)
     */
    public static final Optional<Dish> getFirstMeat() {
        return menu.stream().filter(d -> Type.MEAT.name().equals(d.getType().name())).findFirst();
    }

    /**
     * e. calculateTotalCalories() in the menu using reduce. (return int)
     */
    public static final int calculateTotalCalories() {
        return menu
                .stream()
                .mapToInt(d -> d.getCalories())
                .reduce((x, y) -> x + y).getAsInt();
    }

    /***
     * f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
     */
    public static final int calculateTotalCaloriesMethodReference() {
        return menu
                .stream()
                .mapToInt(Dish::getCalories)
                .reduce(Integer::sum).getAsInt();
    }

    /***
     *e. Implement a main method to test.
     */
    public static void main(String[] args) {
        System.out.println("anyVegetarian = " + anyVegetarian());
        System.out.println("anyHealthyMenu = " + anyHealthyMenu());
        System.out.println("anyUnHealthMenu = " + anyUnHealthMenu());
        System.out.println("getFirstMeat = " + getFirstMeat());
        System.out.println("calculateTotalCalories = " + calculateTotalCalories());
        System.out.println("calculateTotalCaloriesMethodReference = " + calculateTotalCaloriesMethodReference());

        BiFunction<List<Dish>, Integer, Boolean> f = (list,c)->list
                .stream()
                .anyMatch(d->d.getCalories() > c);
        System.out.println(f.apply(menu,400));

    }

}