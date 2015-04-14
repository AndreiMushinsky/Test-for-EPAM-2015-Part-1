package by.amushinsky.model;

import java.io.Serializable;


public class Employee implements Serializable 
{
	private static final long serialVersionUID = 987987477112335L;
	
	private int id;
	private String lname;
	private String fname;
	private String pname;
	private int salary;
	
	public Employee(){}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
