package com.boot;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String[] mailAccounts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getMailAccounts() {
		return mailAccounts;
	}

	public void setMailAccounts(String[] mailAccounts) {
		this.mailAccounts = mailAccounts;
	}

}
