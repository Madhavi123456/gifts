package com.niit.GiftsBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CartItems {
	@Id
	private String CartItemId;
	private float price;
	
	@ManyToOne
	@JoinColumn(name="CartId")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name="Id")
	private Product product;
   
	
	public CartItems() {
		
		CartItemId = "cartItem"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getCartItemId() {
		return CartItemId;
	}
	public void setCartItemId(String cartItemId) {
		CartItemId = cartItemId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
