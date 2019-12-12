package p1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	Session session;
	public void connect()
	{
		Configuration configuration=new Configuration().configure();
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
	    SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		          		 
	    session =sessionFactory.openSession();
	}
	public void select(String sid)
	{
		session.beginTransaction();
		Query q=session.createQuery("from Student where sid=:sid");
		q.setString("sid",sid);
		List l=q.list();
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Student s=(Student)itr.next();
			System.out.println(s.getSid()+" "+s.getSname());	
		}	
	}
}
