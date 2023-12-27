package org.choongang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass   // 공통 속성화
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)  // 자동 감지
public abstract class Base { // 객체를 만들지 않고 공유용으로 사용하기 위해 추상클래스로
    @CreatedDate
    @Column(updatable = false)  // 추가 O, 수정 X
    private LocalDateTime createdAt;    // 생성날짜

    @LastModifiedDate
    @Column(insertable = false) // 추가 X, 수정 O
    private LocalDateTime modifiedAt;   // 수정날짜
}
