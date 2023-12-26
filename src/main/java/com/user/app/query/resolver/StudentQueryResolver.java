package com.user.app.query.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.user.app.model.Student;
import com.user.app.repository.StudentRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {
	private final StudentRepository studentRepository;

	public StudentQueryResolver(StudentRepository userRepository) {
		this.studentRepository = userRepository;
	}

	public Student getStudent(String id) {
		return studentRepository.findById(id).orElse(null);
	}

	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

}
