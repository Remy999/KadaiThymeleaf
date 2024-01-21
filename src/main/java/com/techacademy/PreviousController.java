package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PreviousController {

    @GetMapping("/previousInput")
    public String showInputPage(@RequestParam(name = "previous", required = false) String previous, Model model) {
        // previous パラメータをモデルに追加
        model.addAttribute("previous", previous);

        // InputController と同様の処理（入力画面の初期表示）を行う
        // ここで必要なデータを Model に追加してください

        return "input";
    }
}
