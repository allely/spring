package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BoardData extends Base{
    @Id // 기본키
    @GeneratedValue     // 키 값 생성 전략 명시 ??
    private Long seq;

    @Column(length = 100, nullable = false)
    private String subject;

    @Lob    // 문자형 대용량 파일 -> 여러 줄 사용
    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userNo")
    private Member member;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<HashTag> tags = new ArrayList<>();

}
