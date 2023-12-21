package controllers.admin;


import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import models.member.MemberNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("adminMemberController")    // 스프링에서 동일한 클래스명으로 인식하기 때문에 이름 설정.
@RequestMapping("/admin/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberDao memberDao;
    @GetMapping // 상단에 입력된 /admin/member
    public String index(@ModelAttribute MemberSearch search, Errors errors, Model model) {

        List<Member> members = memberDao.getList(search);
        model.addAttribute("members", members);

        members.forEach(System.out::println);
        return "admin/member/list";
    }
    
    @GetMapping("/{id}")    /*  id부분 : 바뀔 수 있는 경로 부분
                                @PathVariable("id") 의 id에 입력
                                -> userId로 사용할 수 있다.
                             */
    public String info(@PathVariable("id") String userId) {
        System.out.println(userId);

        return "admin/member/info";
    }

    @GetMapping("test")
    public String errorTest() {
        boolean result = true;
        if (result) {
//            throw new RuntimeException("예외 발생!!");
            throw new MemberNotFoundException();
        }
        return "admin/member/test";
    }

    /*
    @ExceptionHandler(Exception.class)
    public String errorHandler(RuntimeException e, Model model) {
        e.printStackTrace();    // 자세한 정보 -> 콘솔에 표시

        model.addAttribute("message", e.getMessage());  // 오류메세지

        return "error/common";
    }
    */
}
