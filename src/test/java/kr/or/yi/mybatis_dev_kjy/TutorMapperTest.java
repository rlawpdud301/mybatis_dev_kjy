package kr.or.yi.mybatis_dev_kjy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_kjy.dao.TutorMapper;
import kr.or.yi.mybatis_dev_kjy.dao.TutorMapperImpl;
import kr.or.yi.mybatis_dev_kjy.dto.Student;
import kr.or.yi.mybatis_dev_kjy.dto.Tutor;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorMapperTest extends AbstractTest{
	private TutorMapperImpl dao = new TutorMapperImpl();
	

	@Test
	public void test01selectTutorByCode() {
		log.debug("test01selectstudentbyno");		
		Tutor tutor = dao.selectTutorById(1);
		Tutor findTutor = new Tutor();
		findTutor.setTutorId(1);
		Tutor tutor2 = dao.selectTutorByTutorId(findTutor);
		Assert.assertEquals(tutor.getTutorId(), tutor2.getTutorId());
	}
}
