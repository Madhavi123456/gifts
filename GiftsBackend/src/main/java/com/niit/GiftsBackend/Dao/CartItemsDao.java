package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.CartItems;


@Entity
@Table
@Component


public interface CartItemsDao {
	public boolean saveorupdate(CartItems cartItems );
	public boolean delete( CartItems cartItems);
	public CartItems getCartItems( String CartItemsId);
	public List<CartItems> cartItemslist(String Id);
	public List<CartItems> getCartItemsByProductId(String productId);

}
