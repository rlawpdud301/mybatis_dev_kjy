package kr.or.yi.mybatis_dev_kjy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_kjy.dao.studentMapper;
import kr.or.yi.mybatis_dev_kjy.dao.studentMapperImpl;
import kr.or.yi.mybatis_dev_kjy.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_kjy.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {
	
	private studentMapper dao = new studentMapperImpl();

	@Test
	public void test01selectstudentbyno() {
		log.debug("test01selectstudentbyno");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		Student searchedStd = dao.selectstudentbyno(searchStd);
		Assert.assertNotNull(searchStd);
	}
	
	@Test
	public void test02selectStudentByAll() {
		log.debug("test02selectStudentByAll");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		List<Student> stdList = dao.selectStudentByAll();
		Assert.assertNotNull(stdList);
	}
	
	@Test
	public void test03insertStudent() {
		log.debug("test03insertStudent");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990,2,28);
		/*Student searchStd = new Student();
		searchStd.setStudId(3);*/
		Student Std = new Student(4,"김재영2","rlawpdud303@naver.com",new PhoneNumber("010-9999-5555"),newDate.getTime());		
		int res = dao.insertStudent(Std);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test04updateStudent() {
		log.debug("test03updateStudent");		
		Student Std = new Student(1,"김재영","rlawpdud301@naver.com",new PhoneNumber("010-9986-5500"),new Date());		
		int res = dao.updateStudent(Std);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test05deleteStudent() {
		log.debug("test03deleteStudent");		
		int res = dao.deleteStudent(4);
		Assert.assertEquals(1, res);
		
	}

}
