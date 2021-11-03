package com.demo.test;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.demo.dao.StudentDAOimpl;
import com.demo.jdbc.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 final Logger logger = Logger.getLogger(Test.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAOimpl studentDAOimpl = context.getBean("studentDAO",StudentDAOimpl.class);
		
		
		Student stu1 = new Student();
		stu1.setRollNo(4);
		stu1.setName("Nitin");
		stu1.setAddress("Tirupati");
		
		
		studentDAOimpl.insert(stu1);
		
		boolean isDeleted =studentDAOimpl.deleteRecordByRollNo(2);
		if(isDeleted) {
			logger.info("Row is deleted");
		}
		
		
		List<Student> studentList = studentDAOimpl.findAllStudents();
		
		for(Student students:studentList) {
			
			System.out.println(students.toString());
		}
		

	}

}

