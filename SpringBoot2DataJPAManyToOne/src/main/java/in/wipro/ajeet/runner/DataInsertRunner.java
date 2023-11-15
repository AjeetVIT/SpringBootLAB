package in.wipro.ajeet.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Dept;
import in.wipro.ajeet.model.Employee;
import in.wipro.ajeet.repo.DeptRepository;
import in.wipro.ajeet.repo.EmployeeRepository;
@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private DeptRepository drepo;
	@Autowired
	private EmployeeRepository erepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
Dept d1=new Dept(550,"DEV");
Employee e1= new Employee(10,"Ajeet",3000.0,d1);
Employee e2= new Employee(11,"Anil",4000.0,d1);
drepo.save(d1);
erepo.save(e1);
erepo.save(e2);
	}

}
