package com.user.app.query.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.app.model.Teacher;
import com.user.app.repository.TeacherRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class TeacherMutation implements GraphQLMutationResolver {

	@Autowired
	private TeacherRepository teacherRepository;

	public Teacher createTeacher(@RequestBody Teacher student) {
		Teacher std = new Teacher();
		std.setFirstName(student.getFirstName());
		std.setLastName(student.getLastName());
		std.setSubject(student.getSubject());
		return teacherRepository.save(std);
	}
}
