package by.amushinsky.DAO;

import java.util.List;
import by.amushinsky.model.*;


public interface EmployeeDAO 
{
    public void addEmployee(Employee employee);
    public List<Employee> getEmployees();
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee employee);
}
