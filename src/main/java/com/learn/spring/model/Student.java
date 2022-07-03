package com.learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//@Getter
//@Setter
@Data
@AllArgsConstructor //constructor - with all attributes as the parameter
@NoArgsConstructor //default constructor - with out any parameter
@RequiredArgsConstructor //constructor - only with required attributes

@Builder
@Slf4j
@Entity
public class Student {

	@NonNull //required attribute
	@Id
	private String name;
	private String gender;
	@NonNull
	private String fathername;
	@NonNull
	private String mothername;
	private int age;
	
	//public Student(String name)
	//public Student(String name, String fathername, String mothername)
	
	public void saySomething()
	{
		log.warn("from the student model {}, {}, {}", name, age, fathername);
	}
	
	//custom constructor
	public Student(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
	}
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
}
