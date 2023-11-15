package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {
@Autowired
private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		repo.saveAll(Arrays.asList(
		new Employee(101,"Ajeet","DEV",300.0),
		new Employee(108,"Amarjeet","DEV",300.0),
		new Employee(102,"Bipul","QA",400.0),
		new Employee(103,"Chandra","HR",500.0),
		new Employee(104,"Dharmendra","HR",600.0),
		new Employee(105,"Sapna","QA",700.0),
		new Employee(106,"Raja","BA",400.0),
		new Employee(107,"Vijay","DEV",900.0)));
	
		List<Employee> list = repo.findAll();
		list.forEach(System.out::println);
		System.out.println("-------------------------");
Employee emp=new Employee();
emp.setSal(400);
Example<Employee> ex = Example.of(emp);
List<Employee> list2 = repo.findAll(ex);
list2.forEach(System.out::println);
	}

}
