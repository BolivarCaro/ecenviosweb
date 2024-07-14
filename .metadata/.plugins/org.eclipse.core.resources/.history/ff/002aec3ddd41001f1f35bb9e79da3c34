package com.proyecto.crudecenvios.springbootecenvios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.crudecenvios.springbootecenvios.model.Person;

@Repository
public interface CustomerRepository extends JpaRepository<Person, Long>{
	public Person findByEmail(String email);
}
