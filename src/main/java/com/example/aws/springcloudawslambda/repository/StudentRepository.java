package com.example.aws.springcloudawslambda.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.aws.springcloudawslambda.entity.Student;

@Repository
public class StudentRepository {

	public List<Student> studentList(){
		return Arrays.asList(
					new Student(1, "Joshua", 33),
					new Student(2, "Marylin", 54),
					new Student(3, "Charles", 17)
				);
	}
	
	public List<Student> getStudents(){
		return List.of(
					new Student(1, "Joshua", 33),
					new Student(2, "Marylin", 54),
					new Student(3, "Charles", 17)
				);
	}	
}
