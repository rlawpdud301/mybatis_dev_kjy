package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.yi.mybatis_dev_kjy.dto.Student;

public interface StudnetMapper {
	
		@Select("select stud_id, name, email, phone, dob from students where stud_id=#{studId}")
	   Student selectStudnentById(Student student);
	   
		@Select("select stud_id, name, email, phone, dob from students")
		List<Student> selectStudentByAll();
		
		@Insert("INSERT INTO mybatis_dev.students (STUD_ID,NAME, EMAIL, PHONE, DOB) VALUES(#{studId},#{name}, #{email}, #{phone}, #{dob})")
		int insertStudent(Student student);
		
		@Update("UPDATE students SET NAME=#{name}, EMAIL=#{email}, PHONE=#{phone}, DOB=#{dob}  where STUD_ID=#{studId}")
		int updateStudent(Student student);
		
		@Delete("DELETE FROM students WHERE STUD_ID = #{studId}")
		int deleteStudent(int id);
}
