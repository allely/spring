package controllers.members;

import lombok.RequiredArgsConstructor;
import models.member.MemberDao;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) {   // 검증 커맨드 객체를 제한
                                                // 커맨드 객체가 아니라면 오류
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    /**
     *
     * @param target the object that is to be validated
     *               / 검증할 커맨드 객체
     * @param errors contextual state about the validation process
     *               / 검증 실패시 에러 정보를 처리
     */
    @Override
    public void validate(Object target, Errors errors) {
        /*
        1. 필수 항목 검증(userId, userPw, confirmPw, userNm, agree) : 입력 여부 - o
        2. 중복 아이디 여부 체크 -------------------------------> 작성해야함.
        3. 아이디 최소 자릿수(6자리 이상) 체크 - o
        4. 비밀번호 최소 자릿수(8자리 이상) 체크 - o
        5. 이메일 값은 필수는 아니지만 값이 있으면 형식 체크 @email - o
        6. 비밀번호, 비밀번호 확인 일치여부  --->작성
         */
        RequestJoin form = (RequestJoin)target;

        // 중복 아이디 여부 체크
        String userId = form.getUserId();
        if (StringUtils.hasText(userId) && memberDao.exist(userId)) { // 이미 가입된 아이디
            errors.rejectValue("userId", "Duplicated");
        }


        // userPw, confirmPw 일치 여부
        String userPw = form.getUserPw();
        String confirmPw = form.getConfirmPw();

        if (StringUtils.hasText(userPw)
                && StringUtils.hasText(confirmPw)
                && !userPw.equals(confirmPw)) {
            errors.rejectValue("confirmPw", "Mismatch");
        }
        /*
        RequestJoin form = (RequestJoin)target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPw", "required");
        */

        /*
        boolean result = false;
        if (!result) {
            errors.reject("ErrorTest", "공통 에러...");
        }
         */
    }
}