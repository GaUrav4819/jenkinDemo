package edu.cjc.employeeerudepp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.cjc.employeeerudepp.app.Model.Employee;
import jakarta.transaction.Transactional;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	@Transactional
    public void deleteByEid(int eid);
//	@Transactional
//	@Query(value = "delete from employee where eid=?1 ",nativeQuery=true)
//	public void deleteRecord(int eid);
}
