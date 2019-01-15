package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    private final String TEST_CONSTANT = "TEST_PRIVATE_FIELD";
    private String name;
    private String value;

    public void doA() {
        System.out.println("doA");
    }

    public void doB() {
        System.out.println("doB");
    }

    public void showDeclareMethods() {
        Method[] methods = ReflectionExample.class.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));
    }

    public void showDeclareFields() {
        Field[] fields = ReflectionExample.class.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));
    }

    public void accessPrivateField() {
        try {
            Field field = ReflectionExample.class.getDeclaredField("TEST_CONSTANT");
            field.setAccessible(true);
            String fieldValue = (String) field.get(new ReflectionExample());
            System.out.println("private Field Value is " + fieldValue);
        } catch (Exception ex) {
            System.out.println("ERROR...");
        }

    }

    public static void main(String args[]) {
        ReflectionExample reflectionExample = new ReflectionExample();
        reflectionExample.showDeclareMethods();
        reflectionExample.showDeclareFields();
        reflectionExample.accessPrivateField();
    }
}
