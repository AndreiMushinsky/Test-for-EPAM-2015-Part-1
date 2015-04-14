package by.amushinsky.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import by.amushinsky.DAO.EmployeeDAO;
import by.amushinsky.model.Employee;
import by.amushinsky.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	@Override
	public void addEmployee(Employee employee) 
	{
		HibernateUtil.doSession(session -> session.save(employee));	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees() {
		Session session = null;
		List<Employee> emps = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			emps = (List<Employee>)session
							.createCriteria(Employee.class).list();
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
		return (emps == null)? new ArrayList<Employee>():
			   				   emps;
	}

	@Override
	public void deleteEmployee(int id) 
	{
		HibernateUtil.
		doSession(sess ->
						sess.delete
							((Employee)sess.get(Employee.class, id))
				 );
	}

	@Override
	public void updateEmployee(Employee employee) 
	{
		HibernateUtil.doSession(session -> session.update(employee));
	}

	@Override
	public Employee getEmployee(int id) 
	{
		Session session = null;
		Employee emp = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			emp = (Employee) session.get(Employee.class, id);
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
		return emp;
	}

}
