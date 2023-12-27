package org.choongang.japex;

import org.choongang.entities.Address;
import org.choongang.entities.Member;
import org.choongang.repositories.AddressRepository;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.profiles.active=test")
public class Ex07Test {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private AddressRepository addressRepository;

    @BeforeEach
    void init() {
        Address address = new Address();
        address.setZipcode("12345");
        address.setAddr1("주소1");
        address.setAddr2("주소2");

        addressRepository.saveAndFlush(address);

        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setAddress(address);

        memberRepository.saveAndFlush(member);
    }

    @Test
    void test1() {
        Member member = memberRepository.findByEmail("user01@test.org");
        Address address = member.getAddress();
        System.out.println(address);
    }

    @Test
    void test2() {
        Address address = addressRepository.findById(1L).orElse(null);
        Member member = address.getMember();
        System.out.println(member);
        // 순환참조 - 스택오버플로우
        // -> address에서 참조 배제하여 문제 해결(@ToString.Exclude)
    }
}
