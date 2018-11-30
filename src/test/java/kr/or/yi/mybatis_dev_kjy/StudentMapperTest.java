package kr.or.yi.mybatis_dev_kjy;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_kjy.dao.StudnetMapper;
import kr.or.yi.mybatis_dev_kjy.dao.StudnetMapperImpl;
import kr.or.yi.mybatis_dev_kjy.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_kjy.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {

	private static StudnetMapper dao = new StudnetMapperImpl();

	@Test
	public void test01selectStudnentById() {
		log.debug("test01selectStudnentById()");
		Student newstd = new Student();
		newstd.setStudId(2);
		Student searchstd =dao.selectStudnentById(newstd);
		Assert.assertEquals(newstd.getStudId(),newstd.getStudId());
	}
	@Test
	public void test02selectStudentByAll() {
		log.debug("test02selectStudentByAll()");
		List<Student> lists = dao.selectStudentByAll();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void test03insertStudent() {
		log.debug("test03insertStudent()");
		Calendar newcal = GregorianCalendar.getInstance();
		newcal.set(1990,4,28);
		Student student = new Student(14,"김재영","rlawpdud301@naver,com",newcal.getTime(), new PhoneNumber("010-9986-5500"));		
		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test04updateStudent() {
		log.debug("test04updateStudent()");
		Calendar newcal = GregorianCalendar.getInstance();
		newcal.set(2000,4,28);
		Student student = new Student(14,"김재영","aaaa@naver,com",newcal.getTime(), new PhoneNumber("010-9999-5555"));		
		int res = dao.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test05deleteStudent() {
		log.debug("test05deleteStudent()");
		int res = dao.deleteStudent(14);
		Assert.assertEquals(1, res);
	}

}
