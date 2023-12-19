package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // 요청과 응답의 중재 역할   ?
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue = "기본값") String nm, Model model) {
                                    // 입력되지 않으면 400오류(디폴트설정( required:true )일 때)
        model.addAttribute("name", nm);
                                    // addAttribute 등록하지 않으면 쿼리스트링에 적어도 사용할 수 없다.?

        return "hello";
    }

    /*
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name,
                        @RequestParam("num") int num) { // 쿼리스트링으로 name과 num값을 입력.
        System.out.println(name);
        System.out.println(num);
        return "hello";     ///WEB-INF/templates/hello.jsp
    }
     */



    /*
    // 동일 동작
    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        // request.setAttribute("message", "안녕하세요");
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("hello");    ///WEB-INF/templates/hello.jsp

        return mv;
    }
     */

}
