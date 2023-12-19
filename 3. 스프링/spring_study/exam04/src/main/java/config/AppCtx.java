package config;

import models.member.Member;
import models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
/* "models" 내를 스캔하여
@Component, @Service, @Repository  있는 객체를
자동으로 빈(객체)으로 선언
*/
/*
@ComponentScan(value="models"
            , excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION,
                                                        classes=ManualBean.class)
)       // 필터 설정 추가. ? : ManualBean 클래스의 설정에 따라 필터링 -> ?
 */
/* 연습?
@ComponentScan(value="models"
            , excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE
                                                    , classes = {MemberDao.class})
)                       // MemberDao.class를 사용하지 못하게 필터링 -> Dao 사용못해서 오류
*/
 @ComponentScan(value = "models"
                , excludeFilters = @ComponentScan.Filter(type=FilterType.ASPECTJ
                                                        , pattern="models..*Dao")
 )                         // models 폴더 안의 Dao로 끝나는 것 필터링 -> Dao 사용못해서 오류
public class AppCtx {
    /*
    @Bean
    public MemberDao memberDao() {
        // 이름이 동일한 경우 수동 등록 빈이 자동 등록 빈보다 우선 순위가 높다.
        // 자주 사용하지 않는다.
        System.out.println("수동 등록빈");
        return new MemberDao();
    }
     */
}
