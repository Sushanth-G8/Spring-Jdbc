package com.demo.dao;

import java.util.List;

import com.demo.jdbc.Student;

public interface StudentDAO {
	
	void insert(Student student);
	
	boolean deleteRecordByRollNo(int rollno);
	
	List<Student> findAllStudents();

}
