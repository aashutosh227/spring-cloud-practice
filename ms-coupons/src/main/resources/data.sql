-- H2 does not use the 'USE' command. 
-- The database name is defined in your connection URL (e.g., jdbc:h2:mem:mydb)
-- CREATE SCHEMA IF NOT EXISTS mydb;
-- SET SCHEMA mydb;

CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    description VARCHAR(100),
    price DECIMAL(8,3) 
);

CREATE TABLE coupon (
    id INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(20),
    discount DECIMAL(8,3),
    exp_date VARCHAR(100) 
);

-- Note: Ensure semi-colons are used if running these as a script
SELECT * FROM product;
SELECT * FROM coupon;

-- Drop statements (usually placed at the top of scripts for cleanup)
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS coupon;
