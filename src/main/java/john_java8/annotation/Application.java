package john_java8.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "john_java8.annotation")
public class Application {

    @Autowired
    private MyAnnotationTarget myAnnotationTarget;

    @RequestMapping("/test")
    public String getString() {
        System.out.println(myAnnotationTarget.getName());
        return myAnnotationTarget.getName();
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
