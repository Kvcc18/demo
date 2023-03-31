package com.demospring.demo.controllers;
import com.demospring.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        if(usuarioService.login(username, password)) {
            return "redirect:/";
        } else {
            return "redirect:/login?error";
        }
    }



}
