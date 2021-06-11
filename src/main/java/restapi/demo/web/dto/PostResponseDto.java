package restapi.demo.web.dto;


import lombok.Getter;
import restapi.demo.domain.posts.Posts;

@Getter
public class PostResponseDto {
    private Long id;
    private String author;
    private String content;
    private String title;


    public PostResponseDto(Posts posts) {
        this.id = posts.getId();
        this.author = posts.getAuthor();
        this.content = posts.getContent();
        this.title = posts.getTitle();
    }
}
