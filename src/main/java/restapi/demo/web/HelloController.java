package restapi.demo.web;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restapi.demo.web.dto.HelloResponseDto;

@RestController
public class HelloController {


    @GetMapping("/test")
    public String hello() {

        return "라이브테스트";
    }

    @GetMapping("/test/dto")
    public HelloResponseDto helloDto(@RequestParam String name, @RequestParam int age) {

        return new HelloResponseDto(name, age);
    }

}
