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
		
select STUD_ID,NAME,EMAIL,PHONE,a.ADDR_ID,a.STREET,a.CITY,a.STATE,a.ZIP,a.COUNTRY
from students s join addresses a on s.ADDR_ID=a.ADDR_ID;

select t.TUTOR_ID,t.NAME,EMAIL,c.COURSE_ID,c.NAME,description,start_date,end_date,a.ADDR_ID,STREET,CITY,STATE,ZIP,COUNTRY
		from tutors t left outer join addresses a on t.ADDR_ID=a.ADDR_ID
			left outer join courses c on t.TUTOR_ID=c.TUTOR_ID;
