package com.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.learn.spring.model.Physical;
import com.learn.spring.model.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootDay2Application extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringBootDay2Application.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDay2Application.class, args);
		
		log.info("Spring application have started");
		
		//Student s1 = new Student("ashokraj", "Male", "Paulraj", "Kamala", 29);
		Student s2 = new Student(); //default constructor , without parameters
		Student s3 = new Student("ashok", 29);
		Student s4 = new Student("ashokraj", "paulraj", "kamala");
		
		//builder
		Student s5 = Student.builder().name("ashok raj").age(29).fathername("paurraj").mothername("kamala").build();
		System.out.println("S5 : " + s5);
		s5.saySomething();
		
		Student s6 = Student.builder().name("ashok raj").appereance( Physical.builder().height(5).weight(60).build() ).fathername("pauralj").mothername("kamala").build();
		
	}

}
