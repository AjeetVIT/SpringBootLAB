package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
@Id
private Integer id;
private String name;
//---Date and Time--
@Temporal(TemporalType.DATE)
private Date dteA;
@Temporal(TemporalType.TIME)
private Date dteB;
@Temporal(TemporalType.TIMESTAMP)
private Date dteC;
}
