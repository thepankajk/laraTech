package com.example.jpa3;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;

	import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("person")
	public class PersonController {

		@Autowired
		private PersonRepository personRepository;
		@PostMapping
		public Person save(@RequestBody Person person) {
			return personRepository.save(person);
		}

		@GetMapping
		public List<Person> find(@RequestBody Person person){
			return (List<Person>) 
					personRepository.findAll();
		}
		
		@GetMapping("/{id}")
		public Person readEmployee(@PathVariable Integer id) {
			return personRepository.findById(id).get();
			
		}
		@DeleteMapping("/{id}")
		public Integer deletePerson(@PathVariable Integer id) {
			personRepository.deleteById(id);
			return id;
			
	}
		@DeleteMapping
		public  Person DeleteAll(@RequestBody Person person){
			  personRepository.deleteAll();
			  return person;
		}
		
		@PostMapping("family")
		public Family saveAll1(@RequestBody Family family) {
			personRepository.saveAll(family.getPersons());
			return family;
		}
		
			
		}
		

