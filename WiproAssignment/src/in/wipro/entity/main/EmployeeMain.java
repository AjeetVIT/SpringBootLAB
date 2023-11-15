package in.wipro.entity.main;

import java.util.ArrayList;
import java.util.Iterator;

import in.wipro.entity.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(10,"Ajeet","BTM Layout",2300.0));
		employeeList.add(new Employee(11,"Ameet","Rajshree Layout",3300.0));
		employeeList.add(new Employee(12,"Bipul","Bangalore",2900.0));
		employeeList.add(new Employee(13,"Sanjay","Vijayshree Layout",9300.0));
		employeeList.add(new Employee(14,"Sunny","Patna",2300.0));
		for(Employee employee :employeeList) {
			System.out.println("ID: "+employee.getId());
			System.out.println("Name: "+employee.getName());
			System.out.println("Address: "+employee.getAddress());
			System.out.println("ID: "+employee.getSalry());
			System.out.println("**********==============************");
			Iterator it= employeeList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			
		}
	}

}
