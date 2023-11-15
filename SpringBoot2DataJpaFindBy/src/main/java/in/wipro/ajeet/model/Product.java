package in.wipro.ajeet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	private String prodVendor;
	private String prodGrade;

}
