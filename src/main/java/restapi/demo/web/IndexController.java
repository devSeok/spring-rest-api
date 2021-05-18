package restapi.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import restapi.demo.domain.posts.Posts;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(Model model) {

        return "posts-save";
    }
}
