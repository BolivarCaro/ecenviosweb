package com.proyecto.crudecenvios.springbootecenvios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.proyecto.crudecenvios.springbootecenvios.dto.CustomerRecordDTO;
import com.proyecto.crudecenvios.springbootecenvios.model.Person;
import com.proyecto.crudecenvios.springbootecenvios.services.CustomerService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/record")
public class recordCustomerController {

    private final CustomerService customerService;

    public recordCustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @ModelAttribute("customer")
    public CustomerRecordDTO returnNewCustomerRecordDTO() {
        return new CustomerRecordDTO();
    }

    @GetMapping
    public String displayRegistrationForm(Model model) {
        CustomerRecordDTO customer = new CustomerRecordDTO();
        model.addAttribute("customer", customer);
        return "record"; // Nombre de tu vista Thymeleaf (record.html)
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("customer") CustomerRecordDTO recordDTO) {
        if (recordDTO.getPasswordUser() == null || recordDTO.getPasswordUser().isEmpty()) {
            return "redirect:/record?error=passwordRequired";
        }
        customerService.save(recordDTO);
        return "redirect:/record?exito";
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(Model model, @PathVariable int id) {
        try {
            Person person = customerService.findById(id);
            

            CustomerRecordDTO customerRecordDTO = new CustomerRecordDTO();
            customerRecordDTO.setFirstName(person.getFirstName());
            customerRecordDTO.setLastName(person.getLastName());
            customerRecordDTO.setDocumentType(person.getDocumentType());
            customerRecordDTO.setDocument(person.getDocument());
            customerRecordDTO.setAge(person.getAge());
            customerRecordDTO.setMobilePhone(person.getMobilePhone());
            customerRecordDTO.setEmail(person.getEmail());
            customerRecordDTO.setAddress(person.getAddress());
            customerRecordDTO.setUserName(person.getUserName());
            customerRecordDTO.setPasswordUser(person.getPasswordUser());
            customerRecordDTO.setConfirmationPassword(person.getConfirmationPassword());

            model.addAttribute("customerRecordDTO", customerRecordDTO);
            model.addAttribute("id", person.getId());

        } catch (Exception ex) {
            System.out.println("Excepción al Editar: " + ex.getMessage());
            return "redirect:/index";
        }

        return "edit"; 
    }

    @PostMapping("/edit/{id}")
    public String updatePerson(Model model, @PathVariable int id,
                                     @Valid @ModelAttribute CustomerRecordDTO customerRecordDTO,
                                     BindingResult resultado) {
        try {
            Person person = customerService.findById(id);
            model.addAttribute("person", person);

            if (resultado.hasErrors()) {
                return "edit";
            }

            person.setFirstName(customerRecordDTO.getFirstName());
            person.setLastName(customerRecordDTO.getLastName());
            person.setDocumentType(customerRecordDTO.getDocumentType());
            person.setDocument(customerRecordDTO.getDocument());
            person.setAge(customerRecordDTO.getAge());
            person.setMobilePhone(customerRecordDTO.getMobilePhone());
            person.setEmail(customerRecordDTO.getEmail());
            person.setAddress(customerRecordDTO.getAddress());
            person.setUserName(customerRecordDTO.getUserName());
            person.setPasswordUser(customerRecordDTO.getPasswordUser());
            person.setConfirmationPassword(customerRecordDTO.getConfirmationPassword());

            customerService.updatePerson(id, person);

        } catch (Exception ex) {
            System.out.println("Excepción al grabar la edición: " + ex.getMessage());
        }

        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String confirmDelete(@PathVariable("id") int id, Model model) {
        Person person = customerService.findById(id);
        model.addAttribute("person", person);
        return "deleteConfirm";
    }

    @PostMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id) {
        customerService.deletePersonById(id);
        return "redirect:/index"; 
    }
}
