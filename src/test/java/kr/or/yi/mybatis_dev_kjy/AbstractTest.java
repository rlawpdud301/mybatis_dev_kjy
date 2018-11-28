package kr.or.yi.mybatis_dev_kjy;

import static org.junit.Assert.*;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.Test;

public class AbstractTest {
	protected static final Log log = LogFactory.getLog(MyBatisSqlSessionFactoryTest.class);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println();
	}

	
}
