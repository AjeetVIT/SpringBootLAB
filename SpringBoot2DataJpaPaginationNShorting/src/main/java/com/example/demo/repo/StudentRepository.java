package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Student;

public interface StudentRepository 
extends PagingAndSortingRepository<Student, Integer>{

	void save(Student student);

}
