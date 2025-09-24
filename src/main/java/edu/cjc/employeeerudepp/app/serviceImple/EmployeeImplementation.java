package edu.cjc.employeeerudepp.app.serviceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import edu.cjc.employeeerudepp.app.Model.Employee;
import edu.cjc.employeeerudepp.app.repository.EmployeeRepository;
import edu.cjc.employeeerudepp.app.servicei.EmployeeInter;



@Service
public class EmployeeImplementation implements EmployeeInter{
	@Autowired
	EmployeeRepository er;
	@Override
	public void saveEmployee(Employee e) {
		er.save(e);
		
	}
	@Override
	public List<Employee> getAllEmployee() {
	List<Employee> list	=(List<Employee>) er.findAll();
		return list;
	}
	@Override
	public Employee editEmp(int eid) {
		//er.existsById(null);
		Optional<Employee> op= er.findById(eid);
	         if(op.isPresent())
	         {
	        	 Employee e=op.get();
	        	 return e;
	         }
	         else {
	        	 System.out.println("Employee object not found");
	        	 
	            }
	         return null;
	   }
	@Override
	public void updateEmployee(Employee e) {
		   er.save(e);
		
	}
	@Override
	public void deleteRecord(int eid) {
		er.deleteById(eid);
		//er.deleteRecord(eid);//custome method
	}
	@Override
	public List<Employee> paging(int pageNo, int size) {
		//Pageable pageable=PageRequest.of(pageNo, size, Sort.by("name"));
	List<Employee> list=er.findAll(PageRequest.of(pageNo, size,Sort.by("salary").descending())).getContent();
	         
	       return list;
	      
	}
	 
}
