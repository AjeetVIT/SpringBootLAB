package in.wipro.ajeet.model;

//import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	private Integer id;
	private String name;
	private Double sal;
	//*----1
	//Employee---<>Dept
	@ManyToMany
	@JoinColumn(name="didFK")
	private Dept dob;

}
