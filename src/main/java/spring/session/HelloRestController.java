package spring.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloRestController {
    @GetMapping("/")
    String uid(HttpSession session) {
        return session.getId();
    }
}
