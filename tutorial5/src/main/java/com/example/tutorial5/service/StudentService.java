package com.example.tutorial5.service;

import java.util.List;

import com.example.tutorial5.model.CourseModel;
import com.example.tutorial5.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	
	List<StudentModel> selectAllStudents();
	
	void addStudent(StudentModel student);
	
	void deleteStudent(String npm);
	
	void updateStudent(StudentModel student);
	
	CourseModel selectCourse( String id_course);
	
	List<StudentModel> selectStudentCourses();
	
}
