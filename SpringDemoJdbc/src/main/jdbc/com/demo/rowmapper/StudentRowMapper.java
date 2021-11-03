package com.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.jdbc.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		
		stu.setRollNo(rs.getInt("Roll_no"));
		stu.setName(rs.getString("Student_name"));
		stu.setAddress(rs.getString("Student_address"));
		
		return stu;
	}

}
