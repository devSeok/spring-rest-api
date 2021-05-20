package restapi.demo.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import restapi.demo.domain.posts.Posts;
import restapi.demo.sevice.posts.PostService;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostService postService;

    @GetMapping("/")
    public String index(Model model){

//       System.out.println(postService.findAllDesc());

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(Model model) {

        return "posts-save";
    }
}
