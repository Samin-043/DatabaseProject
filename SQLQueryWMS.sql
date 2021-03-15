use WarehouseManagementSystem

create table supplier
(
	supplier_id int primary key,  
	name varchar(15) not null,
	address_sup varchar(50) not null,
	phone_num varchar(11) not null,
	email varchar(15) not null 
)

select * from supplier

insert into supplier(supplier_id,name,address_sup,phone_num,email) 
values(1000,'Karim','Savar,Dhaka','01725557771','karim@gmail.com'),
	(1001,'Rahim','Tilagor,Sylhet','01555555522','rahim@gmail.com'),
	(1002,'Akbar','Townhall,Comilla','01776668883','akbar@gmail.com')
	
insert into supplier(supplier_id,name,address_sup,phone_num,email) 
values (1003,'Asif','Kuakata,Patuakhali','01991117874','asif@yahoo.com')

insert into supplier(supplier_id,name,address_sup,phone_num,email) 
values (1004,'Akib','Aftabnagar,Dhaka','01993335646','akib@mail.com')



create table product
(
	product_id int primary key,
	product_name varchar(50) not null,
	product_quantity numeric(5,1) not null,
	product_unit varchar(20) not null,
	product_price numeric(10,2) not null,
	product_description varchar(50),
	category varchar(50) not null,
	supplier_id int not null foreign key references supplier(supplier_id) 
)

/*drop table product*/
select * from product

insert into product(product_id,product_name,product_quantity,product_unit,product_price,product_description,category,supplier_id)
values (1,'Miniket Rice',5,'kg',60,'Better quality from past','Rice',1000),
		(2,'Orange',4,'kg',170,'important for vitamin C','Fruits',1001),
		(3,'Aarong Full Cream Liquid UHT Milk',500,'ml',45,'Good for health','Milk & Dairy Products',1002)


create table inventory
(
	inventory_id int primary key,
	product_id int not null foreign key references product(product_id)
)

select * from inventory

insert into inventory(inventory_id,product_id)
values(5000,1),
	(5001,2),
	(5002,3)



create table customer
(
	customer_id int identity(3000,1) primary key,     
	name varchar(15) not null,
	customer_address varchar(50) not null,
	phone_no varchar(11) not null,
	email varchar(50) not null
)


select * from customer

insert into customer(name,customer_address,phone_no,email)
values('Ameer','Paribagh','01721469854','ameer@gmail.com'),
	  ('Tanvir','Shobujbagh','01821469854','tanvir@gmail.com'),
	  ('Joynul','Rajarbagh','01931460814','joynul@gmail.com')



create table payment
(
	bill_number int primary key,
    customer_id int not null foreign key references customer(customer_id),
	payment_type varchar(50) not null,
	payment_date date null,
)


select * from payment

insert into payment(bill_number,customer_id,payment_type,payment_date) 
values(12388,3000,'cash','02-15-2021'),
	(12389,3001,'cash','02-21-2021'),
	(12390,3002,'Credit Card','03-01-2021')


create table staff
(
	staff_id int primary key,
	name varchar(15) not null,
	staff_address varchar(50) not null,
	phone_no varchar(11) not null,
	email varchar(50) not null,
	staff_title varchar(15) not null,
	customer_id int not null foreign key references customer(customer_id)
)

select * from staff

insert into staff(staff_id,name,staff_address,phone_no,email,staff_title,customer_id)
values(8000,'Jalal','Gulshan','01745628938','jalal@gmail.com','Manager',3000),
	  (8001,'Mojnu','Banani','01735628459','mojnu@gmail.com','Employee',3001),
	  (8002,'Kabir','Badda','01835528957','kabir@gmail.com','Employee',3002)




create table order_details
(
	order_details_id int primary key, 
	product_id int not null foreign key references product(product_id),
	customer_id int not null foreign key references customer(customer_id),
	staff_id int not null foreign key references staff (staff_id),
	bill_number int not null foreign key references payment(bill_number),
	order_date date null, 
	discount varchar(20) not null
)


select * from order_details

insert into order_details(order_details_id,product_id,customer_id,staff_id,bill_number,order_date,discount) 
values(10,1,3000,8000,12388,'02-15-2021','30%'),
	(11,2,3001,8001,12389,'02-21-2021','22%'),
	(12,3,3002,8002,12390,'03-01-2021','25%')




