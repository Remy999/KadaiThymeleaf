package com.techacademy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue, Model model) {
        // 入力値を受け取って出力画面を表示するための処理
        // ここで必要な処理やデータを行い、結果をModelに追加してください
        model.addAttribute("outputValue", "Processed value: " + inputValue);
        return "output";
    }
}
