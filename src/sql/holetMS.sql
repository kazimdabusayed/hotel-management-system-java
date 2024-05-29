use hotelMS;
show databases;

create table login(username varchar(25), password varchar(25));
select * from login;
insert into login values('kaziarafat', (12345689));

create table room(roomnumber varchar(20), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));
select * from room;

create table employee(name varchar(20), age varchar(5), gender varchar(10), job varchar(20), salary varchar(10), phone varchar(20), email varchar(20), nid varchar(20));
select * from employee;

create table driver(name varchar(20), age varchar(20), gender varchar(20), company varchar(20), carname varchar(20), available varchar(20), location varchar(20));
select * from driver;

create table login2(user_name varchar(20), password varchar(20));
select * from login2;
insert into login2 values('sayed', '12345689*');

create table department(department varchar(80), budget varchar(50));
-- ALTER TABLE department RENAME COLUMN buget TO budget;
select * from department;
insert into department values('Office', '50000');
insert into department values('Housekeeping', '40000');
insert into department values('Food', '70000');
insert into department values('Kitchen', '30000');
insert into department values('Security', '60000');

create table customer(document varchar(30), number varchar(30), name varchar(30), gender varchar(30), country varchar(30), room varchar(30), checkintime varchar(80), deposit varchar(30));
select * from customer;
-- ALTER TABLE customer RENAME COLUMN deposite TO deposit;