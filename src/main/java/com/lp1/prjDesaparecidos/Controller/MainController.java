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

    @GetMapping("/js/index.js")
    public String getJs() {
        return "js/index.js";
    }
}