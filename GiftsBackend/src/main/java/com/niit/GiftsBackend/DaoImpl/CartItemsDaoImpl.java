package com.niit.GiftsBackend.DaoImpl;
	
	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.GiftsBackend.Dao.CartItemsDao;
import com.niit.GiftsBackend.Model.CartItems;

       

	

	@Repository("cartItemsDao")
	@Transactional
	public class CartItemsDaoImpl implements CartItemsDao{
	     @Autowired
	     SessionFactory sessionFactory;
	     
	     public CartItemsDaoImpl( SessionFactory sessionFactory)
	     {
	    	 this.sessionFactory = sessionFactory;
	     }
		@Override
		public boolean saveorupdate( CartItems cartItems) {
			sessionFactory.getCurrentSession().saveOrUpdate(cartItems);
			return true;
		}

		@Override
		public boolean delete(CartItems cartItems) {
			sessionFactory.getCurrentSession().delete(cartItems);
			return true;
		}

		@Override
		public CartItems getCartItems(String CartItemId) {
			String q1 = " from CartItems where CartId ='" + CartItemId +"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<CartItems> list = (List<CartItems>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list.get(0);
		}

		
		@Override
		public List<CartItems> cartItemslist(String Id){
			
			String q1 = "from CartItems where CartId='"+Id+"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<CartItems> list = (List<CartItems>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list;
			
		}
		
		public List<CartItems> getCartItemsByProductId(String productId)
		{
			String q1 = "from CartItems where Id='"+productId+"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<CartItems> list = (List<CartItems>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list;
		}
		
		 
		
		


	}



