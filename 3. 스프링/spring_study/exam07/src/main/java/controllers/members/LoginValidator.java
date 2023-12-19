package controllers.members;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /*
        1. 아이디로 회원이 조회되는지
        2. 입력한 회원의 비밀번호와 입력한 비밀번호의 일치 여부
         */

        RequestLogin form = (RequestLogin) target;

        String userId = form.userId();
        String userPw = form.userPw();
        System.out.println("조회 전");
        //아이디로 회원이 조회되는지
        Member member = memberDao.get(userId);
        if (member == null) {
//            errors.rejectValue("userId", "NotFount");
            // 비밀번호가 일치하지 않습니다 -> 아이디는 맞다!
            //특정 필드를 명시하지 않는 것이 좋다
            errors.reject("Login.auth.fail");   // 로그인 검증 실패
        }

        // 입력한 회원의 비밀번호와 입력한 비밀번호의 일치 여부
        if (member != null
                && StringUtils.hasText(userPw)
                && !BCrypt.checkpw(userPw, member.getUserPw())) {
            errors.reject("Login.auth.fail");
        }

    }
}