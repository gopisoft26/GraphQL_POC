package com.user.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.app.model.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, String> {

}
