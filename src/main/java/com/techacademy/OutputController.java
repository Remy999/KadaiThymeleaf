package com.techacademy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue, Model model) {
        // 入力値をモデルに追加して出力画面を表示
        model.addAttribute("inputValue", inputValue);
        return "output";
    }

    @RequestMapping("/input")
    public String redirectToInput(@RequestParam("previous") String previous, Model model) {
        // 入力画面にリダイレクトする際に previous パラメータを渡す
        model.addAttribute("previous", previous);
        return "redirect:/input";
    }
}
