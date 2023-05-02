package io.playdata.springboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/name")
    public String name(Model model) {
        // Model 타입의 객체
        // -> 이걸 통해서 최종적으로 전달 받는 페이지에 데이터를 전달
        model.addAttribute("name", "John"); // K, V.
        // model 객체를 통해서 name이라는 이름의 John 값을 지닌 속성을 View(페이지)에 전달
        return "index";
    }
}
