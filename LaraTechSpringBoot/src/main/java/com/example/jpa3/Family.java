package com.example.jpa3;

	import java.util.ArrayList;
	import java.util.List;

	public class Family {
		private List<Person> persons =  new ArrayList<Person>();
		private List<Integer> ids = new ArrayList<Integer>();
		public List<Person> getPersons() {
			return persons;
		}
		public void setPersons(List<Person> persons) {
			this.persons = persons;
		}
		public List<Integer> getIds() {
			return ids;
		}
		public void setIds(List<Integer> ids) {
			this.ids = ids;
		}
		

	}

