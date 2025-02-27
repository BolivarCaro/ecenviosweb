package com.proyecto.crudecenvios.springbootecenvios.dto;



public class CustomerRecordDTO {

	
	private int id;
	private String firstName;
	private String lastName;
	private String documentType;
	private String document;
	private String age;
	private String mobilePhone;
	private String email;
	private String address;
	private String userName;
	private String passwordUser;
	private String confirmationPassword;
	
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String addressEmail) {
		this.email = addressEmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public CustomerRecordDTO(String firstName, String lastName, String documentType, String document, String age,
			String mobilePhone, String email, String address, String userName, String passwordUser,
			String confirmationPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.documentType = documentType;
		this.document = document;
		this.age = age;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.passwordUser = passwordUser;
		this.confirmationPassword = confirmationPassword;
	}
	public CustomerRecordDTO() {
		
	}
	
	
	
}
