create table student(
	id serial primary key ,
	first_name VARCHAR NOT NULL,
	last_name VARCHAR NOT NULL,
	add1 VARCHAR NOT NULL,
	add2 varchar,
	city varchar not null,
	states varchar not null,
	zip varchar not null,
	home_phone numeric not all,
	gender varchar not null,
	entry_date date not null,
	entry_type varchar not null,
	from_school varchar not null,
	additional_details varchar
	
);