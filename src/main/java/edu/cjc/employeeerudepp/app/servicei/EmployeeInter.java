package edu.cjc.employeeerudepp.app.servicei;

import java.util.List;

import edu.cjc.employeeerudepp.app.Model.Employee;

public interface EmployeeInter  {
public void saveEmployee(Employee e);
public List<Employee> getAllEmployee();
public Employee editEmp(int eid);
public void updateEmployee(Employee e);
public void deleteRecord(int eid);
public List<Employee> paging(int pageNo,int size);
}
