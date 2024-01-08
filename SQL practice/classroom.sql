create database xyz_company;

use xyz_company;

create table employe_information(
	id int primary key,
    name varchar(50),
    salary int 
);

insert into employe_information
(id , name , salary )
values 
(1,"Adam",25000);

insert into employe_information
(id , name , salary )
values
(2,"Bob",30000),
(3,"Harry",40000);

select * from employe_information;

insert into employe_information
(id,name,salary)
values
(4,"Devender",1000000);










 
