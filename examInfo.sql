CREATE DATABASE productManagement;

USE productManagement;

CREATE TABLE products(
id INT AUTO_INCREMENT PRIMARY KEY,
productName VARCHAR(220),
price BIGINT,
quantity INT,
color VARCHAR(220),
category VARCHAR(50),
des VARCHAR(220)
);
-- DROP TABLE products;
