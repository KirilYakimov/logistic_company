package nbu.project.logistic_company.controller;

import nbu.project.logistic_company.entities.EmployeeEntity;
import nbu.project.logistic_company.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String view(){
        return "login";
    }
}
