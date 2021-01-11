package com.example.LaraRestAPI2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("t1/{id1}")
	public String test1(@PathVariable Integer id1) {
	return "Entered Id value is -"+id1;
	}
	
	@RequestMapping("t2/{firstName}")
	public String test2(@PathVariable String firstName) {
	return "Entered first Name value is -"+firstName;
    }
	
	@RequestMapping("t3/{firstName}/{age}")
	public String test3(@PathVariable String firstName,@PathVariable int age) {
	return "Entered first Name value is -"+firstName+"  age: "+age;
    }
	
	@RequestMapping("t4/firstName/{firstName}/age/{age}")
	public String test4(@PathVariable String firstName,@PathVariable int age) {
	return "Entered first Name value is -"+firstName+"  age: "+age;
    }
	@RequestMapping("t5/{num}")
	public String test5(@PathVariable  int num) {
	return "square value is- "+num*num;
    }
	@RequestMapping("t6/num1/{num1}")
	public String test6(@PathVariable  int num1) {
	return "square value is- "+num1*num1;
    }
	@RequestMapping("t7/{num1}/{num2}")
	public String test7(@PathVariable  int num1,@PathVariable  int num2) {
	return "sum value is- "+(num1+num2);
    }
	@RequestMapping("t8/num1/{num1}/num2/{num2}")
	public String test8(@PathVariable  int num1,@PathVariable  int num2) {
	return "sum value is- "+(num1+num2);
    }
	@RequestMapping("t9/{param}")
	public double test9(@PathVariable("param")  int num1) {
	double squareRoot=Math.sqrt(num1);
		return squareRoot;
    }
	@RequestMapping("t10/{helo}")
	public String test10(@PathVariable("helo") String firstname) {
		return "first name:-"+firstname;
	}

}
