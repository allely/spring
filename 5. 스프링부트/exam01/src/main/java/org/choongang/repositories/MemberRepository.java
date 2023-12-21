package org.choongang.repositories;

import org.choongang.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    // 엔티티 이름.. ??
    // 추상메서드를 선언해도
    Member findByUserId(String userId); // 쿼리 자동 생성

    List<Member> findByUserNmContainingOrUserIdContainingOrderByRegDtDesc(String keyword1, String keyword2);

    @Query("SELECT * FROM MEMBER WHERE USER_NM LIKE '%:key1%' OR USER_ID LIKE '%:key2%' ORDER BY REG_DT DESC")
    List<Member> getMembers(@Param("key1") String keyword1 ,@Param("key2") String keyword2);

    Page<Member> findByUserNmContaining(String key, Pageable pageable);
}
