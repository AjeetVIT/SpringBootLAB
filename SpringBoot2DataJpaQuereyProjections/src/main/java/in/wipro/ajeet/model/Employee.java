package in.wipro.ajeet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;

}
