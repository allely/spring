package controllers.members;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.LoginService;
import models.member.Member;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member")
// 가장 앞에 공통주소를 넣어 클래스 내의 코드를 간결하게 작성할 수 있다.
@RequiredArgsConstructor
// private final로 선언한 객체를 자동으로 매개변수에 넣어 의존성 주입(DI)
public class MemberController {
    private final JoinValidator joinValidator;      //
    private final JoinService joinService;          //
    private final LoginValidator loginValidator;    //
    private final LoginService loginService;        // 의존성 주입
    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return Arrays.asList("자바", "오라클", "JSP", "스프링");
    }

    @GetMapping("/join")    // /member/join
//    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, path="/member/join") // get, post 둘 다 사용
    public String join(@ModelAttribute RequestJoin form,  Model model) {
                // @ModelAttribute("rJoin") : 전달할 이름 변경
//        String[] addCss = {"member/style1.css", "member/style2.css"};
//        List<String> addScript = Arrays.asList("member/script1.js", "member/script2.js");

//        model.addAttribute("requestJoin", new RequestJoin());
        model.addAttribute("pageTitle", "회원가입");
        return "member/join";
        /*
        Member member = Member.builder()
                .userNo(1L)
                .userPw("1234")
                .userId("user01")
                .userNm("<h1>사용자01</h1>")
                .email("user01@test.org")
                .regDt(LocalDateTime.now())
                .build();

        // 다른 곳에서 저장한 member 사용할 수 있도록
        model.addAttribute("member", member);
        // "${pageTitle}" 사용하면 "회원가입"이 출력되도록
        model.addAttribute("pageTitle", "회원가입");
        return "member/join";
         */
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors, Model model) {
        joinValidator.validate(form, errors);   // form 입력 내용 검증
        if (errors.hasErrors()) {
            return "member/join";   // 오류가 있으면(입력값이 없으면) 다시 입력할 수 있도록 함.
        }
        //커맨드객체 RequestJoin -> requestJoin 이름으로 속성이 추가 -> 탬플릿 내에서 바로 접근 가능
        // Errors errors 는 커맨드객체 뒤에 두어야 커맨드객체의 유효성 검사 결과에 따라 내용이 정해진다.

        // 회원 가입 처리
        joinService.join(form);

//        model.addAttribute("requestJoin", form);

        // response.sendRedirect(request.getContextPath() f+ "/member/login") // 아래 return과 같음
        // Location:주소
//        return "redirect:/member/login";
        return "redirect:/member/login";     /*주소는 바뀌지 않고 출력버퍼만 바뀐다.
                                             forward로 마무리하면 데이터가 유지되기 때문에 문제가 생긴다.
                                             */
    }

    /* 지금은 적합하지 않기 때문에 주석처리
    @InitBinder     //
    protected void initBinder(WebDataBinder binder) {
        // controller에 해당하는 validator
        binder.setValidator(joinValidator);
    }
     */


    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form) {
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {

        loginValidator.validate(form, errors);
        if (errors.hasErrors()) {
            return "member/login";
        }

        // 로그인 처리
        loginService.login(form);

        return "redirect:/";    // 로그인 성공시 메인페이지 이동
    }

    @RequestMapping("/logout")  // 모든 매핑에서 접근 가능
    public String logout(HttpSession session) {
        session.invalidate();   // 세션 비우기
        return "redirect:/member/login";    // 로그인 페이지 이동
    }

    @GetMapping("/list")
    public String members(Model model) {
        List<Member> members = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Member member = Member.builder()
                    .userNo(Long.valueOf(i))
                    .userPw("1234")
                    .userId("user" + i)
                    .userNm("사용자" + i)
                    .email("user" + i + "@test.org")
                    .regDt(LocalDateTime.now())
                    .build();
            members.add(member);
        }
        model.addAttribute("members", members);
        return "member/list";
    }
}