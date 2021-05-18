package restapi.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import restapi.demo.sevice.posts.PostService;
import restapi.demo.web.dto.PostResponseDto;
import restapi.demo.web.dto.PostUpdateRequestDto;
import restapi.demo.web.dto.PostsSaveRequestDto;

@RestController
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {

        return postService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostResponseDto findPost(@PathVariable Long id){

        return postService.findById(id);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto ) {

        return postService.update(id, requestDto);
    }



}
