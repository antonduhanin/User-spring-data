package com.springjpa.controller;

import java.util.Arrays;
import java.util.List;

import com.springjpa.model.User;
import com.springjpa.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
	@Autowired
	UserRepository repository;
	
	@RequestMapping("/save")
	public String process(){
		// save a single Customer
		//repository.save(new Customer("Jack", "Smith"));
		
		// save a list of Customers
		//repository.save(Arrays.asList(new Customer("Adam", "Johnson"), new Customer("Kim", "Smith"),
		//								new Customer("David", "Williams"), new Customer("Peter", "Davis")));
		
		return "Done";
	}
	
	
	@RequestMapping("/findall")
	public List<User> findAll(){
		String result = "";
		
		/*for(Customer cust : repository.findAll()){
			result += cust.toString() + "<br>";
		}
		*/
		return repository.findAll();
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		//result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "";
		/*
		for(Customer cust: repository.findByLastName(lastName)){
			result += cust.toString() + "<br>"; 
		}
		*/
		return result;
	}
}

