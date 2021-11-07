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
des_producto varchar(250),
pre_producto double,
cod_tipo_producto  int
);



alter table tb_usuario add constraint FK01 foreign key(cod_tipo_usuario ) references tb_tipo_usuario(cod_tipo_usuario);
alter table tb_producto add constraint FK02 foreign key(cod_tipo_producto) references tb_tipo_producto(cod_tipo_producto);


insert into tb_tipo_usuario values(null,'Usuario');
insert into tb_tipo_usuario values(null,'Personal');
insert into tb_tipo_usuario values(null,'Admin');
 
insert into tb_usuario values(null,'Carmen','Gonzalez','cgonzalez@gmail.com','123456',12345678, 1);
insert into tb_usuario values(null,'Carlos','Torres','ctorres@gmail.com','123456',12345678, 2);
insert into tb_usuario values(null,'Alejandra','Malavi','amalavi@gmail.com','123456',12345678,3);

insert into tb_tipo_producto values(null,'Comida Rapida');
insert into tb_tipo_producto values(null,'Tradicional');
insert into tb_tipo_producto values(null,'Extranjera');
insert into tb_tipo_producto values(null,'Postres');

insert into tb_producto values(null,'Ají de gallina','El plato incluye arroz, aji de gallina, ensalada y causa rellena',30,2);
insert into tb_producto values(null,'Hamburguesa doble carne','Hamburguesa de doble carne molida mezclada con chancho, tocineta, quedo americano, legucha, tomate, cebolla y pepinillos',20,1);
insert into tb_producto values(null,'Pasta Alfredo','Pasta alfredo con crema blanca, oregano, trozos de amon y mini ensalada cesar a parte',25,3);
insert into tb_producto values(null,'Torta 3 leches','Biscocho bañado en crema tres leches, con crema chantillí encima, ralladura de lima y caocao',15,3);
 
select * from tb_tipo_usuario;
select * from tb_usuario;
select * from tb_producto;
