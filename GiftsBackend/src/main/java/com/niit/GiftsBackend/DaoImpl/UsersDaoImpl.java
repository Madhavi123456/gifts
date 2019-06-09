package com.niit.GiftsBackend.DaoImpl;
	
	import java.util.List;


import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.GiftsBackend.Dao.UsersDao;
import com.niit.GiftsBackend.Model.Users;

       

	@Repository("usersDao")
	@Transactional
	public class  UsersDaoImpl implements UsersDao{
	     @Autowired
	     SessionFactory sessionFactory;
	     
	     public UsersDaoImpl( SessionFactory sessionFactory)
	     {
	    	 this.sessionFactory = sessionFactory;
	     }
		@Override
		public boolean saveorupdate(Users users) {
			sessionFactory.getCurrentSession().saveOrUpdate(users);
			return true;
		}

		@Override
		public boolean delete(Users users) {
			sessionFactory.getCurrentSession().delete(users);
			return true;
		}

		@Override
		public Users getUsers(String Id) {
			String q1 = " from Users where Id = '" + Id +"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<Users> list = (List<Users>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list.get(0);
		}

		@Override
		public List<Users> userslist() {
           List<Users> users =(List<Users>) sessionFactory.getCurrentSession().createCriteria(Users.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();		
			return  users;
		}
		@Override
		public Users isValid(String umail, String pwd) {
			String q1 = " from Users where EmailId = '" + umail +"' and Password=' "+pwd+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<Users> list = (List<Users>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list.get(0);
		}
		
		@Override
		public Users getUsersbyemail(String Id) {
			String q1 = " from Users where EmailId = '" + Id +"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<Users> list = (List<Users>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list.get(0);

	}
	}



