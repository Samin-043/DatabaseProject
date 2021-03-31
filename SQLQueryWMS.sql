use WarehouseManagementSystem

create table supplier
(
	supplier_id	int identity(1000,1) primary key,  
	name varchar(15) not null,
	address_sup varchar(50) not null,
	phone_num varchar(11) not null,
	email varchar(30) not null 
)

select * from supplier
/*insert into supplier(supplier_id)values(1000),(1001),(1002),(1003),(1004),(1005)*/

/*drop table supplier*/

/*insert into supplier(supplier_id)values(1000),(1001),(1002)*/

create table product
(
	product_id int identity(1,1) primary key,
	product_name varchar(50) not null,
	product_quantity int not null,
	product_unit varchar(20) not null,
	product_price int not null,
	product_description varchar(50),
	category varchar(50) null,
	supplier_id int foreign key references supplier(supplier_id) 
)



SELECT product_id,product_name,product_quantity,product_unit,product_price,product_description,category from product order by product_quantity

update product set product_quantity=5 where product_name='Malta'

Select sum(product_quantity) from product where product_name='Mango'

/*SELECT product_id,product_name,product_quantity,product_unit,product_price,product_description,category,COUNT(*) 
 FROM product 
 group by product_id,product_name,product_quantity,product_unit,product_price,product_description,category
 HAVING 
 COUNT(*) > 1
*/


SELECT product_id,product_name,product_quantity,product_unit,product_price,product_description,category from product
 
/*SELECT product.product_id,product.product_name,product.product_quantity,product.product_unit,product.product_price,product.category,supplier.supplier_id
FROM product
INNER JOIN supplier ON product.supplier_id=supplier.supplier_id;*/


/*insert into product(product_name,product_quantity,product_unit,product_price,product_description,category)
values ('Miniket Rice',5,'kg',60,'Better quality from past','Rice'),
		('Orange',4,'kg',170,'important for vitamin C','Fruits'),
		('Aarong Full Cream Liquid UHT Milk',500,'ml',45,'Good for health','Milk & Dairy Products')
*/

create table inventory
(
	inventory_id int identity(5000,1) primary key,
	product_id int not null foreign key references product(product_id)
)


Select * from inventory

SELECT inventory.inventory_id,product.product_name,product.product_quantity,product.product_unit,product.product_price from product
inner join inventory on product.product_id=inventory.product_id


insert into inventory(product_id)
values(1),
	(2),
	(3)

insert into inventory(product_id)
values(8)



drop table inventory

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
	bill_number int identity(12388,1) primary key,
	payment_amount int not null,
	payment_date date not null,
    customer_id int foreign key references customer(customer_id),
	supplier_id int foreign key references supplier(supplier_id),
	product_id int foreign key references product(product_id), 
)


/*insert into payment(payment_amount,payment_date)
values('?','?')
*/
select payment.bill_number,supplier.name,payment.payment_amount from supplier inner join payment on payment.supplier_id=supplier.supplier_id
/* 
*/


insert into payment(customer_id,payment_type,payment_date) 
values(3000,'cash','02-15-2021'),
	(3001,'cash','02-21-2021'),
	(3002,'Credit Card','03-01-2021')


drop table payment



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


select * from staff

insert into staff(name,staff_address,phone_no,email,staff_title,customer_id)
values('Jalal','Gulshan','01745628938','jalal@gmail.com','Manager',3000),
	  ('Mojnu','Banani','01735628459','mojnu@gmail.com','Employee',3001),
	  ('Kabir','Badda','01835528957','kabir@gmail.com','Employee',3002)

drop table staff



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

select * from order_details

insert into order_details(product_id,customer_id,staff_id,bill_number,order_date,discount) 
values(2,3000,8000,12388,'02-15-2021','30%'),
	(3,3001,8001,12389,'02-21-2021','22%'),
	(4,3002,8002,12390,'03-01-2021','25%')


drop table order_details



