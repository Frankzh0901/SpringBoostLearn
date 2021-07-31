package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    List<Student> selectAllStudents();

    int insertStudent(UUID id, Student student);
}
