package com.proyecto.crudecenvios.springbootecenvios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.crudecenvios.springbootecenvios.dto.CustomerRecordDTO;
import com.proyecto.crudecenvios.springbootecenvios.services.CustomerService;

@Controller
@RequestMapping("/record")
public class recordCustomerController {
	
	private CustomerService customerService;

	public recordCustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@ModelAttribute("customer")
	public CustomerRecordDTO returnNewCustomerRecordDTO() {
		return new CustomerRecordDTO();
	}
	
	@GetMapping
	public String displayRegistrationForm() {
		return "record";
	}
	@PostMapping
	public String RegisterUserAccount(@ModelAttribute("customer") CustomerRecordDTO recordDTO) {
		customerService.save(recordDTO);
		return "redirect:/record?exito";
	}
	
}
