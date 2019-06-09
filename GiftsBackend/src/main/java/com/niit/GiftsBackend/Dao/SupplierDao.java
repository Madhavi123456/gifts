package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Supplier;



@Entity
@Table
@Component



public interface SupplierDao {
	public boolean saveorupdate(Supplier supplier);
	public boolean delete( Supplier supplier);
	public Supplier getSupplier( String Id);
	public List<Supplier> supplierlist();  
}
