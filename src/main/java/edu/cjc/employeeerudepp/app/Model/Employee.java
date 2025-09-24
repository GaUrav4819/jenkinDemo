package edu.cjc.employeeerudepp.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	             @Id
                 private int eid;
	             private String name;
	             private long salary;
	             private String dname;
	             private String designation;
	             private int yrOfExperience;
	             private String addressofEmployee;
                  private String password;
	             public String getPassword() {
					return password;
				}
				  public long getSalary() {
					return salary;
				}
				 public void setSalary(long salary) {
					 this.salary = salary;
				 }
				  public void setPassword(String password) {
					  this.password = password;
				  }
				 public int getEid() {
					return eid;
				}
				 public void setEid(int eid) {
					 this.eid = eid;
				 }
				 public String getName() {
					 return name;
				 }
				 public void setName(String name) {
					 this.name = name;
				 }
				 public String getDname() {
					 return dname;
				 }
				 public void setDname(String dname) {
					 this.dname = dname;
				 }
				 public String getDesignation() {
					 return designation;
				 }
				 public void setDesignation(String designation) {
					 this.designation = designation;
				 }
				 public int getYrOfExperience() {
					 return yrOfExperience;
				 }
				 public void setYrOfExperience(int yrOfExperience) {
					 this.yrOfExperience = yrOfExperience;
				 }
				 public String getAddressofEmployee() {
					 return addressofEmployee;
				 }
				 public void setAddressofEmployee(String addressofEmployee) {
					 this.addressofEmployee = addressofEmployee;
				 }
				 
}
