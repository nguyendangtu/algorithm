package circuitBreaker.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "circuitBreaker.server")
public class BookStoreApplication {

    @RequestMapping("/recommended")
    public String recommended() {
        return "Book Store online is available.";
    }

    public static void main(String args[]) {
        SpringApplication.run(BookStoreApplication.class, args);
    }
}
