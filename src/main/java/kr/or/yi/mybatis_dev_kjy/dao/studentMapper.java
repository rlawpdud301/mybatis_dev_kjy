package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;

import kr.or.yi.mybatis_dev_kjy.dto.Student;

public interface studentMapper {
	Student selectstudentbyno(Student student);	
	List<Student> selectStudentByAll();
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
}
