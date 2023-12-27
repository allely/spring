package org.choongang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private Long seq;

    @Id
    @Column(name = "_uid")  //
        // uid는 오라클에서 사용하고 있으므로 오류 발생 가능성
    private int uid;

}
