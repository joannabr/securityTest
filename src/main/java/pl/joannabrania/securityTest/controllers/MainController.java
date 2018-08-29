package pl.joannabrania.securityTest.controllers;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index(){

        return "Witaj świecie !" +
                !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken);
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "Witaj adminie !";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "Witaj user !";
    }
}
