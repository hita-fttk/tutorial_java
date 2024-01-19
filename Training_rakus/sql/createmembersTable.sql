CREATE TABLE members(
    id serial PRIMARY KEY,
	name varchar(20) NOT NULL,
	email varchar(20) NOT NULL UNIQUE,
	gender integer NOT NULL,
	birth_date date NOT NULL,
	aged integer NOT NULL,
	period_id integer NOT NULL,
	deleted boolean
);

