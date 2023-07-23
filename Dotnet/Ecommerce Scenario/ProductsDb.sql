create database dotnetworld;

use dotnetworld;

create table products(
	id int primary key, 
    name varchar(255), 
	description varchar(255),
	category varchar(255),
	price double(9,2),
	quantity int
);


INSERT INTO products (id, name, description, category, price, quantity)
VALUES (1, 'Product1', 'Description1', 'HOME', 19.99, 100);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (2, 'Product2', 'Description2', 'FOOTWEAR', 29.99, 50);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (3, 'Product3', 'Description3', 'CLOTHES', 39.99, 70);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (4, 'Product4', 'Description4', 'BOOKS', 9.99, 30);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (5, 'Product5', 'Description5', 'CUTLERY', 14.99, 25);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (6, 'Product6', 'Description6', 'KITCHENWARE', 49.99, 40);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (7, 'Product7', 'Description7', 'COSMETICS', 24.99, 60);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (8, 'Product8', 'Description8', 'ELECTRONICS', 399.99, 10);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (9, 'Product9', 'Description9', 'GENERAL', 7.99, 90);

INSERT INTO products (id, name, description, category, price, quantity)
VALUES (10, 'Product10', 'Description10', 'MISCELLANEOUS', 16.99, 15);
