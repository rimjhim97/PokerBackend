package com.management.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.studentsystem.model.Student;
import com.management.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) 
	{
		//Saving student in db
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() 
	{
		//Fetch all student details
		return studentRepo.findAll();
	}

	@Override
	public Student fetchStudentDetails(int id)
	{
		return studentRepo.fetchStudentDetails(id);
	}
	

}
