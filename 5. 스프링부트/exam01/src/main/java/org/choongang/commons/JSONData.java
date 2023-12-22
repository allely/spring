package org.choongang.commons;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JSONData<T> {  // 데이터가 뭐가 올 지 몰라서 <T>

    private boolean success = true;
                // 성공하는 경우가 많기 때문에 true로 고정

    private HttpStatus status = HttpStatus.OK;
                // 응답 상태 코드 - 200(성공)으로 고정

    @NonNull    //static을 붙여도 된다.
    private T data; // 성공 시 Body 데이터

    private String message; //실패 시 메세지
}
