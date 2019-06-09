package com.niit.GiftsBackend.Model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	@Id
	private String supId;
	private String Name;
	private String EmailId;
	private String Adddress;
	public Supplier()
	{
		this.supId="sup"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	@OneToMany(mappedBy="supplier")
	private List<Product> product;
	
	
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
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
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
