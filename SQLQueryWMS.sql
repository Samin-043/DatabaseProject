use WarehouseManagementSystem

create table supplier
(
	supplier_id	int identity(1000,1) primary key,  
	name varchar(15) not null,
	address_sup varchar(50) not null,
	phone_num varchar(11) not null,
	email varchar(30) not null 
)

drop table supplier

select * from supplier


create table product
(
	product_id int identity(1,1) primary key,
	product_name varchar(50) not null,
	product_quantity numeric(5,1) not null,
	product_unit varchar(20) not null,
	product_price numeric(10,2) not null,
	product_description varchar(50),
	category varchar(50) not null,
	supplier_id int not null foreign key references supplier(supplier_id) 
)

drop table product
select * from product

insert into product(product_name,product_quantity,product_unit,product_price,product_description,category,supplier_id)
values ('Miniket Rice',5,'kg',60,'Better quality from past','Rice',1000),
		('Orange',4,'kg',170,'important for vitamin C','Fruits',1001),
		('Aarong Full Cream Liquid UHT Milk',500,'ml',45,'Good for health','Milk & Dairy Products',1002)


create table inventory
(
	inventory_id int identity(5000,1) primary key,
	product_id int not null foreign key references product(product_id)
)

drop table inventory

select * from inventory

insert into inventory(product_id)
values(2),
	(3),
	(4)



create table customer
(
	customer_id int identity(3000,1) primary key,     
	name varchar(15) not null,
	customer_address varchar(50) not null,
	phone_no varchar(11) not null,
	email varchar(50) not null
)

drop table customer
select * from customer

insert into customer(name,customer_address,phone_no,email)
values('Ameer','Paribagh','01721469854','ameer@gmail.com'),
	  ('Tanvir','Shobujbagh','01821469854','tanvir@gmail.com'),
	  ('Joynul','Rajarbagh','01931460814','joynul@gmail.com')



create table payment
(
	bill_number int identity(12388,1) primary key,
    customer_id int not null foreign key references customer(customer_id),
	payment_type varchar(50) not null,
	payment_date date null
)

drop table payment
select * from payment

insert into payment(customer_id,payment_type,payment_date) 
values(3000,'cash','02-15-2021'),
	(3001,'cash','02-21-2021'),
	(3002,'Credit Card','03-01-2021')


create table staff
(
	staff_id int identity(8000,1) primary key,
	name varchar(15) not null,
	staff_address varchar(50) not null,
	phone_no varchar(11) not null,
	email varchar(50) not null,
	staff_title varchar(15) not null,
	customer_id int not null foreign key references customer(customer_id)
)

drop table staff
select * from staff

insert into staff(name,staff_address,phone_no,email,staff_title,customer_id)
values('Jalal','Gulshan','01745628938','jalal@gmail.com','Manager',3000),
	  ('Mojnu','Banani','01735628459','mojnu@gmail.com','Employee',3001),
	  ('Kabir','Badda','01835528957','kabir@gmail.com','Employee',3002)




create table order_details
(
	order_details_id int identity(10,1) primary key, 
	product_id int not null foreign key references product(product_id),
	customer_id int not null foreign key references customer(customer_id),
	staff_id int not null foreign key references staff (staff_id),
	bill_number int not null foreign key references payment(bill_number),
	order_date date null, 
	discount varchar(20) not null
)

drop table order_details

select * from order_details

insert into order_details(product_id,customer_id,staff_id,bill_number,order_date,discount) 
values(2,3000,8000,12388,'02-15-2021','30%'),
	(3,3001,8001,12389,'02-21-2021','22%'),
	(4,3002,8002,12390,'03-01-2021','25%')
