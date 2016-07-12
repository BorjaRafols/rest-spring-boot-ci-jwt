package hello.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!";
    }
    
    public String get(){
        String text = this.index();
        return "shit!" + text;
    }
    
}
