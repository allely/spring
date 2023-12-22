package org.choongang.restcontrollers;

import org.choongang.commons.CommonException;
import org.choongang.commons.JSONData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("org.choongang.restcontrollers")
    // restcontrollers 내의 파일들을 다룬다. -> JSON
public class CommonRestController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData> errorHandler(Exception e) {
        // 통일성 있게 JSON형식으로 설정.


        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;   // 500

        if (e instanceof CommonException) {
            CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }

        e.printStackTrace();

        JSONData<Object> data = new JSONData<>();
        data.setStatus(status);
        data.setMessage(e.getMessage());
        data.setSuccess(false); // 실패 시 false

        return ResponseEntity.status(status).body(data);
    }
}
