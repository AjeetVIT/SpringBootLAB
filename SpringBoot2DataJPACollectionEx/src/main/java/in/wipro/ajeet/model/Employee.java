package in.wipro.ajeet.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	
	@ElementCollection
	@CollectionTable(name="emprjstab",
	joinColumns = @JoinColumn(name="eid")) //key
	@Column(name="prj")        //element column
	@OrderColumn(name="pos")      //index column
	private List<String> empPrjs;
	
	@ElementCollection
	@CollectionTable(name="emptasktab",
	joinColumns = @JoinColumn(name="eid"))  //key column
	@Column(name="task")     //element column
	//@OrderColumn(name="pos")   //index column
	private Set<String>empTasks;
	
	@ElementCollection
	@CollectionTable(name=" empmodulestab",
	joinColumns = @JoinColumn(name="eid"))  //key column
	@Column(name="module")
	@MapKeyColumn(name="pos")
	private Map<Integer,String>empModules;

}
