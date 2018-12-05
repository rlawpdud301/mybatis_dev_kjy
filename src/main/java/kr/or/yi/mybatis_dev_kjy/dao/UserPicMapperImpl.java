package kr.or.yi.mybatis_dev_kjy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_kjy.dto.Student;
import kr.or.yi.mybatis_dev_kjy.dto.UserPic;
import kr.or.yi.mybatis_dev_kjy.jdbc.MyBatisSqlSessionFactory;

public class UserPicMapperImpl implements UserPicMapper {
	private static final String namespace = "kr.or.yi.mybatis_dev_kjy.dao.UserPicMapper";

	@Override
	public int insertUserPic(UserPic userpic) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			int res = sqlSession.insert(namespace+".insertUserPic",userpic);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public UserPic getUserPic(int id) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".getUserPic", id);
		}
	}
	

	


	
}
