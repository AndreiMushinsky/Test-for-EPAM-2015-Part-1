package by.amushinsky.util;

import java.util.function.Consumer;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory = null;
	
	static 
	{
		try 
		{
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(builder.build());
        } 
		catch (Exception e) {e.printStackTrace();}
    }
	
	public static SessionFactory getSessionFactory() 
	{
        return sessionFactory;
    }
	
	public static void closeSessionFactory() 
	{
        sessionFactory.close();
    }
	
	// Method uses lambda-expression to get functionality
	// to a Session that doesn't return anything. 
	public static void doSession(Consumer<Session> cons)
	{
		Session session = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			cons.accept(session);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			if(session != null) session.getTransaction().rollback();
			e.printStackTrace();
		}
		finally
		{	
			if(session != null) session.close();
		}
	}
}
