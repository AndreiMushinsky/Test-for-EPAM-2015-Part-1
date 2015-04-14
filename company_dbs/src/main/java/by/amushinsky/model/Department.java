package by.amushinsky.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Department implements Serializable 
{
	private static final long serialVersionUID = 6546545665856871122L;
	
	private int id;
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Department(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
