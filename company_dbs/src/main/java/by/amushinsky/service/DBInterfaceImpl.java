package by.amushinsky.service;

import java.util.List;

import javax.jws.WebService;

import by.amushinsky.DaoImpl.*;
import by.amushinsky.model.Department;
import by.amushinsky.model.Employee;
import by.amushinsky.service.DBInterface;

@WebService(endpointInterface = "by.amushinsky.service.DBInterface")
public class DBInterfaceImpl implements DBInterface
{
	private DepartmentDAOImpl dep = new DepartmentDAOImpl();
	private EmployeeDAOImpl emp = new EmployeeDAOImpl();
	
	public void addDepartment(Department department)
	{
		dep.addDepartment(department);
	}

	public Department[] getDepartments()
	{
		List<Department> deps = dep.getDepartments();
		return deps.toArray(new Department[deps.size()]);
	}

	public Department getDepartment(int id)
	{
		return dep.getDepartment(id);
	}

	public void updateDepartment(Department department)
	{
		dep.updateDepartment(department);
	}

	public void deleteDepartment(int id)
	{
		dep.deleteDepartment(id);
	}
	
	public void addEmployee(Employee employee)
	{
		emp.addEmployee(employee);
	}
	
	public Employee[] getEmployees()
	{
		List<Employee> emps = emp.getEmployees();
		return emps.toArray(new Employee[emps.size()]);
	}
	
	public Employee getEmployee(int id)
	{
		return emp.getEmployee(id);
	}

	public void deleteEmployee(int id)
	{
		emp.deleteEmployee(id);
	}

	public void updateEmployee(Employee employee)
	{
		emp.updateEmployee(employee);
	}
	
}
