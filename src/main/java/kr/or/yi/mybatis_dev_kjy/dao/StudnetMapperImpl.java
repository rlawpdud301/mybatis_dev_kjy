package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_kjy.dto.Student;
import kr.or.yi.mybatis_dev_kjy.jdbc.MyBatisSqlSessionFactory;

public class StudnetMapperImpl implements StudnetMapper {
	private static final String namespace = "kr.or.yi.mybatis_dev_kjy.dao.StudnetMapper";
	
	@Override
	public Student selectStudnentById(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectStudnentById",student);
		}
	}

	@Override
	public List<Student> selectStudentByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace+".selectStudentByAll");
		}
	}

	@Override
	public int insertStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			int res = sqlSession.insert(namespace+".insertStudent",student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			int res = sqlSession.update(namespace+".updateStudent",student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteStudent(int id) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			int res = sqlSession.update(namespace+".deleteStudent",id);
			sqlSession.commit();
			return res;
		}
	}

}
