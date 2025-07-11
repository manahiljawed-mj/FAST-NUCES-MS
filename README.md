# FAST-NUCES-MS
Java Practice Codes For Basic Concepts
1-select * from employees;
select id,name,age from employess;
select id*10 as multiply_id from employees;
select DISTINCT(age) rom employees;
select name from employees order by age asc;
select name from employees order by age desc;
select salary from employees where salary >100 and age<10;
select * from employees where age IN(50,60);
select * from employees where age BETWEEN 50 and 60;
select * from eployees where age is NULL;
select * from employees where name LIKE '%a%';
select count(emp_id) from employees;
select * from employess group by age;
select * from employess group by age having salary>60;




DQL -Data Query Language->SELECT
DDL-Data Definition Language->CREATE, DROP,TRUNCATE,ALTER,RENAME
DML-Data Manipulation Language->INSERT,UPDATE,DELETE
DCL-Data Control Language->GRANT,REVOKE
TCL-TRANSACTION CONTROL LANGUAGE->rollback,commit,checkpoint


create table employees(
  employee_id varchar(20) FOREIGN KEY REFERENCES emp(id),
  age integer,
  department integer
);

constraits 

not null,
unique,
primary key,foreign key,
default,
check 


drop
truncate


alter table employees add column abc varchar(20) not null;
alter table employees modify column abc integer;
alter table employees drop column abc varchar(20);

alter table employees rename to emplo;
alter table employes rename column id to identity;

insert into employees(id,name,age) values(5,6,7);
insert into employees(id name,age) select (id,name,age) from department where id=10;
update employess set id=1 where age=10;

delete from employees where id=10;


JOIN 

cross join/cartesian join
select * from emp,dept
select * from emp cross join dept
inner join/natural join/equi join
select emp.id,m.id from emp e,manager m where e.id=m.id; 
outer join/left outer
select * from emp outer join depart on (e.id =manager.id)
self join
select e.empid,m.salary from employee e, employee m where e.id=m.id
  

Compound queries

union 
union all
intersect 
minus




