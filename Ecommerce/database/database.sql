CREATE DATABASE ecommerce;
USE ecommerce;

SHOW TABLES;

DESC user;
SELECT * FROM user;

DESC product;
SELECT * FROM product;

DELETE FROM product WHERE product_id="8989";

DESC category;
SELECT * FROM category;


DESC address;
DESC address_seq;

SELECT * FROM address;

DESC order_details;
DESC order_details_products;

SELECT * FROM order_details;
SELECT * FROM order_details_products; -- third table for many to many relation

