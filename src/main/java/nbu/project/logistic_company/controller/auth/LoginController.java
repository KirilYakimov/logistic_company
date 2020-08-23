package nbu.project.logistic_company.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        // This just shows once you access login page the user will be created in the data base
        // Also it shows how to use repository to save user data
        //EmployeeEntity entity = new EmployeeEntity();
        //entity.setEmail("somemeail");
        //entity.setFirstName("somefirstname");
        //entity.setLastName("somelastname");
        //this.repository.save(entity);
        return "login";
    }
}
