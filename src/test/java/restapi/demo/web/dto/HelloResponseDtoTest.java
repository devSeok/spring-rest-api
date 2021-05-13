package restapi.demo.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class HelloResponseDtoTest {

    @Test
    @DisplayName("잘되는지 테스트")
    void test(){
        String name = "오진석";
        int age = 20;

        HelloResponseDto dto = new HelloResponseDto(name, age);

        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAge()).isEqualTo(age);

    }

}