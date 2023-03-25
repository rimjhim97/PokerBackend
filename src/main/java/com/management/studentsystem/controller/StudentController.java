package com.management.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.studentsystem.model.Student;
import com.management.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public String addStudentDetails(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return "New student added successfully!";
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> fetchAllStudentsData()
	{
		return studentService.getAllStudents();
	}

	@GetMapping("/fetchStudentDetailsForId")
	public Student fetchStudent(@RequestParam("studentId") int id)
	{
		return studentService.fetchStudentDetails(id);
	}

}
