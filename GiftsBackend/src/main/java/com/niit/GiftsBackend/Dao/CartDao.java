package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Cart;

@Entity
@Table
@Component

public interface CartDao {
	public boolean saveorupdate(Cart cart );
	public boolean delete( Cart cart);
	public Cart getCart( String CartId);
	public List<Cart> cartlist();
	
}
