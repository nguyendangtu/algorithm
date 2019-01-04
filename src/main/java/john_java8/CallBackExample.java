package john_java8;

import java.lang.reflect.Method;

public class CallBackExample {

    @FunctionalInterface
    public interface MethodCallback {
        void doWith(Method method) throws IllegalArgumentException, IllegalAccessException;
    }

    public static void main(String args[]) {
        CallBackExample.doCallBack(CallBackExample.class);
    }

    public static void doCallBack(final Class<?> clazz){
        Class<?> targetClass = clazz;
        doWithLocalMethods(targetClass,method -> {
            System.out.println("Found init method on class [" + clazz.getName() + "]: " + method.getName());
        });

    }
    public static void doWithLocalMethods(Class<?> clazz, MethodCallback mc) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            try {
                System.out.println("pre-execution ...");
                mc.doWith(method);
                System.out.println("...post-execution");
            } catch (IllegalAccessException ex) {
                throw new IllegalStateException("Not allowed to access method '" + method.getName() + "': " + ex);
            }
        }
    }
}
