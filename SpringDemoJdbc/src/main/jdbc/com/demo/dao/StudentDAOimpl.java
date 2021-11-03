package com.demo.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.jdbc.Student;
import com.demo.rowmapper.StudentRowMapper;

@Repository("studentDAO")
public class StudentDAOimpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(Student student){
		
		
		String sql = "Insert INTO student values(?,?,?)";
		Object[] obj={student.getRollNo(), student.getName(), student.getAddress()};
		int noOfRowInserted = jdbcTemplate.update(sql,obj);
		
		System.out.println("No of rows inserted is"+  noOfRowInserted);
		
		
		
	}

	@Override
	public boolean deleteRecordByRollNo(int rollno) {
		// TODO Auto-generated method stub
		String sql = "Delete from student where Roll_no= ?";
		int noOfRowsDeleted = jdbcTemplate.update(sql, rollno);
		
		if(noOfRowsDeleted==1) {
			return true;
		}
		
		else {
			return false;
		}
		
		
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		
		String sql= "Select * from student";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		
		
		return null;
	}


		
				
		
	
		
		

	}





