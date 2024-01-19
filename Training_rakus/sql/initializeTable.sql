DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS departments;

CREATE TABLE employees (
  id integer PRIMARY KEY ,
  name text NOT NULL ,
  age integer ,
  gender text ,
  department_id integer
);

CREATE TABLE departments (
  id integer PRIMARY KEY ,
  name text 
);

INSERT INTO employees VALUES (1, '山田太郎', 38, '男性', 3);
INSERT INTO employees VALUES (2, '山田花子', 52, '女性', 1);
INSERT INTO employees VALUES (3, '鈴木一朗', 23, '男性', 2);
INSERT INTO employees VALUES (4, '鈴木一子', 44, '女性', 1);
INSERT INTO employees VALUES (5, '佐藤次郎', 18, '男性', 5);

INSERT INTO departments VALUES (1, '管理部');
INSERT INTO departments VALUES (2, '人事部');
INSERT INTO departments VALUES (3, '開発部');
INSERT INTO departments VALUES (4, '営業部');