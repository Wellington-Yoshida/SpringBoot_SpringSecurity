package br.com.sistemaAtividade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "/home";
    }

    @GetMapping("/")
    public String homeHome(){
        return "/home";
    }
}
