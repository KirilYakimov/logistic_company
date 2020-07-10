package nbu.project.logistic_company.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/sign_up")
    public String view(){
        return "register";
    }
}
