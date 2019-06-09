package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.OrderItems;

@Entity
@Table
@Component

public interface OrderItemsDao {
    
	
	public boolean saveorupdate(OrderItems orderItems );
	public boolean delete( OrderItems orderItems);
	public OrderItems  getOrderItems( String OrderItemsId);
	public List<OrderItems> orderItemslist();    
	
	
	
	
}
