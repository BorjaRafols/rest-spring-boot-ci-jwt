package hello.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;;

@RestController
public class PostController {
    
    @RequestMapping("/posts")
    public String index() {
        return "List of posts";
    };
    
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int postId){
        return "get post";
    } 
    
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.POST)
    public String post(@PathVariable("id") int postId){
        return "post post";
    }
    
}
