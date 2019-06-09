package com.niit.GiftsBackend.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import com.niit.GiftsBackend.Model.Users;

@Entity
@Table
@Component
public interface UsersDao {
	public boolean saveorupdate(Users users);
	public boolean delete( Users users);
	public Users getUsers( String Id);
	public Users getUsersbyemail( String Id);
	public List<Users> userslist();
	public Users isValid(String umail, String pwd);  
}
