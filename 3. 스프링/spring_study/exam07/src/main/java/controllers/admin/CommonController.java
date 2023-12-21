package controllers.admin;

import commons.CommonException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers")    //controllers 를 포함한 하위패키지를 담당
public class CommonController {

    @ExceptionHandler(Exception.class)
    public String errorHandler(RuntimeException e, Model model, HttpServletResponse response) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;   // 500
        if (e instanceof CommonException) {
            CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }

        response.setStatus(status.value()); // 응답코드

        e.printStackTrace();    // 자세한 정보 -> 콘솔에 표시

        model.addAttribute("message", e.getMessage());  // 오류메세지

        return "error/common";
    }
}
