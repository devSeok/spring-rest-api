package restapi.demo.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    private PostsRepository postsRepository;

    @AfterEach
    void c(){
        postsRepository.deleteAll();
    }

    @Test
    void select() {

        String title  = "제목";
        String content = "내용";


        // given
        postsRepository.save(
                Posts.builder()
                .title(title)
                .content(content)
                .author("tsy0073@naver.com")
                .build());

        // when  언제
        List<Posts> postsList = postsRepository.findAll();

        // then 정의
        Posts post = postsList.get(0);
        assertThat(post.getTitle()).isEqualTo(title);
        assertThat(post.getContent()).isEqualTo(content);
    }
}