package tests;

import configs.ControllerConfig;
import configs.DbConfig;
import configs.MvcConfig;
import controllers.members.RequestJoin;
import mapper.MemberMapper;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.awt.image.DataBufferFloat;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Transactional  // 테스트한 데이터 원상복구.(rollback)
//@SpringJUnitConfig
@SpringJUnitWebConfig
//@WebAppConfiguration    //web test 가능하도록.
@ContextConfiguration(classes = {MvcConfig.class, ControllerConfig.class})
public class JoinServiceTest {
    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockmvc;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private JoinService service;

    @BeforeEach
    void setup() {
        mockmvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    @DisplayName("데이터베이스 연결 테스트")
    void connectionText() {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("MemberDao - exist 메서드 테스트")
    void existTest() {
        String userId = "USER101";
        boolean result = memberDao.exist(userId);
        assertTrue(result);
    }

    @Test
    @DisplayName("JoinService - join메서드 테스트")
    void joinTest() {
        RequestJoin form = new RequestJoin();
        form.setUserId("user01");
        form.setUserPw("12345678");
        form.setUserNm("사용자01");
        form.setEmail("user01@test.org");

        service.join(form);

        Member member = memberDao.get(form.getUserId());

        System.out.println(member);
    }

    @Test
    @DisplayName("회원가입 통합 테스트")
    void joinTest2() throws Exception {
        mockmvc.perform(post("/member/join")
                .param("userId", "user01")
        ).andDo(print());
    }
}