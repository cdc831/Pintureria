package net.sytes.canterosoft.pintureria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexCrontoller {
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("titulo", "Login");
        return "login";
    }

    @GetMapping({"/index","/","/home"})
    public String index(){
        return "index";
    }

    @GetMapping("/gestionUsers")
    public String gestionUsers(){
        return "gestionUsers";
    }

    @GetMapping({"/gestionStock"})
    public String gestionStock(){
        return "gestionStock";
    }
}
