package org.choongang.repositories;

import org.choongang.entities.BoardData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {
    @EntityGraph(attributePaths = {"member"})
    List<BoardData> findBySubjectContaining(String keyword);
                    // method 패턴만으로 쿼리가 자동 생성, 메서드 자동 정의
    // order by 조건추가
    List<BoardData> findBySubjectContainingOrderBySeqDesc(String keyword);

    // pageable 사용
    Page<BoardData> findBySubjectContaining(String keyword, Pageable pageable);

    // 위 두번째 메소드의 쿼리와 동일 => Ex05Test - test01
    @Query("SELECT b FROM BoardData b LEFT JOIN FETCH b.member WHERE b.subject LIKE %:key% ORDER BY b.seq DESC")
    List<BoardData> getSubjects(@Param("key")String keyword);

    @Query("SELECT b FROM BoardData b WHERE b.subject LIKE %:key%")
    Page<BoardData> getSubjects(@Param("key") String keyword, Pageable pageable);
}
