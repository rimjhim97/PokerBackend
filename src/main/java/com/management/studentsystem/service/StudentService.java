package com.management.studentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.studentsystem.model.Student;


public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();

	public Student fetchStudentDetails(int id);


}
