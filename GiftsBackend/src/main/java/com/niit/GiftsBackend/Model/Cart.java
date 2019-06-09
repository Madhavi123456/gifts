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
public class Cart {
	@Id
	private String CartId;
	private double grandTotal =0.0;
	private int totalItems = 0;
	
	public Cart() {
		this.CartId = "CART"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	@OneToMany(mappedBy="cart")
	private List<CartItems> cartitems;

	public String getCartId() {
		return CartId;
	}
	public List<CartItems> getCartitems() {
		return cartitems;
	}
	public void setCartitems(List<CartItems> cartitems) {
		this.cartitems = cartitems;
	}
	public void setCartId(String cartId) {
		CartId = cartId;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
}
