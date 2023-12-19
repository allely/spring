package main;

import config.AppCtx2;
import models.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args) {
        // 객체 생성, 의존 설정, 초기화(afterPropertiesSet)
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        Message m1 = ctx.getBean(Message.class);
        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2);   /* 위처럼 조회하면 동일한 객체를 가리킨다.(True)
                                           하지만 @Scope("prototype")를 사용하고 객체를 조회하면
                                           매번 새로운 객체 생성되므로 false 출력된다.
                                        */
        ctx.close();    //컴테이너 소멸 전 destroy() 호출.
    }
}
