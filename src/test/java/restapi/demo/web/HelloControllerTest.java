package restapi.demo.web;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)	// {2}
@WebMvcTest(controllers = HelloController.class)	// {3}
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test() throws Exception {
        String hello = "라이브테스트";

        System.out.println("test");
//
        mvc.perform(get("/test"))        // {6}
                .andExpect(status().isOk())        // {7}
                .andExpect(content().string(hello));    //{8}
    }
}