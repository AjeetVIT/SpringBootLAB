package com.example.demo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
@Component
public class StudentRunner implements  CommandLineRunner {
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
		repo.save(new Student(15,"Manoj","DevOps",90000.0));
		repo.save(new Student(16,"Tinku","Azure with cloud",13000.0));
		repo.save(new Student(17,"Jugnu","English",3000.0));
		repo.save(new Student(18,"Hari","Mathematics",6000.0));
		repo.save(new Student(19,"Dharmendra","Chemistry",300.0));
		repo.save(new Student(20,"Om Subash","Design Pattern",15000.0));
		repo.save(new Student(21,"Parksah","Rest webservices",33000.0));
		
		System.out.println("*****-----------#########--------------******");
		//Sort sort= Sort.by("sname");
		Sort sort=Sort.by(Direction.DESC,"sname");
		repo.findAll(sort).forEach(System.out::println);
		//int size;
		//prepare Pagination Input
		System.out.println("@@@@@@@@@*********************************@@@@@@@@@");
		Pageable input=PageRequest.of(0, 4);
		Page<Student>page=repo.findAll(input);
		List<Student> list = page.getContent();
		list.forEach(System.out::println);
		System.out.println();
		//additional Information
		System.out.println("Is First Page :"+ page.isFirst());
		System.out.println("Is Last Page :"+ page.isLast());
		System.out.println("Is Empty Page :"+ page.isEmpty());
		System.out.println("Has Next page? :"+ page.hasNext());
		System.out.println("Has Privious Page :"+ page.hasPrevious());
		System.out.println("Current Page Number :"+ page.getNumber());
		System.out.println("Total pages :"+ page.getTotalPages());
		System.out.println("total rows :"+ page.getTotalElements());
		//stop server
		System.exit(0);
	}
	
	

}
