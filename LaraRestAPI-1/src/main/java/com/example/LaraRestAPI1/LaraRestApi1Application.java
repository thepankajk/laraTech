package com.example.LaraRestAPI1;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LaraRestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(LaraRestApi1Application.class, args);
	}
		@RequestMapping("st1")
		public String st1() {
			System.out.println("for String testing...");	
			return "hi i am from String api";
		}
		@RequestMapping("int1")
		public int int1() {
			System.out.println("for int testing...");	
			return 600;
		}
		@RequestMapping("int2")
		public Integer int2() {
			System.out.println("for Integer testing...");	
			return 700;
		}
		@RequestMapping("b1")
		public Boolean b1() {
			System.out.println("for Boolean testing...");	
			return true;
		}
		@RequestMapping("int3")
		public int[] int3() {
			System.out.println("for int array testing...");	
			int[] elements= {10,20,30,40};
			return elements;
		}
		@RequestMapping("st2")
		public String[] str2() {
			System.out.println("for int array testing...");	
			String[] elements= {"blr","hyd","mum","pune"};
			return elements;
		}
		@RequestMapping("li1")
		public ArrayList<String> list1() {
			System.out.println("for List testing...");
			ArrayList<String> li=new ArrayList<String>();
			li.add("ram");
			li.add("ravan");
			li.add("shyam");
			return li;
		}
		@RequestMapping("hs1")
		public HashSet<Integer> set1() {
			System.out.println("for HashSet testing...");
			HashSet<Integer> hs1=new HashSet<Integer>();
			hs1.add(50);hs1.add(150);hs1.add(350);hs1.add(250);hs1.add(550);
			return hs1;
		}
		
		@RequestMapping("hm1")
		public HashMap<String,String> hm1(){
		System.out.println("for HashSet testing...");
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("firstName", "ram");
		hm1.put("secondName", "shyam");
		hm1.put("thirdName", "john");
		return hm1;
		}
	    @RequestMapping("p1")
		public Person p1() {
		    System.out.println("person api testing");
			Person p=new Person();
			p.setfirstName("vijay");
			p.setLastName("Kumar");
			return p;
		}
	    @RequestMapping("ad1")
		public Address ad1() {
		    System.out.println("Address api testing");
		    Address ad=new Address();
			ad.setHouseNo("D-205");
			ad.setStreetName("BTM");
			return ad;
		}
	    @RequestMapping("emp1")
		public Employee emp1() {
		    System.out.println("Employee api testing");
		    Employee emp=new Employee();
			emp.setFirstName("Rahul");
			emp.setLastName("Kumar");
			emp.setAge(28);
			Address ad=new Address();
			ad.setHouseNo("C-632");
			ad.setStreetName("Mahaveer Nagar ext");
			emp.setAddress(ad);
			return emp;
		}
	}
	

