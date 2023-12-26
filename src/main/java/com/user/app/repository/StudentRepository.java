package com.user.app.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.app.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
