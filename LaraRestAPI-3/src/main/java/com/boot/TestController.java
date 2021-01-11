package com.boot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestController {
	
	@RequestMapping("h1")
	public String hello1() {
		return "from hello1";
	}
	@RequestMapping("h2")
	public String hello2() {
		return "from hello2";
	}
	@RequestMapping()
	public String hello3() {
		return "from hello3";
	}
	@RequestMapping("/h4")
	public String hello4() {
		return "from hello4";
	}
	@RequestMapping(path="h5",method=RequestMethod.POST)
	public Person person(@RequestBody Person person) {
	System.out.println("FirstName is "+person.getFirstName());
	System.out.println("LastName is "+person.getLastName());
	return person;
	}
	
	
}
