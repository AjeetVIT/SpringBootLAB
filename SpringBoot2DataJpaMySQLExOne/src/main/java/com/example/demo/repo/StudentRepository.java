package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
