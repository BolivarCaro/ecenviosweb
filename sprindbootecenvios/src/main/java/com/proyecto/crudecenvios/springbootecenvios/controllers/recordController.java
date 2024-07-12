package com.proyecto.crudecenvios.springbootecenvios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.crudecenvios.springbootecenvios.services.CustomerService;


@Controller
public class recordController {
	
	private  CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo) {
        modelo.addAttribute("person", customerService.listarPerson());
        return "index";
    }
    
    
}
