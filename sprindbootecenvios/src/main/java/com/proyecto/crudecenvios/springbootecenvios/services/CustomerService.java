package com.proyecto.crudecenvios.springbootecenvios.services;




import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.proyecto.crudecenvios.springbootecenvios.dto.CustomerRecordDTO;
import com.proyecto.crudecenvios.springbootecenvios.model.Person;

public interface CustomerService{
	public Person save(CustomerRecordDTO recordDTO);
	
	
	public List<Person> listarPerson();
}
