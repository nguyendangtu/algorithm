package john_java8.annotation;

import org.springframework.stereotype.Service;

@Service("myAnnotationTarget")
public class MyAnnotationTarget {

    @MyAnnotation("JOHN NGUYEN")
    private String name;

    public String getName() {
        return name;
    }

    public void run() {
        try {
            System.out.println("Class 1 initialized!");
            MyAnnotation myAnnotation = MyAnnotationTarget.class.getDeclaredField("name").getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.value());
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void main(String args[]) {
        MyAnnotationTarget target = new MyAnnotationTarget();
        target.run();
    }

}
