package com.niit.GiftsBackend.Model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Users {
	@Id
   private String Id;
   private String Name;
   private	String EmailId;
   private	String Adddress;
   private String PhoneNo;
   private String Password;
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	
	
	@OneToOne
	@JoinColumn( name ="billId")
	private Billing billing;
	
	public String getId() {
		return Id;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roleId")
	Authentication authentication;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cartId")
	Cart cart;
	
	
	
	public Users() {
		this.Id = "USER"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAdddress() {
		return Adddress;
	}
	public void setAdddress(String adddress) {
		Adddress = adddress;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	public Authentication getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	


}
