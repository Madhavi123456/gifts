package com.niit.GiftsBackend.Model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Orders {
	@Id
	private String OrderId;
	double grandTotal =0.0;
	
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	@OneToOne
	@JoinColumn(name="billId")
	private Billing billing;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shipId")
	private Shipping shipping;
	
	@OneToOne
	@JoinColumn(name="Id")
	private Users users;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Pay_Id")
	private Pay pay;
	
	@OneToMany(mappedBy="orders")
	private List<OrderItems> orderItems;
	
	public Orders()
	{
		this.OrderId="ORDERS"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Users getUser() {
		return users;
	}
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public void setUser(Users user) {
		this.users = users;
	}
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	
	}


