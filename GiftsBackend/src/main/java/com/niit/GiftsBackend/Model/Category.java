package com.niit.GiftsBackend.Model;



import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {
	@Id
	private String CatId;
	private String CatName;
	
	public Category()
	{
		this.CatId="cat"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@OneToMany(mappedBy="category")
	private List<Product> product;
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public String getCatId() {
		return CatId;
	}
	public void setCatId(String catId) {
		CatId = catId;
	}
	public String getCatName() {
		return CatName;
	}
	public void setCatName(String catName) {
		CatName = catName;
	}
	

}
