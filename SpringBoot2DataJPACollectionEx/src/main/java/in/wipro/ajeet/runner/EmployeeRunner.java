package in.wipro.ajeet.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
		repo.save(
				new Employee(10,"A",2.2,
						List.of("P1","P2"),
						Set.of("T1","T2"),
						Map.of(101,"M1",102,"M2")));
		System.out.println("---------Done--------------");

	}

}
