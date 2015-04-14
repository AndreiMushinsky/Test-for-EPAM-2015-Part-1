package by.amushinsky.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import by.amushinsky.DAO.DepartmentDAO;
import by.amushinsky.model.Department;
import by.amushinsky.util.HibernateUtil;

public class DepartmentDAOImpl implements DepartmentDAO 
{
	@Override
	public void addDepartment(Department department) 
	{
		HibernateUtil.doSession(session -> session.save(department));
	}
	@Override
	public void updateDepartment(Department department) 
	{
		HibernateUtil.doSession(session -> session.update(department));
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getDepartments()
	{
		Session session = null;
		List<Department> deps = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			deps = (List<Department>)session
							.createCriteria(Department.class).list();
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
		
		return (deps == null)? new ArrayList<Department>():
							   deps;
			
	}

	@Override
	public void deleteDepartment(int id) 
	{
		HibernateUtil.
			doSession(sess ->
							sess.delete
								((Department)sess.get(Department.class, id))
					 );
	}
	@Override
	public Department getDepartment(int id) 
	{
		Session session = null;
		Department dep = null;
		try
		{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			dep = (Department) session.get(Department.class, id);
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
		return dep;
	}
	
}
