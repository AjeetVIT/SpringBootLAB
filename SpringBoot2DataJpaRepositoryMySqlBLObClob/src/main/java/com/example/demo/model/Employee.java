package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	@Lob//BLOB
	private byte[] eimg;
	@Lob//CLOB
	private char[] edesc;

}
