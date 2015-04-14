package by.amushinsky.DAO;

import java.util.List;

import by.amushinsky.model.*;


public interface DepartmentDAO 
{
    public void addDepartment(Department department);
    public List<Department> getDepartments();
    public Department getDepartment(int id);
    public void updateDepartment(Department department);
    public void deleteDepartment(int id);
}
