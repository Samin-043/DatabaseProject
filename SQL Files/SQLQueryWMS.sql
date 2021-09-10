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


create table customer
(
	customer_id int identity(3000,1) primary key,     
	name varchar(15) not null,
	customer_address varchar(50) not null,
	phone_no varchar(11) not null,	
	email varchar(50) not null
)

select customer_id from customer where name='Ameer'


select * from customer



create table paymentIN
(
	bill_number_pay_in int identity(12388,1) primary key,
	payment_total int not null,
	payment_paid int not null,
	payment_remain int not null,
	payment_time varchar(30) not null,
	supplier_id int foreign key references supplier(supplier_id), 
	product_id int foreign key references product(product_id)
)


Select sum(payment_total) from paymentIN 

insert into paymentIN(payment_total,payment_paid,payment_remain,payment_time,supplier_id)values(150,30,10,100,(select supplier_id from supplier where name='Karim'));




select bill_number_pay_in,payment_time from paymentIN

select bill_number_pay_in,payment_total,payment_paid,payment_remain,payment_time from paymentIN 
/*insert into paymentIN(payment_amount,payment_time)
values(150,'9999-12-31 23:59:59')*/

select paymentIN.bill_number_pay_in,paymentIN.payment_total,paymentIN.payment_paid,paymentIN.payment_remain,paymentIN.payment_time,supplier.name from supplier inner join paymentIN on paymentIN.supplier_id=supplier.supplier_id

create table PaymentOUT
(
	bill_number_pay_out int identity(23000,1) primary key,
	payment_total int not null,
	payment_paid int not null,
	payment_remain int not null,	
	payment_time varchar(30) not null,
    customer_id int foreign key references customer(customer_id),
	product_id int foreign key references product(product_id)
)

drop table PaymentOUT


select bill_number_pay_out,payment_paid,payment_remain,payment_time from paymentOUT 

create table staff
(
	staff_id int identity(8000,1) primary key,
	name varchar(15) not null,
	staff_address varchar(50) not null,
	phone_no varchar(11) not null,
	email varchar(50) not null,
	staff_title varchar(50) not null,
	customer_id int not null foreign key references customer(customer_id),
	s_password varchar(50) not null
)

select name,s_password from staff where staff_title='Warehouse Manager'

select name,s_password from staff where staff_title='Sales Manager'




select * from staff



create table order_details
(
	order_item_name varchar(20) not null,
	order_item_quantity varchar(20) not null,
	order_item_amount int not null,
	order_details_id int identity(10,1) primary key, 
	bill_number_pay_in int foreign key references paymentIN(bill_number_pay_in),
	bill_number_pay_out int foreign key references paymentOUT(bill_number_pay_out),
	order_date date, 
)

select * from order_details



