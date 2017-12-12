    create table direccion(id integer primary key, cp integer, calle varchar(50), municipio varchar(50));
create table cliente(id integer primary key , nombre varchar(50), edad integer, id_direccion integer,
foreign key(id_direccion) references direccion(id));

select * from direccion;
select * from cliente;

