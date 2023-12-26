package com.user.app.query.resolver;

import java.util.List;
import org.springframework.stereotype.Component;
import com.user.app.model.Teacher;
import com.user.app.repository.TeacherRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class TeacherQueryResolver implements GraphQLQueryResolver {

	private final TeacherRepository teacherRepository;

	public TeacherQueryResolver(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
}