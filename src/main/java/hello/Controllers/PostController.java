package hello.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PostController {
    
    @RequestMapping("/posts")
    public String index() {
        return "List of posts";
    }
    
}
