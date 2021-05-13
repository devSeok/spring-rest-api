package restapi.demo.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest(HelloResponseDto.class)
@WebAppConfiguration
class HelloResponseDtoTest {


    @Autowired
    private MockMvc mvc;



    @Test
    @DisplayName("잘되는지 테스트")
    void test(){
        String name = "오진석";
        int age = 20;

        HelloResponseDto dto = new HelloResponseDto(name, age);

        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAge()).isEqualTo(age);

    }

    void pTest() throws Exception {
        String name = "오진석";
        int age = 20;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("age", String.valueOf(age))
        )
                .andExpect(status().is2xxSuccessful());


    }
}