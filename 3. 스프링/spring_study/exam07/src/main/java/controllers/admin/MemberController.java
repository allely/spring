package controllers.admin;


import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
