package com.learn.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.spring.model.Physical;
import com.learn.spring.model.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService {

	
	public Student createStudent() {
		Student s6 = Student.builder().name("ashok raj").fathername("pauralj").mothername("kamala").build();
		log.info("Student S6 created");
		return s6;
	}
	
	
	public List<Student> createStudents(){
		List<Student> students = new ArrayList<Student>();
		//Student s1 = Student.builder().name("ashok raj").appereance( Physical.builder().height(5).weight(60).build() ).fathername("pauralj").mothername("kamala").build();
		//Student s2 = Student.builder().name("ashok raj").appereance( Physical.builder().height(5).weight(60).build() ).fathername("pauralj").mothername("kamala").build();
		Student s1 = Student.builder().name("ashok raj").fathername("pauralj").mothername("kamala").build();
		Student s2 = Student.builder().name("ashok raj").fathername("pauralj").mothername("kamala").build();
		students.add(s1);
		students.add(s2);
		return students;
	}
}
