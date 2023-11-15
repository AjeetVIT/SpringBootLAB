package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@Column(name="eid")
	private Integer Id;
	@Column(name="ename")
	private String name;
	@Column(name="deptName")
	private String dept;
	@Column(name="esal")
	private double sal;
	

}
