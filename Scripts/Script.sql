show tables;

select * from courses;

select STUD_ID as sTUD_ID,NAME,EMAIL,DOB,PHONE
from students
where STUD_ID=1;

select STUD_ID as sTUD_ID,NAME,EMAIL,DOB,PHONE
from students
;

DELETE FROM mybatis_dev.students
where STUD_ID=3;


select STUD_ID,NAME,EMAIL,PHONE,a.ADDR_ID,a.STREET,a.CITY,a.STATE,a.ZIP,a.COUNTRY
from students s left outer join addresses a on s.ADDR_ID=a.ADDR_ID;


select STUD_ID,NAME,EMAIL,PHONE,a.ADDR_ID,a.STREET,a.CITY,a.STATE,a.ZIP,a.COUNTRY
		from students s left outer join addresses a on s.ADDR_ID=a.ADDR_ID;