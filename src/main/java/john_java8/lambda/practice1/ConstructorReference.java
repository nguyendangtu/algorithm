package john_java8.lambda.practice1;


import john_java8.lambda.myFunctionalInterface.TriFunction;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {

    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"),
                new Human("Jane", 45, "Female"),
                new Human("John", 30, "Male")};

        // Query 1  : Print only Female candidates names
        Arrays.stream(list)
                .filter(h -> "Female".equalsIgnoreCase(h.getGender()))
                .map(h -> h.getName())
                .forEach(System.out::println);

        // Query 2 : Create an object by choosing suitable Interface to the specified
        // constructors(Totally 3 constructors)using forth type of Method Reference ClassName::new.
        // Then print the object status
        Function<String, Human> h1 = Human::new;
        BiFunction<String, Integer, Human> h2 = Human::new;
        TriFunction<String, Integer, String, Human> h3 = Human::new;
        System.out.println(h1.apply("John"));
        System.out.println(h2.apply("John", 36));


        // Query 3 : Count the male candidates whose age is more than 30
        int count = Integer.parseInt(Arrays.stream(list)
                .filter(h -> h.getAge() > 30).count() + "");
        System.out.println("count = " + count);

    }


}
