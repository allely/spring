package commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException{
    private HttpStatus status;

    public CommonException(String message) {
        this(message, HttpStatus.INTERNAL_SERVER_ERROR);    // 500번 오류
    }

    public CommonException(String message, HttpStatus status) {
        super(message);         // 응답 코드를 설정할 수 있다?
        this.status = status;
    }

    public HttpStatus getStatus(){
        return status;
    }
}
