DROP TABLE IF EXISTS employees;	
CREATE TABLE employees (	
       id  integer primary key,	
       name text not null,	
       age integer,	
       gender text,	
       department_name varchar(10)	
);	
	
INSERT INTO employees VALUES(1,'伊賀',41,'男','開発部');	
INSERT INTO employees VALUES(2,'佐藤',29,'女','管理部');	
INSERT INTO employees VALUES(3,'吉田',38,'男','開発部');	
INSERT INTO employees VALUES(4,'寺田',null,'女','経理部');	
INSERT INTO employees VALUES(5,'内田',55,'男','経理部');	
INSERT INTO employees VALUES(6,'伊藤',48,'男','管理部');