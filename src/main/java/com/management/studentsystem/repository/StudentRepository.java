package com.management.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.management.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> 
{
    @Query(nativeQuery = true, value = "SELECT * FROM Student WHERE id = :studentId")
    public Student fetchStudentDetails(@Param("studentId") int id);

}
