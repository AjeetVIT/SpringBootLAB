package in.wipro.ajeet.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Employee;
import in.wipro.ajeet.repo.EmployeeRepository;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Employee(10,"Ajeet",5600.0,"DEV"));
		repo.save(new Employee(11,"Bipul",4700.0,"DEV"));
		repo.save(new Employee(12,"Dharmendra",5800.0,"QA"));
		repo.save(new Employee(13,"Sunny",6900.0,"BA"));
		repo.save(new Employee(14,"Manoj",5600.0,"QA"));
		repo.save(new Employee(15,"Prabhat",8600.0,"BA"));
		repo.save(new Employee(16,"Raghu",7600.0,"QA"));
		System.out.println("-----------Done-------------");

	}

}
