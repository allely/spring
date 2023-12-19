package config;

import models.Message;
import models.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx2 {
    @Bean
    @Scope("prototype")     // 조회마다 다른 객체. 스프링 컨테이너 관리 기능에 일부 제한.
    public Message message() {
     return new Message();
    }

    /*  Bean 메서드 -> 커스텀 메서드
     * initMethod 에 message 안의 init 메서드를 (초기화 단계 호출 메서드)
     * DestroyMethod 에 ( // ) close 메서드를 설정 (소멸 단계 호출 메서드)
     * 하도록 커스텀 메서드를 설정할 수 있다.
     */
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }

}
