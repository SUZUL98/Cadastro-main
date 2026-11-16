package com.looney.Cadastro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping 

public class ControllerIndex {
    @GetMapping ("/index")
    public String boasVindas(){
        return "Teste de conecção do Spring";
    }
}
