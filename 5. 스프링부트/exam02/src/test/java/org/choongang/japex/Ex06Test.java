package org.choongang.japex;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.entities.BoardData;
import org.choongang.entities.Member;
import org.choongang.entities.QBoardData;
import org.choongang.repositories.BoardDataRepository;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.plaf.metal.MetalComboBoxEditor;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex06Test {

    @Autowired
    private BoardDataRepository boardDataRepository;
    @Autowired
    private MemberRepository memberRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");

        memberRepository.saveAndFlush(member);

        List<BoardData> items = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            BoardData item = new BoardData();
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setMember(member);
            items.add(item);
        }
        boardDataRepository.saveAllAndFlush(items);
        em.flush();     // 엔티티 비우기

        /*
        BoardData data = new BoardData();
        data.setSubject("제목1");
        data.setContent("내용1");
        data.setMember(member);

        boardDataRepository.saveAndFlush(data);
        */
    }

    @Test
    void test1() {
        BoardData data = boardDataRepository.findById(1L).orElse(null);
        Member member = data.getMember();
        String email = member.getEmail();   // 2차 쿼리 실행 ( LAZY )
        System.out.println(email);
//        System.out.println(member);
    }

    @Test
    void test2() {
        Member member = memberRepository.findByEmail("user01@test.org");
        List<BoardData> items = member.getItems();

        items.forEach(System.out::println); // BoardData -> toString()
    }

    @Test
    void test3() {  // 지연로딩 예외 상황
        List<BoardData> items = boardDataRepository.findAll();  // 1차 쿼리 실행
        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();   // 2차 쿼리 실행 10번 -> 성능 저하
            // N + 1 문제 : 목록 조회할 시 1차 쿼리 이후 2차 쿼리 실행횟수가 많아 생기는 문제. 성능 저하의 원인
        }
    }

    @Test
    void test4() {
//        List<BoardData> items = boardDataRepository.getSubjects("목");
        List<BoardData> itmes = boardDataRepository.findBySubjectContaining("목");
    }

    @Test
    void test5() {
        QBoardData boardData = QBoardData.boardData;
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(em);

        List<BoardData> items = jpaQueryFactory.selectFrom(boardData)
                .leftJoin(boardData.member)
                .fetchJoin()    // 처음부터 로딩
                .where(boardData.subject.contains("목"))
                .fetch();

        //items.forEach(System.out::println);
    }
}
