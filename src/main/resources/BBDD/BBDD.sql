create database PROYECTO_RESTAURANT_2021;
use PROYECTO_RESTAURANT_2021;

create table tb_tipo_usuario
(
cod_tipo_usuario int primary key auto_increment,
nom_nombre varchar(25)
);
create table tb_usuario
(
cod_usuario int primary key auto_increment,
nom_usuario varchar(25),
ape_usuario varchar(25),
cor_usuario varchar(25),
con_usuario varchar(25),
dni_usuario int,
cod_tipo_usuario  int
);
create table tb_tipo_producto
(
cod_tipo_producto int primary key auto_increment,
nom_nombre varchar(25)
);
create table tb_producto
(
cod_producto int primary key auto_increment,
nom_producto varchar(25),
des_producto varchar(50),
pre_producto double,
cod_tipo_producto  int
);

alter table tb_usuario add constraint FK01 foreign key(cod_tipo_usuario ) references tb_tipo_usuario(cod_tipo_usuario);
alter table tb_producto add constraint FK02 foreign key(cod_tipo_producto) references tb_tipo_producto(cod_tipo_producto);


insert into tb_tipo_usuario values(null,'Usuario');
insert into tb_tipo_usuario values(null,'Personal');
insert into tb_tipo_usuario values(null,'Admin');
 
insert into tb_usuario values(null,'carmen','noseee','jhosep@gmail.com','123456',12345678, 1);
insert into tb_usuario values(null,'carlos','nnnnnnn','jho@gmail.com','123456',12345678, 1);
insert into tb_usuario values(null,'antonio','nnnnn','ju@gmail.com','123456',12345678,1);

insert into tb_tipo_producto values(null,'Locales');
insert into tb_tipo_producto values(null,'Extranjeros');
insert into tb_tipo_producto values(null,'Postres');

insert into tb_producto values(null,'comida1','comida1',30,1);
insert into tb_producto values(null,'comida2','comida2',20,2);
insert into tb_producto values(null,'comida3','comida3',10,3);
 
select*from tb_tipo_usuario;
select*from tb_usuario;
select*from tb_producto;
