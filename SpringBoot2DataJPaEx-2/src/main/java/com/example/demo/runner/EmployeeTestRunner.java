package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
@Component
public class EmployeeTestRunner implements CommandLineRunner {
	@Autowired
private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repo.getClass().getName());
		//=========insert Data============
		Employee emp=new Employee(102,"Ajeet",2600.0);
		//emp.setEmpId(101);
		//emp.setEmpName("Ajeet");
		//emp.setEmpSal(2600.0);
		repo.save(new Employee(102,"Ajeet",2600.0));
		repo.save(new Employee(103,"Kumar",2700.0));
		repo.save(new Employee(103,"Azad",2900.0));
		repo.save(new Employee(105,"Ameet",2800.0));
		repo.save(new Employee(106,"Anil",2200.0));
		
		//----print all rows----
		Iterable<Employee> data = repo.findAll();
		for(Employee e:data) {
			System.out.println(e);
		}

	}

}
