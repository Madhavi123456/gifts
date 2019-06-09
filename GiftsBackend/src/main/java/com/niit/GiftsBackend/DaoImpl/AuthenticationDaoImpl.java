package com.niit.GiftsBackend.DaoImpl;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.GiftsBackend.Dao.AuthenticationDao;
import com.niit.GiftsBackend.Dao.CategoryDao;
import com.niit.GiftsBackend.Model.Authentication;
import com.niit.GiftsBackend.Model.Category;

@Repository("authenticationDao")
@Transactional
public class AuthenticationDaoImpl implements AuthenticationDao{
     @Autowired
     SessionFactory sessionFactory;
     
     public AuthenticationDaoImpl( SessionFactory sessionFactory)
     {
    	 this.sessionFactory = sessionFactory;
     }
	@Override
	public boolean saveorupdate(Authentication authentication) {
		sessionFactory.getCurrentSession().saveOrUpdate(authentication);
		return true;
	}

	@Override
	public boolean delete(Authentication authentication) {
		sessionFactory.getCurrentSession().delete(authentication);
		return true;
	}

	@Override
	public Authentication getAuthentication(String roleId) {
		String q1 = " from Authentication where roleId = '" + roleId +"' ";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		List<Authentication> list = (List<Authentication>)w.list();
		if(list== null || list.isEmpty()) {
			return null;
		}

		return list.get(0);
	}

	@Override
	public List<Authentication> authenticationlist() {
		List<Authentication> Authentication =(List<Authentication>) sessionFactory.getCurrentSession().createCriteria(Authentication.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();		
		return Authentication;
	}


}
