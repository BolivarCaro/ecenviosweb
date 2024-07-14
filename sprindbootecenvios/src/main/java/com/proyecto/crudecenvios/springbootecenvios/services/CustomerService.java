package com.proyecto.crudecenvios.springbootecenvios.services;




import java.util.List;



import com.proyecto.crudecenvios.springbootecenvios.dto.CustomerRecordDTO;
import com.proyecto.crudecenvios.springbootecenvios.model.Person;

public interface CustomerService {
	public Person save(CustomerRecordDTO recordDTO);
	
	
	public List<Person> listarPerson();


	Person getPersonById(int id);
    void updatePerson(int id, Person person);
    void deletePersonById(int id);


    public Person findById(int id);


}
