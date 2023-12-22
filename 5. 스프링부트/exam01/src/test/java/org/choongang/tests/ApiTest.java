package org.choongang.tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.choongang.entities.Member;
import org.choongang.restcontrollers.RequestJoin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest     // 세팅 자동화
public class ApiTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("회원 가입 성공시 응답 코드 201")
    void JoinTest() throws Exception{

        RequestJoin form = new RequestJoin();
        form.setUserId("userId");
        form.setUserPw("12345678");
        form.setConfirmPw("12345678");
        form.setUserNm("사용자01");
        form.setEmail("user01@test.org");
        form.setRegDt(LocalDateTime.now()); // 자바 time패키지는 JSON에서 작동하지 않는다.

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());        // 모듈 추가하여 time패키지 사용 가능

        String body = om.writeValueAsString(form);  // 자바 객체 -> JSON 문자열 변환
        System.out.println(body);

        mockMvc.perform(
                    post("/api/member")
//                          .header("Content-Type", "application/json")
                            .header("Content-Type", MediaType.APPLICATION_JSON)
                                        // 이미 정의된 상수로 입력
                            .characterEncoding("UTF-8")
                            .content(body)  // body데이터
                )
                .andDo(print())
                .andExpect(status().isCreated());   // 201
    }

    @Test
    @DisplayName("JSON 문자열 -> Member 객체로 변환")
    void infoTest() throws Exception {
        String body = mockMvc.perform(get("/api/member"))
                .andDo(print())
                .andReturn()       // 응답데이터를 반환받아볼 때
                .getResponse()      // 응답객체를 반환
                .getContentAsString(Charset.forName("UTF-8"));
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        Member member = om.readValue(body, Member.class);
        System.out.println(member);
    }

    @Test
    void listTest() throws Exception {
        String body = mockMvc.perform(get("/api/member/list"))
                .andDo(print())
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        List<Member> members = om.readValue(body, new TypeReference</*List<Member>*/>() {});
                                            // 앞에서 List<Member>로 선언해서 적지 않아도 된다
        members.forEach(System.out::println);

    }
}
