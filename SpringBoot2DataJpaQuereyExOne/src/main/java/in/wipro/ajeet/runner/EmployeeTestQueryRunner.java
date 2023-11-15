package in.wipro.ajeet.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.repo.EmployeeRepository;
@Component
public class EmployeeTestQueryRunner implements CommandLineRunner{
	@Autowired
private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repo.getAllEmps().forEach(System.out::println);
		//repo.getAllEmpsByDept("QA").forEach(System.out::println);
		//repo.getAllEmpsByInfo("QA", 14).forEach(System.out::println);
	//repo.getAllEmpsByInfo2(10, 13).forEach(System.out::println);;
	//repo.getAllEmpsByInfo3IInId(10, 11,12,13)
		//repo.fetchDataBySql().forEach(System.out::println);
		//repo.getAllEmpsByInfo3(10, 14).forEach(System.out::println);
	repo.getAllEmpsById(Arrays.asList(10,13,15,22,48)).forEach(System.out::println);
	}

}
