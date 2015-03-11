CREATE TABLE article (
  article_id bigserial primary key,
  article_name varchar(20) NOT NULL,
  article_desc text NOT NULL,
  date_added timestamp default NULL
);


CREATE TABLE dishes (
  id SERIAL PRIMARY KEY,
  name CHAR(50) NOT NULL,
  price REAL

);

CREATE TABLE product (
  id SERIAL PRIMARY KEY,
  name CHAR(30),
  price FLOAT
);

CREATE TABLE dishes_product (
  id_product INTEGER NOT NULL,
  id_dishes INTEGER NOT NULL
);

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  login CHAR(30),
  password CHAR(30),
  full_name CHAR(60),
  status CHAR(10)
);

CREATE TABLE address (
  id SERIAL PRIMARY KEY,
  address CHAR(60),
  status CHAR(15)
);

CREATE TABLE recipe (
  id SERIAL PRIMARY KEY,
  id_dish INTEGER NOT NULL,
  description TEXT
);

CREATE TABLE product_recipe (
  id_recipe INTEGER NOT NULL,
  id_product INTEGER NOT NULL
);

CREATE TABLE menu (
  id SERIAL PRIMARY KEY,
  name CHAR(30)
);

CREATE TABLE menu_dishes (
  id_menu INTEGER NOT NULL,
  id_dishes INTEGER NOT NULL
);