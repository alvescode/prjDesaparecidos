package com.lp1.prjDesaparecidos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("")
    public String showHome() {
        return "index";
    }

    @GetMapping("login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("lista")
    public String showListaDesaparecidos() {
        return "lista";
    }
}
