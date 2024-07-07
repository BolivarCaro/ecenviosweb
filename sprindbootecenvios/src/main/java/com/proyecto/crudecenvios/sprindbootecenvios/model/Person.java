package com.proyecto.crudecenvios.sprindbootecenvios.model;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_record")
public class Person  implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;


	@Column(columnDefinition = "Text")
	private String firstName;
	private String lastName;
	private String documentType;
	private String document;
	private String age;
	private String mobilePhone;
	private String addressEmail;
	private String address;
	private String userName;
	private String passwordUser;
	private String confirmationPassword;
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	//constructor
	
	
	
	
	
		// TODO Auto-generated constructor stub
	



	public List<Orders> getOrders() {
		return orders;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getAddressEmail() {
		return addressEmail;
	}
	public void setAddressEmail(String addressEmail) {
		this.addressEmail = addressEmail;
	}
	public String getAddresss() {
		return address;
	}
	public void setAddresss(String addresss) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String getConfirmationPassword() {
		return confirmationPassword;
	}
	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}
	
	
	
}
