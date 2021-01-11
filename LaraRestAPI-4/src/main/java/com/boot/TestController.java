package com.boot;

import org.springframework.web.bind.annotation.*;

@RestController 
public class TestController {
	// @RequestParam is used for reading argument of the method or form data
	//http:localhost:9090/test2?firstName=Raj&lastName=Kumar
	@RequestMapping("test1")
	public String test1(@RequestParam String param1) {
		System.out.println("from test1...");
		return "value of param1:-"+param1;
	}
	
	@RequestMapping("/test2")
	public String test2(@RequestParam String firstName,@RequestParam String lastName) {
		System.out.println("from test2...");
		String fullName=firstName +" "+lastName;
		return "Full Name:-"+fullName;
	}
	
	@RequestMapping("/test3")
	public String age(@RequestParam int age) {
		System.out.println("from test3...");
		return "Age is:- "+age;
	}
	@RequestMapping("test4")
	public String test4(@RequestParam(required=false) String lastName) {
		System.out.println("from test4...");
		return "last Name-"+lastName;
	}
    @RequestMapping("test5")
	public String test5(@RequestParam(required=true) String lastName) {
		System.out.println("from test5...");
		return "last name:-"+lastName;
	}
    //http://localhost:9090/test6?param1=kumar
    @RequestMapping("test6")
	public String test6(@RequestParam(name="param1") String lastName) {
		System.out.println("from test6...");
		return "last name:-"+lastName;
	}
    @RequestMapping("test7")
	public String test7(@RequestParam(name="n") String lastName) {
		System.out.println("from test7...");
		return "last name:-"+lastName;
	}
    //http://localhost:9090/test8?kumar
    @RequestMapping("test8")
	public String test8(@RequestParam(defaultValue="abc") String lastName) {
		System.out.println("from test7...");
		return "last name:-"+lastName;
	}
}
