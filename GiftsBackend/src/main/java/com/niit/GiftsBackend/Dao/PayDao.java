package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.niit.GiftsBackend.Model.Pay;

@Entity
@Table
@Component
public interface PayDao {
	public boolean saveorupdate(Pay pay );
	public boolean delete( Pay pay);
	public Pay  getPay( String PayId);
	public List<Pay> paylist();  

}
