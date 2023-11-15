package in.wipro.ajeet.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Employee;
import in.wipro.ajeet.repo.EmployeeRepository;
@Component
public class EmployeeInsertRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Employee(101,"Ajeet",2.2,"DEV"));
		repo.save(new Employee(102,"Bipul",3.2,"DEV"));
		repo.save(new Employee(103,"Chandra",4.2,"QA"));
		repo.save(new Employee(104,"Dharmendra",5.2,"BA"));
		repo.save(new Employee(105,"Fantush",6.2,"QA"));
		repo.save(new Employee(106,"Hina",7.2,"BA"));

	}

}
