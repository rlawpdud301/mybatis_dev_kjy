insert into students(stud_id,name,email,phone,DOB,gender)
values(#{studId},#{name},#{email},#{phone},#{dob},#{gender})

alter table students add gender tinyint unsigned;

select STUD_ID as stidid,NAME,EMAIL,DOB,PHONE,gender from students;

create table Userpic(
	id integer auto_increment primary key,
	name varcharacter(50),
	pic longblob,
	bio longtext
);

insert into userpic(id,name,pic,bio) values (#{id},#{name},#{pic},#{bio} );

select id,name,pic,bio from userpic where id=#{id};