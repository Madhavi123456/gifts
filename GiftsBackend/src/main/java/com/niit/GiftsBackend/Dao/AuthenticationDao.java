package com.niit.GiftsBackend.Dao;

import java.util.List;

import com.niit.GiftsBackend.Model.Authentication;




public interface AuthenticationDao {
	public boolean saveorupdate(Authentication authentication );
	public boolean delete( Authentication authentication);
	public Authentication getAuthentication( String roleId);    
	public List<Authentication> authenticationlist();
	

}
