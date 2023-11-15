package in.wipro.ajeet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	private Integer id;
	private String ename;
	private Double esal;
	private String edept;

}
