use hotelMS;
show databases;

create table login(username varchar(25), password varchar(25));
select * from login;
insert into login values('kaziarafat', (12345689));

create table room(roomnumber varchar(20), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));
select * from room;

create table employee(name varchar(20), age varchar(20), gender varchar(20), job varchar(20), salary varchar(20), phone varchar(20), email varchar(20), nid varchar(20));
select * from employee;

create table driver(name varchar(20), age varchar(20), gender varchar(20), company varchar(20), carname varchar(20), available varchar(20), location varchar(20));
select * from driver;

create table login2(user_name varchar(20), password varchar(20));
select * from login2;
insert into login2 values('sayed', '12345689*');