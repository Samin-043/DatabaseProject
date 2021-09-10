use WarehouseManagementSystem

create table log_in
(
	username varchar(30),
	pass_word varchar(30)
)

select username from log_in
select pass_word from log_in

insert into log_in(username,pass_word)

values('Admin','admin_456')
delete  from log_in where pass_word='sakib_123'
update log_in set pass_word='?' where username='Admin'

create table log_in_sales
(
	username varchar(30),
	pass_word varchar(30)
)

INSERT into log_in_sales(username,pass_word)values('Sakib','sakib_123')

select * from log_in_sales

create table log_in_wh
(
	username varchar(30),
	pass_word varchar(30)
)

INSERT into log_in_wh(username,pass_word)values('Tahan','tahan_12')

select * from log_in_sales


INSERT into log_in(username,pass_word)
values('Admin','admin_123')
select * from log_in



create table register
(
	username varchar(30),
	gender varchar(30),
	contact varchar(30),
	email varchar(30),
	pass_word varchar(30),
    add_ress  varchar(30)	
)

drop table register

select * from register
