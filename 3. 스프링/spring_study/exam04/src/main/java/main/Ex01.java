package main;

import config.AppCtx;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);  // 스프링 컨테이너 생성

        JoinService joinService = ctx.getBean(JoinService.class);   // 회원 가입 기능
        ListService listService = ctx.getBean(ListService.class);   // 회원 목록 기능

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
