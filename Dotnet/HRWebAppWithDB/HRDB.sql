create database HRWebRecords; 

use HRWebRecords;

create table employees(
id int primary key, 
ename varchar(20),
email varchar(40),
phoneNumber varchar(15),
address varchar(50),
department varchar(20),
password varchar(20),
salary double(9,2)
);

# drop table employees;
INSERT INTO employees (id, ename, email, phoneNumber, address, department, password, salary)
VALUES 
    (1, 'John Doe', 'john.doe@example.com', '9876543210', '123 Main St, City, Country', 'HR', '1',1000),
    (2, 'Jane Smith', 'jane.smith@example.com', '1111111111', '456 Maple Ave, Town, Country', 'Marketing', 'password456',100),
    (3, 'Michael Johnson', 'michael.johnson@example.com', '2222222222', '789 Oak Rd, Village, Country', 'Finance', 'abc123xyz',100),
    (4, 'Emily Williams', 'emily.williams@example.com', '7777777777', '101 Pine St, Suburb, Country', 'IT', 'pass123word',100),
    (5, 'Robert Brown', 'robert.brown@example.com', '9999999999', '222 Elm St, Countryside, Country', 'Operations', 'securepass',100);

