package in.wipro.ajeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.wipro.ajeet.model.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer> {
	//-----------multiple rows output------------------
	@Query("SELECT e FROM Employee e ")
	List<Employee> getAllEmployees();
	
	@Query("SELECT e.empName FROM Employee e ")
	List<String> getAllEmployeeNames();
	@Query("SELECT e.empName, e.empSal,e.empDept FROM Employee e ")
	List<Object[]> getAllEmployeeNameAndSal();
	
	//-----------------------------One ROw Output--------------------------//
	@Query("SELECT e FROM Employee e WHERE  e.empId=:empId")
	Employee getEmployeeById(Integer empId);
	@Query("Select e.empName,e.empSal FROM Employee e WHERE e.empId=:empId")
	Object getEmployeeNameAndSalById(Integer empId);
	@Query("SELECT e.empName FROM Employee e WHERE e.empId=:empId")
	String getEmployeeNameById(Integer empId);

}
