package com.ll.sapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 어노테이션과 붙은 클래스 또는 메서드를 대상으로 삼는다.
@Controller //해당 클래스가 Spring MVC의 컨트롤러임을 나타낸다.
//@ResponseBody //이 어노테이션이 있어야 "index" 반환을 문자열 그대로 할 수 있다. 사용하지 않으면 index라는 이름의 템플릿 파일을 찾으러 가게된다.
public class MainController {

    @GetMapping("/sbb") // /sbb 경로로 들어오는 GET 요청을 index메서드가 수행하도록 한다.
    @ResponseBody
    public String index() {
//        System.out.println("index"); //그냥 문자열 출력인데 return이 아니라서 오류코드 500이 발생한다.
        return "화면 출력 테스트";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}