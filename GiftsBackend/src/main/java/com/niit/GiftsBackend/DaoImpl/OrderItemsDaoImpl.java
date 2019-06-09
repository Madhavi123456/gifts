package com.niit.GiftsBackend.DaoImpl;
	
	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.GiftsBackend.Dao.OrderItemsDao;
import com.niit.GiftsBackend.Model.OrderItems;




       

	

	@Repository("orderItemsDao")
	@Transactional
	public class OrderItemsDaoImpl implements OrderItemsDao{
	     @Autowired
	     SessionFactory sessionFactory;
	     
	     public OrderItemsDaoImpl( SessionFactory sessionFactory)
	     {
	    	 this.sessionFactory = sessionFactory;
	     }
		@Override
		public boolean saveorupdate( OrderItems orderItems) {
			sessionFactory.getCurrentSession().saveOrUpdate(orderItems);
			return true;
		}

		@Override
		public boolean delete(OrderItems orderItems) {
			sessionFactory.getCurrentSession().delete(orderItems);
			return true;
		}

		@Override
		public OrderItems getOrderItems(String OrderItemId) {
			String q1 = " from OrderItems where OrderItemsId = '" + OrderItemId +"' ";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			List<OrderItems> list = (List<OrderItems>)w.list();
			if(list== null || list.isEmpty()) {
				return null;
			}

			return list.get(0);
		}

		@Override
		public List<OrderItems> orderItemslist() {
			List<OrderItems> orderItems =(List<OrderItems>) sessionFactory.getCurrentSession().createCriteria(OrderItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();		
			return  orderItems;
		}


	}



