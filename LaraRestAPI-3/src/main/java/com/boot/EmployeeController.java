package com.boot;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {

@RequestMapping(path="save",method=RequestMethod.POST)	
//@RequestBody is used for reading argument of the method
public Employee saveEmp(@RequestBody Employee employee) {
	System.out.println("save empId-"+employee.getId());
	System.out.println("save empFirstName-"+employee.getFirstName());
	System.out.println("save empLastName-"+employee.getLastName());
	System.out.println("save empId-"+Arrays.toString(employee.getMailAccounts()));
	
	return employee;
	
}
}
