package configs;

import controllers.HelloController;
import controllers.members.MemberController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("controllers")   //controllers 폴더 내부를 스캔한다.
                                // 매번 다른 컨트롤러를 아래처럼 등록하지 않아도 된다.
@ComponentScan({"controllers", "models"})
public class ControllerConfig { // web.xml에서 설정한 init-param의 value
    /*
    @Bean
    public HelloController helloController() {
        return new HelloController();
    }

    @Bean
    public MemberController memberController() {
        return new MemberController();
    }
     */
}