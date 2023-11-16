create database clients;
use clients;

create table clients(
	id int primary key auto_increment,
    name varchar(50),
    last_name varchar(50),
    doc_number varchar(50)
)