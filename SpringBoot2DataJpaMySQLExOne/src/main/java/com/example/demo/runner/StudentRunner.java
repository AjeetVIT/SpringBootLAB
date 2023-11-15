package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
	
		// TODO Auto-generated method stub
		repo.save(new Student(10,"Ajeet","Core Java",500.0));
		repo.save(new Student(11,"Kumar","Advance Java",900.0));
		repo.save(new Student(12,"Bipul","Spring Boot",1000.0));
		repo.save(new Student(13,"Sumit","Hibernate",2000.0));
		repo.save(new Student(14,"Vinod","Oracle",500.0));
		repo.save(new Student(15,"Pawan","DevOps",90000.0));
		repo.save(new Student(16,"Sanket","Azure with cloud",13000.0));
		
		System.out.println("----Done----");
		Sort sort=Sort.by("sname");
	//repo.findAll(sort).forEach(System.out::println);;
		System.exit(0);

	}

	

}
