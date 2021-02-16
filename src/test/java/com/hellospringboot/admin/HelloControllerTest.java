package com.hellospringboot.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)    // 테스트 실행시에 JUnit에 내장된 실행자 외에 다른 실행자(SpringBoot)를 사용합니다
                                // 즉, 스프링 부트 테스트와 JUnit사이에 연결자 역할을 합니다.
@WebMvcTest(controllers = HelloController.class)    //

public class HelloControllerTest {

    @Autowired //
    private MockMvc mvc; //

    @Test
    public void say_hello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))  // MockMvc를 통해 /hello 주소로 HTTP GET을 요청
                                              // 체이닝이 지원되어 아래와 같이 여러 검증 기능을 이어서 선언할 수 있다.
            .andExpect(status().isOk()) // 강해져서 돌아오자 ㅅㅂ ㅋㅋㅋㅋ
            .andExpect(content().string(hello)); // 마음의 여유를 갖고 공부하자. 조급해할 필요는 없다.
    }
}
