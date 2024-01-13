-- ******DATABASE**********
-- 1. To create the database
create database codefios;
-- 2. To use database
use codefios;
-- 3.  To show list of table avabile in database
show tables;
-- 4. To create table in database
create table user_info (
id int NOT NULL AUTO_INCREMENT primary key ,
user_name varchar(50),
user_passwor varchar(50),
user_email varchar(50),
user_createTime datetime
);

--  5. To view the table  data
select * from user_info;


-- 6. To insert data in table
insert into user_info (user_name, user_passwor, user_email, user_createTime) values ('demo@codefios.com','abc123','demo@codefios.com',current_timestamp());


-- To updaata data from taable
update user_info set user_name = 'demo1@codefios.com', user_passwor = 'abc234' where id =2;
-- To delet data from table 
delete from user_info where id >2;


create table list_accounts_data (
id int NOT NULL AUTO_INCREMENT primary key ,
account_name varchar(50),
account_description varchar(500),
account_balance bigint,
account_number bigint,
account_contact varchar(12),
user_createTime datetime
);

select*from list_accounts_data;
insert into list_accounts_data (account_name, account_description, account_balance, account_number,account_contact,user_createTime) values ('firstName lastName','I am createing this account for test',3000,000022339999,'123 000 0036',current_timestamp());