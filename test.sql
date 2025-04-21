create table student (
 id  int Primary Key, 
 name varchar(40)  not null,
 email varchar(40) unique,
 age int,
 marks decimal
)
insert into  student values (1,'rahul','rahul@gmail.com',25,77);
insert into   student values (2,'deepika','deepika@gmail.com',21,87);
insert into   student values (3,'keerthana','keerthana@gmail.com',17,99);


-- : Fetch student details where age > 21.

 select * from student where age>21;


 -- Update the email of the student with id = 5 to
'rahul@gmail.com'.

update student set id=5 where email='rahul@gmail.com';

select * from student;

--  Find the second highest score student details.
select marks from student limit 1 offset 0;

-- Delete all students with age < 18.
delete from student where age<18;

create table students (
 id  int Primary Key, 
 name varchar(40)  not null,
 
 age int
 
)
insert into  students values (1,'rahul',25);
insert into   students values (2,'priya',17);
insert into   students values (3,'akas',19);

create table course(
 course_id int Primary Key, 
 student_id  int ,
 course_name varchar(40),
 foreign key (student_id) references students(id)
)
insert into  course values (101,1,'java');
insert into  course values (102,2,'python');
insert into  course  values (103,1,'sql');


-- : Write a query to display student names and their enrolled course names

select s.name,c.course_name from course c inner join students s on s.id=c.student_id;
