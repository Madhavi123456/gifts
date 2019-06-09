package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Shipping;

@Entity
@Table
@Component

public interface ShippingDao {
	public boolean saveorupdate(Shipping shipping);
	public boolean delete( Shipping shipping);
	public Shipping  getShipping( String Id);
	public List<Shipping> shippinglist();  

}
