package com.boot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
	// @RequestBody is used for reading argument of the method
    @PostMapping("save")
	public Customer save(@RequestBody Customer customer) {
	System.out.println("id:-"+customer.getCustomerId());
	System.out.println("firstName:-"+customer.getFirstName());
	System.out.println("lastName:-"+customer.getLastName());
	System.out.println("customerAddress:-"+customer.getCustomerAddress().getHouseNo());
	System.out.println("customerAddress:-"+customer.getCustomerAddress().getStreetName());
	return customer;
	}
}
