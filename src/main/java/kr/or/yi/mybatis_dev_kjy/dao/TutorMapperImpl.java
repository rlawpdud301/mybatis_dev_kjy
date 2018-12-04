package kr.or.yi.mybatis_dev_kjy.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_kjy.dto.Tutor;
import kr.or.yi.mybatis_dev_kjy.jdbc.MyBatisSqlSessionFactory;

public class TutorMapperImpl {
	private String namespace = "kr.or.yi.mybatis_dev_kjy.dao.TutorMapper";
	
	public Tutor selectTutorById(int tutorId) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectTutorById",tutorId);
		}
	}
	
	public Tutor selectTutorByTutorId(Tutor tutor) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectTutorByTutorId",tutor);
		}
	}
	
}
