package restapi.demo.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostUpdateRequestDto {

    private String content;
    private String title;


    @Builder
    public PostUpdateRequestDto(String content, String title) {
        this.content = content;
        this.title = title;
    }
}
