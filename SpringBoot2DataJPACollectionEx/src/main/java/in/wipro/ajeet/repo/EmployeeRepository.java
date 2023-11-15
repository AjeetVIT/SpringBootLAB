package in.wipro.ajeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wipro.ajeet.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
