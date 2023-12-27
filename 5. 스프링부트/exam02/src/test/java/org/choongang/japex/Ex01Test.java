package org.choongang.japex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class Ex01Test {

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
        // 프로그램 실행 전 실행
    void init() {
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");

        member.setCreatedAt(LocalDateTime.now());
                //CreationTimestamp 사용 시 주석처리

        em.persist(member);
        em.flush();
        em.clear();     // 영속 상태 엔티티 모두 비우기

        member = em.find(Member.class, member.getSeq());
    }

    @Test
    void test1() {
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속성 컨텍스트에 영속상태 - 변화 감지 시작
        em.flush();         // db에 영구적으로 반영

        em.detach(member);      // 영속성 분리 - 변화 감지 X

        member.setName("(수정)사용자01");    // 제거 상태로 변경
        em.flush();

        em.merge(member);   // 분리된 영속 상태 엔티티 -> 영속 상태: 변화 감지 o
        em.flush();

        /*
        em.remove(member);  // 제거 상태로 변경
        em.flush();
        */

        // 쿼리가 자동으로 실행되고 있다.
    }

    @Test
    void test2() {
        Member member = em.find(Member.class, 1L);  // SQL 실행 -> 엔티티 -> 영속상태
        System.out.println(member);
        // 영속성이 없으면 쿼리 실행하고
        // 영속성이 있으면 쿼리가 실행되지 않는다,.
        // 캐시가 되어있으면 새로 생성되지 않는 것? 효율적인 관리가 가능
        Member member2 = em.find(Member.class, 1L); // 영속 상태 엔티티 -> 조회
        System.out.println();

        // find 는 기본키만 가지고 조회하기 때문에 한계가 있다.
    }

    @Test
    void test3() {
        List<Member> members = em.createQuery("SELECT m from member m", Member.class).getResultList();
        members.forEach(System.out::println);
    }
}
