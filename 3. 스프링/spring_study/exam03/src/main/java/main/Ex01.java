package main;

import commons.config.AppCtx2;
import commons.config.AppCtx4;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);
        // 헷갈리는 경우 이름을 명시하는 방법도 있으나 잘 사용하지는 않는다.
        JoinService joinService = ctx.getBean(/*"joinService",*/ JoinService.class);
        ListService listService = ctx.getBean(/*"listService",*/ ListService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setConfirmPw("123456");
        member.setUserNm("사용자01");
        member.setRegDt(LocalDateTime.now());

        joinService.join(member);

        listService.print();

        ctx.close();
    }
}