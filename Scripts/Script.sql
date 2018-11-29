show tables;

select * from courses;

select STUD_ID as sTUD_ID,NAME,EMAIL,DOB,PHONE
from students
where STUD_ID=1;

select STUD_ID as sTUD_ID,NAME,EMAIL,DOB,PHONE
from students;

DELETE FROM mybatis_dev.students
where STUD_ID=3;