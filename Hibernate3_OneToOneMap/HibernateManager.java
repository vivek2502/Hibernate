package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	Session session;
	public void connect()
	{
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
	    SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		          		 
	    session =sessionFactory.openSession();
	}
	public void insert(Employee e)
	{
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
	}
	

}
