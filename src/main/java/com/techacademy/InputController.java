package com.techacademy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(Model model) {
        // 入力画面の初期表示のための処理
        // ここで必要なデータをModelに追加してください
        return "input";
    }
}
