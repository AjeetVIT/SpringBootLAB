package in.wipro.ajeet.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Employee;
//import in.wipro.ajeet.model.Employee;
import in.wipro.ajeet.repo.EmployeeRepository;

@Component
public class EmployeeQureyProjectionTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// List<Employee> list = repo.getAllEmployees();
		// List<String> list = repo.getAllEmployeeNames();
		// list.forEach(System.out::println);
		/*
		 * List<Object[]> list = repo.getAllEmployeeNameAndSal();
		 * list.stream().map(ob->ob[0]+"---"+ob[1]+"---"+ob[2]).forEach(System.out::
		 * println);
		 * 
		 * for(Object[] ob:list) { System.out.println(ob[0]+"--"+ob[1]); }
		 */
//		Employee e = repo.getEmployeeById(101);
		
		/*
		 * Object ob[] = (Object[])repo.getEmployeeNameAndSalById(102);
		 * System.out.println(ob[0]+"--------"+ob[1]);
		 */
		String name = repo.getEmployeeNameById(103);
		System.out.println(name);
	}

}
