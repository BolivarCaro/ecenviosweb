package com.proyecto.crudecenvios.springbootecenvios.model;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "user_orders")
public class OrdersUsers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderNumber;

	@Column(columnDefinition = "Text")
	private Date receiptDate;
	private Date deliveryDate;
	private String orderStatus;

	@ManyToOne
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;

	public OrdersUsers() {
		super();
	}

	public OrdersUsers(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrdersUsers(Long orderNumber, Date receiptDate, Date deliveryDate, String orderStatus, Person person) {
		this.orderNumber = orderNumber;
		this.receiptDate = receiptDate;
		this.deliveryDate = deliveryDate;
		this.orderStatus = orderStatus;
		this.person = person;
	}

	

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}

