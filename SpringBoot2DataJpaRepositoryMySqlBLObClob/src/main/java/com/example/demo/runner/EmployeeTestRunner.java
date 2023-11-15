package com.example.demo.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
@Component
public class EmployeeTestRunner implements CommandLineRunner {
@Autowired
private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
      FileInputStream fis=new FileInputStream("C:\\Images\\Ajeet.jpg");
      byte[] arr =new byte[fis.available()];
      fis.read(arr);
      String info="AAAA";
      char[] edesc = info.toCharArray();
      repo.save(new Employee(66,"AA",arr,edesc));
      fis.close();
	}

}
