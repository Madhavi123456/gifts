package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Orders;

@Entity
@Table
@Component

public interface OrdersDao {

	public boolean saveorupdate(Orders orders );
	public boolean delete( Orders orders);
	public Orders  getOrders( String OrdersId);
	public List<Orders> orderslist();    
	
}
