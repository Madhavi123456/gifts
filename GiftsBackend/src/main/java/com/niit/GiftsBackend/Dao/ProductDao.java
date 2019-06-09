package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Product;


public interface ProductDao {
	public boolean saveorupdate(Product product);
	public boolean delete( Product product);
	public Product  getProduct( String Id);
	public List<Product> productlist();
	public List<Product>  getProduct1(String Id);
	public List<Product> getProductsById(String catId);
	public List<Product> getProductsBySupplierId(String supplierId);
}
