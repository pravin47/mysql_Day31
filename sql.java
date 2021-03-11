Address Book Service  

UC1:
> create database AddressBook;
> use AddressBook;


UC2:
> create table Address_Book_Table (First_Name varchar(10),Last_Name varchar(10),Address varchar(100),City varchar(15),State varchar   (20),Zip int(10),Phone_Number int(15),Email varchar(20));


UC3:
> select * from Address_Book_Table;
> insert into Address_Book_Table value('pravin','bagul','ram nagar sakri','sakri','maharashtra','424304','9767','bagul2@gmail.com');
> insert into Address_Book_Table value('rahul','deshmukh','nagai colony dhule','dhule','gujrat',586954,857455,'rahul3@gmail.com');
> insert into Address_Book_Table value('anil','patil','rupai nagar mumbai','mumbai','odisha',69857,85652,'patil4@gmail.com');

UC4:
> update Address_Book_Table set City ='aurangabad' where first_Name = 'pravin';

UC5:
> delete from Address_Book_Table where First_Name ='anil';

UC6:
> select * from Address_Book_Table where City = 'dhule' or State = 'karnatak'; 

UC7:
> select COUNT(*) from Address_Book_Table where City ='nashik' and State = 'karnatak';

UC8: 
> select * from Address_Book_Table  WHERE City = 'dhule' ORDER BY First_Name ASC; 


UC9:
> alter table Address_Book_Table ADD COLUMN Type varchar(15) AFTER Email;
> update Address_book_table set type ='family'where First_Name = 'pravin';
> update Address_book_table set type ='family'where First_Name = 'rahul';
> update Address_book_table set type ='friend'where First_Name = 'anil';
> update Address_book_table set type ='family'where First_Name = 'sunil';
> update Address_book_table set type ='friend'where First_Name = 'sumit';



UC10:
> select count(*) from Address_Book_Table where Type ='family';


UC11:
> update Address_book_table set Type = 'Family/friend' where First_Name ='pravin'; 











