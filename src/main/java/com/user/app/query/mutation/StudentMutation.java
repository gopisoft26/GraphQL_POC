package com.user.app.query.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.app.model.Student;
import com.user.app.repository.StudentRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class StudentMutation implements GraphQLMutationResolver {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(@RequestBody Student student) {
		Student std = new Student();
		std.setEmailId(student.getEmailId());
		std.setFirstName(student.getFirstName());
		std.setLastName(student.getLastName());
		std.setPhone(student.getPhone());
		std.setAddress(student.getAddress());
		return studentRepository.save(std);
	}
}
