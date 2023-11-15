package com.example.demo.runner;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
		System.out.println("Date");
		Date dt= new Date(System.currentTimeMillis());
		System.out.println(dt);
		Employee emp=new Employee(55,"Ajeet",dt,dt,dt);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy hh:mm");
		String dts = sdf.format(dt);
		System.out.println(dts);
		repo.save(emp);

	}

}
