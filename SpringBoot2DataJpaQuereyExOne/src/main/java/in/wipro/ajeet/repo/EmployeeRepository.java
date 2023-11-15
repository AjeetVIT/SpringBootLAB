package in.wipro.ajeet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.wipro.ajeet.model.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer> {
	@Query("SELECT e FROM Employee e")
	List<Employee>getAllEmps();
	//Positional parameter ?1 takes input while calling method
	//form method parameter
	@Query("SELECT e FROM Employee e WHERE edept=?1")
	//List<Employee>getAllEmpsByDept(String a);
	List<Employee>getAllEmpsByDept(String edept);
	@Query("SELECT e FROM Employee e WHERE edept=?1 or id=?2")
	List<Employee>getAllEmpsByInfo(String edept,Integer id);
	@Query("Select e From Employee e Where id between ?1 and ?2")
	List<Employee>getAllEmpsByInfo2(Integer id1,Integer id2);
	//Named Parameter(anyName->must match with method type
	@Query("SELECT e FROM Employee e WHERE id between :id1 and :id2")
	List<Employee>getAllEmpsByInfo3(Integer id1,Integer id2);
	//-----sql query-----
	@Query(nativeQuery = true,value = "SELECT * FROM EMPLOYEE")
	List<Employee> fetchDataBySql();
	//in operator to fetch Data in Any Order
	@Query("Select e From Employee e Where id in(:inputs)")
	List<Employee>getAllEmpsById(List<Integer>inputs);

}
