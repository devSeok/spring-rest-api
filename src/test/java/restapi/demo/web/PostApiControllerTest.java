package restapi.demo.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import restapi.demo.domain.posts.Posts;
import restapi.demo.domain.posts.PostsRepository;
import restapi.demo.sevice.posts.PostService;
import restapi.demo.web.dto.PostsSaveRequestDto;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PostApiControllerTest {

    @Autowired
    private PostService postService;

    @Autowired
    private EntityManager manager;

    @Autowired
    private PostsRepository postsRepository;

    @Test
    void 저장() {
        String title = "제목1";
        String content = "내용2";
        
        
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .title(title)
                .content(content)
                .author("test")
                .build();

        Optional<Posts> postFind = postsRepository.findById(postService.save(dto));


        org.assertj.core.api.Assertions.assertThat(postFind.get().getContent()).isEqualTo(content);

        System.out.println(postFind);

    }

}