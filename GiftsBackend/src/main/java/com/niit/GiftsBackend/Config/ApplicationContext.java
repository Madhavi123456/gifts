package com.niit.GiftsBackend.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.GiftsBackend.Dao.AuthenticationDao;
import com.niit.GiftsBackend.Dao.BillingDao;
import com.niit.GiftsBackend.Dao.CardDao;
import com.niit.GiftsBackend.Dao.CartDao;
import com.niit.GiftsBackend.Dao.CartItemsDao;
import com.niit.GiftsBackend.Dao.CategoryDao;
import com.niit.GiftsBackend.Dao.OrderItemsDao;
import com.niit.GiftsBackend.Dao.OrdersDao;
import com.niit.GiftsBackend.Dao.PayDao;
import com.niit.GiftsBackend.Dao.ProductDao;
import com.niit.GiftsBackend.Dao.ShippingDao;
import com.niit.GiftsBackend.Dao.SupplierDao;
import com.niit.GiftsBackend.Dao.UsersDao;
import com.niit.GiftsBackend.DaoImpl.AuthenticationDaoImpl;
import com.niit.GiftsBackend.DaoImpl.BillingDaoImpl;
import com.niit.GiftsBackend.DaoImpl.CardDaoImpl;
import com.niit.GiftsBackend.DaoImpl.CartDaoImpl;
import com.niit.GiftsBackend.DaoImpl.CartItemsDaoImpl;
import com.niit.GiftsBackend.DaoImpl.CategoryDaoImpl;
import com.niit.GiftsBackend.DaoImpl.OrderItemsDaoImpl;
import com.niit.GiftsBackend.DaoImpl.OrdersDaoImpl;
import com.niit.GiftsBackend.DaoImpl.PayDaoImpl;
import com.niit.GiftsBackend.DaoImpl.ProductDaoImpl;
import com.niit.GiftsBackend.DaoImpl.ShippingDaoImpl;
import com.niit.GiftsBackend.DaoImpl.SupplierDaoImpl;
import com.niit.GiftsBackend.DaoImpl.UsersDaoImpl;
import com.niit.GiftsBackend.Model.Authentication;
import com.niit.GiftsBackend.Model.Billing;
import com.niit.GiftsBackend.Model.Card;
import com.niit.GiftsBackend.Model.Cart;
import com.niit.GiftsBackend.Model.CartItems;
import com.niit.GiftsBackend.Model.Category;
import com.niit.GiftsBackend.Model.OrderItems;
import com.niit.GiftsBackend.Model.Orders;
import com.niit.GiftsBackend.Model.Pay;
import com.niit.GiftsBackend.Model.Product;
import com.niit.GiftsBackend.Model.Shipping;
import com.niit.GiftsBackend.Model.Supplier;
import com.niit.GiftsBackend.Model.Users;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContext 
{

	@Bean(name="dataSource")
	public DataSource getDataSource() 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/project1");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");

		
		return dataSource;
	}

	private Properties getHibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.connection.pool_size", "10");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		return properties;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) 
	{
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Authentication.class);
		sessionBuilder.addAnnotatedClass(Billing.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CartItems.class);
		sessionBuilder.addAnnotatedClass(OrderItems.class);
		sessionBuilder.addAnnotatedClass(Orders.class);
		sessionBuilder.addAnnotatedClass(Pay.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Shipping.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Users.class);
		sessionBuilder.addAnnotatedClass(Card.class);
	
		return sessionBuilder.buildSessionFactory();
	}

	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 
	{
		System.out.println("printing session factory here : "+sessionFactory);
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("printing transactionManager factory here : "+transactionManager);
		return transactionManager;
	}



   	@Autowired
   	@Bean(name="categoryDao")
   	public CategoryDao getCategoryDao(SessionFactory sessionFactory) 
   	{
   		return new CategoryDaoImpl(sessionFactory);
   	}
   	
	@Autowired
   	@Bean(name="authenticationDao")
   	public AuthenticationDao getAuthenticationDao(SessionFactory sessionFactory) 
   	{
   		return new AuthenticationDaoImpl(sessionFactory);
   	}
   	
	@Autowired
	@Bean(name="billingDao")
   	public BillingDao getBillingDao(SessionFactory sessionFactory) 
   	{
   		return new BillingDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="cartDao")
   	public CartDao getCartDao(SessionFactory sessionFactory) 
   	{
   		return new CartDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="cartItemsDao")
   	public CartItemsDao getCartItemsDao(SessionFactory sessionFactory) 
   	{
   		return new CartItemsDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="orderItemsDao")
   	public OrderItemsDao getOrderItemsDao(SessionFactory sessionFactory) 
   	{
   		return new OrderItemsDaoImpl(sessionFactory);
   		
   	}
	
	
	@Autowired
	@Bean(name="ordersDao")
   	public OrdersDao getOrdersDao(SessionFactory sessionFactory) 
   	{
   		return new OrdersDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="payDao")
   	public PayDao getPayDao(SessionFactory sessionFactory) 
   	{
   		return new PayDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="productDao")
   	public ProductDao getProductDao(SessionFactory sessionFactory) 
   	{
   		return new ProductDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="shippingDao")
   	public ShippingDao getShippingDao(SessionFactory sessionFactory) 
   	{
   		return new ShippingDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="supplierDao")
   	public SupplierDao getSupplierDao(SessionFactory sessionFactory) 
   	{
   		return new SupplierDaoImpl(sessionFactory);
   		
   	}
	
	@Autowired
	@Bean(name="usersDao")
   	public UsersDao getUsersrDao(SessionFactory sessionFactory) 
   	{
   		return new UsersDaoImpl(sessionFactory);
   		
   	}
	@Autowired
	@Bean(name="cardDao")
   	public CardDao getCardDao(SessionFactory sessionFactory) 
   	{
   		return new CardDaoImpl(sessionFactory);
   		
   	}
}
                                                                                                 