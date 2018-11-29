package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_kjy.dto.Student;
import kr.or.yi.mybatis_dev_kjy.jdbc.MyBatisSqlSessionFactory;

public class studentMapperImpl implements studentMapper {

	private static final String namespace = "kr.or.yi.mybatis_dev_kjy.dao.studentMapper";
	
	@Override
	public Student selectstudentbyno(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectstudentbyno", student);
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
			int res = sqlSession.delete(namespace+".deleteStudent",id);
			sqlSession.commit();
			return res;
		}
	}

}
