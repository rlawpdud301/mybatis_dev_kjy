package kr.or.yi.mybatis_dev_kjy.dao;

import kr.or.yi.mybatis_dev_kjy.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userpic);
	UserPic getUserPic(int id);
}
