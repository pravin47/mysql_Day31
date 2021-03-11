Employee Payroll Service

UC1:
> Create database employee_payroll;
> use employee_payroll;


UC2:
> create table Employee_Payroll_Table (Id Integer auto_increment primary key,Name varchar(30),Salary double,Start_Date DATE);


UC3:
> insert into Employee_Payroll_Table values(1'pravin',30000,'1994-01-05');  
> insert into Employee_Payroll_Table values(2'ravi',30000,'1994-01-05');
> insert into Employee_Payroll_Table values(3,'avinash',40000,'1998-01-05');  
> insert into Employee_Payroll_Table values(4,'raju',37000,'1997-01-05');
> insert into Employee_Payroll_Table values(5,'ajay',38000,'1998-01-05');


UC4:
> select * from Employee_Payroll_Table;


UC5:
> select salary from Employee_Payroll_Table where Name = 'ravi';
> select * from  Employee_Payroll_Table WHERE Start_Date BETWEEN CAST('1996-01-01'AS DATE) AND DATE(NOW());


UC6:
> alter table Employee_Payroll_Table ADD COLUMN Gender Varchar(10) AFTER Name; 


UC7:
> select sum(Salary) from Employee_Payroll_Table where Gender = 'male' GROUP BY Gender;
> select avg(Salary) from Employee_Payroll_Table where Gender = 'male' GROUP BY Gender;
> select min(Salary) from Employee_Payroll_Table where Gender = 'male' GROUP BY Gender;    
> select max(Salary) from Employee_Payroll_Table where Gender = 'male' GROUP BY Gender;
> select count(Salary) from Employee_Payroll_Table where Gender = 'male' GROUP BY Gender;


UC8:
> alter table Employee_Payroll_Table ADD COLUMN Department varchar(30) NOT NULL;
> alter table Employee_Payroll_Table ADD COLUMN Address varchar(100) DEFAULT 'null';
> alter table Employee_Payroll_Table ADD COLUMN Phone_Number Integer (12) ;


UC9:
> alter table employee_payroll_table rename column Salary to Basic_Pay;
> alter table employee_payroll_table add column Deductions integer(50) after Basic_Pay;
> alter table employee_payroll_table add column Taxable_Pay integer(50) after Deductions;
> alter table employee_payroll_table add column Income_Tax integer(50) after Taxable_Pay;
> alter table employee_payroll_table add column Net_Pay integer(50) after Income_Tax;
 

uc10:

> create table Department(Dep_Id integer(10)primary key,Dep_Name varchar(50),Employee_Id integer(10) ,foreign key(Employee_Id)   references employee_payroll_table(Id);
> insert into Department values(1,'sales',11); 
> insert into Department values(2,'marketing',11); 
> insert into Department values(3,'hr',5); 
> selectemployee_payroll_table.Name,employee_payroll_table.Gender,employee_payroll_table.Basic_Pay,department.Dep_Name,department.Dep_Idfrom department inner join employee_payroll_table on department.Employee_Id = employee_payroll_table.Id;



