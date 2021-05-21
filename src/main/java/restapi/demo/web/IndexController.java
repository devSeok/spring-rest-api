package restapi.demo.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import restapi.demo.config.auth.dto.SessionUser;
import restapi.demo.domain.posts.Posts;
import restapi.demo.sevice.posts.PostService;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostService postService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("posts", postService.findAllDesc());

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user != null) {
            model.addAttribute("userName", user.getName());
        }

        System.out.println(user);
        return "index";
    }

    // 저장 페이지
    @GetMapping("/posts/save")
    public String postsSave(Model model) {

        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {

        model.addAttribute("post", postService.findById(id));

        return "posts-update";
    }
}
