package edu.cjc.employeeerudepp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.employeeerudepp.app.Model.Employee;
import edu.cjc.employeeerudepp.app.servicei.EmployeeInter;


@Controller
public class EmployeeController {
	
	      @Autowired
	      EmployeeInter ei;
                @RequestMapping("/")
                public String  openLogin()
                {
                	return "login";
                }
                @RequestMapping("/openreg")
                public String openReg()
                {
                	return "Register";
                	
                }
                @RequestMapping("/save")
                public String saveEmployee(@ModelAttribute Employee s)
                {
                	ei.saveEmployee(s);
               	    return "login";
                } 	
                @RequestMapping("/login")    
                public String showEmployeeData(@RequestParam("eid") int eid, @RequestParam("password") String password ,Model m) {
                  if( eid==111 && password.equals("admin")) {  
                	  List<Employee> list=ei.getAllEmployee();
              		  System.out.println(eid+ "   "  +password);
              		   m.addAttribute("data", list);
                	  return "success";
                  }else
                	  return "login";
              }
                @RequestMapping("/edit")
                public String editEmployee(@RequestParam("eid") int eid,Model m)
                {
                Employee  ee=ei.editEmp(eid);
                	m.addAttribute("e", ee);
                	return "edit";
                }
                @RequestMapping("/update")
                public String updateEmployee(@ModelAttribute Employee e,Model m)
                {
                	ei.updateEmployee(e);
                	List<Employee> list=ei.getAllEmployee();
                	m.addAttribute("data", list);
                	return "success";
                }
                @RequestMapping("/delete")
                public String deleteRecord(@RequestParam("eid") int eid,Model m)
                {
                	ei.deleteRecord(eid);
                	List<Employee> list=ei.getAllEmployee();
                	m.addAttribute("data", list);
                	return "success";
                }
                @RequestMapping("/paging")
                public String openPage(@RequestParam("pageNo") int pageNo,Model m)
                {
                	List<Employee> list=ei.paging(pageNo,2);
                	m.addAttribute("data", list);
                	return "success";
                }
}
