package com.example.aws.springcloudawslambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.aws.springcloudawslambda.entity.Student;
import com.example.aws.springcloudawslambda.repository.StudentRepository;

@SpringBootApplication
public class SpringCloudAwsLambdaApplication {
	
	@Autowired
	private StudentRepository repository;
	
	@Bean
	public Supplier<List<Student>> students(){
		return () -> repository.getStudents();
	}
	
	@Bean
	public Function<String, List<Student>> findByName(){
		return (input) -> repository.getStudents().stream()
				.filter(student -> student.getName().equals(input))
				.collect(Collectors.toList());
	}
	
	@Bean
	public MyConsumer myConsumerBean() {
		return new MyConsumer();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAwsLambdaApplication.class, args);
	}

}
