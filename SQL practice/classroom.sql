-- create a database with a name 
create database xyz_company; 

-- this use tells to use database xyz
use xyz_company;

-- thois commands create a table in the table 
create table employe_information(
	id int primary key,
    name varchar(50),
    salary int 
);

--  to insert the value in the table  single value insert 
insert into employe_information
(id , name , salary )
values 
(1,"Adam",25000);

-- multi value insert 
insert into employe_information
(id , name , salary )
values
(2,"Bob",30000),
(3,"Harry",40000);

-- to show the table 
select * from employe_information;

insert into employe_information
(id,name,salary)
values
(4,"Devender",1000000);










 
