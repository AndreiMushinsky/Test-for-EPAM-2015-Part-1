package by.amushinsky.service;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import by.amushinsky.model.Department;
import by.amushinsky.model.Employee;


@WebService
@SOAPBinding(style = Style.RPC)
public interface DBInterface 
{
	@WebMethod
	public void addDepartment(Department department);
	@WebMethod
	public Department[] getDepartments();
	@WebMethod
	public void updateDepartment(Department department);
	@WebMethod
	public void deleteDepartment(int id);
	@WebMethod
	public void addEmployee(Employee employee);
	@WebMethod
	public Employee[] getEmployees();    
	@WebMethod
	public void deleteEmployee(int id);
	@WebMethod
	public void updateEmployee(Employee employee);
	@WebMethod
	public Department getDepartment(int id);
	@WebMethod
	public Employee getEmployee(int id);
}
