package com.learn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.spring.model.Student;
import com.learn.spring.service.StudentService;

//@Controller
@RestController //-> combination of controller and responsebody
public class FirstController {

	@Autowired //StudentService studentService = new StudentService();
	StudentService studentService;
	
	@GetMapping("/getstud1")
	@ResponseBody
	public Student getStudent() {
		System.out.println("getstud1 is called");
		return studentService.createStudent();
	}
	
	//http://localhost:8080/getstud2 --> API
	@GetMapping("/getstud2")
	//@ResponseBody
	public Student getStudent2() {
		Student s1 = new Student();
		s1.setName("Kumar");
		s1.setAge(20);
		return s1;
	}
	
	//http://localhost:8080/newstudent --> API
	@PostMapping("/newstudent")
	public Student createStudent(String name, int age)
	{
		Student s1 = new Student();
		s1.setName(name);
		s1.setAge(age);
		return s1;
	}
	
}
