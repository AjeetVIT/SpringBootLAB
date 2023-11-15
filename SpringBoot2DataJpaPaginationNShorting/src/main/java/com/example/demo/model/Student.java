package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@Column(name="sid")
	private Integer id;
	@Column(name="sname")
	private String sname;
	@Column(name="scourse")
	private String course;
	@Column(name="sfee")
	private Double fee;
	

}
