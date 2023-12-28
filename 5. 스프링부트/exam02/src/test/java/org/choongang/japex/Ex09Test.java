package org.choongang.japex;

import org.choongang.entities.BoardData;
import org.choongang.entities.Member;
import org.choongang.repositories.BoardDataRepository;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex09Test {
    @Autowired
    private BoardDataRepository repository;

    @Autowired
    private MemberRepository memberRepository;

    void init() {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");

        memberRepository.saveAndFlush(member);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            BoardData item = new BoardData();
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setMember(member);
            items.add(item);
        }

        repository.saveAllAndFlush(items);
    }

    @Test
    void test1() {
        // 회원 가져온 후 삭제해야 한다.
        Member member = memberRepository.findByEmail("user01@Test.org");
        memberRepository.delete(member);
        memberRepository.flush();
    }
}
