package com.boot;

import java.net.http.HttpHeaders;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@GetMapping("service1")
	public ResponseEntity<String>service1(){
		ResponseEntity responseEntity=new ResponseEntity<String>("success",HttpStatus.OK);
		return responseEntity;
	} 
	@GetMapping("/service2")
	public ResponseEntity<List<String>> service2(){
		List<String> list=new ArrayList<>();
		list.add("abc");list.add("xyz");list.add("pqr");list.add("lmn");
		ResponseEntity responseEntity=new ResponseEntity<List<String>>(list,HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/service3")
	public ResponseEntity<Person> service3(){
		Person person=new Person();
		person.setFirstName("Raj");
		person.setLastName("Kumar");
		ResponseEntity<Person> resposeEntity=new ResponseEntity<Person>(person,HttpStatus.OK);
		return resposeEntity;
	}
	@GetMapping("/service4/{age}")
	public ResponseEntity<String> service4(@PathVariable Integer age){
		ResponseEntity responseEntity=null;
		if(age<0) {
		responseEntity=new ResponseEntity<String>("Age should not be 0 or negative ",HttpStatus.OK);
		}else {
			responseEntity=new ResponseEntity<String>("Your age is "+age,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/service5/{yearOfBirth}")
	public ResponseEntity<String> service5(@PathVariable Integer yearOfBirth){
		ResponseEntity responseEntity=null;
		Integer age=null;
		if(yearOfBirth>2021) {
		responseEntity=new ResponseEntity<String>("Age should not be greater than 2021 ",HttpStatus.OK);
		}else {
			age=2021-yearOfBirth;
			responseEntity=new ResponseEntity<String>("Your age is "+age,HttpStatus.OK);
		}
		return responseEntity;
	}
	@GetMapping("/service6/{yearOfBirth}")
	public ResponseEntity<String> service6(@PathVariable Integer yearOfBirth){
		ResponseEntity<String> responseEntity=null;
		Integer age=null;
		if(yearOfBirth>2021) {
		responseEntity=ResponseEntity.badRequest().body("Age should not be greater than 2021 ");
		}else {
			age=2021-yearOfBirth;
			responseEntity=ResponseEntity.ok().body("Your age is "+age);
		}
		return responseEntity;
	}
	@GetMapping("/service7")
	public ResponseEntity<String> service7(){
		return ResponseEntity.ok().body("<h1>Hello to all</h1>");
	}
	@GetMapping("/service8")
public ResponseEntity<String> service8(){
		return ResponseEntity.ok()
				             .header("context-type","text/plain")
				             .body("<h1>hello to all</h1>");
	
}
	@GetMapping("/service9")
	public ResponseEntity<String> service9(){
			return ResponseEntity.ok()
					             .header("context-type","text/html")
					             .body("<h1>hello to all</h1>");
	}
	int counter=0;
	@GetMapping("/service10")
	public ResponseEntity<String> service10(){
		counter++;
			return ResponseEntity.ok()
					             .header("context-type","text/html")
					             .header("refresh","4")
					             .body("<h1>hello to all counter value is:-</h1>"+counter);
	}
}
