package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;
import java.util.Map;

import kr.or.yi.mybatis_dev_kjy.dto.Student;

public interface studentMapper {
	Student selectstudentbyno(Student student);	
	List<Student> selectStudentByAll();
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
	List<Map<String, Object>> selectStudentByAllForResutlMap();
	List<Student> selectStudentByAllForRselt();
	Student selectStudentByNoForResultMapExtents(Student student);
	Student selectStudentByNoForResultMapExtents2(int studId);
	Student selectStudentByNoAssociation(Student student);
}
