package kr.or.yi.mybatis_dev_kjy.dao;

import kr.or.yi.mybatis_dev_kjy.dto.Tutor;

public interface TutorMapper {
	Tutor selecTutorById(int tutorId);
	Tutor selecTutorByTutorId(Tutor tutor);
}
