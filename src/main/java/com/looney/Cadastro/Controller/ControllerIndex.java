package com.looney.Cadastro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerIndex {

    @GetMapping({"/", "/index"})
    public String boasVindas() {
        return "redirect:/Index.html";
    }
}
