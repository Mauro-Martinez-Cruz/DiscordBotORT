create database javabot_sql;

use javabot_sql;

create table Usuario(
    id varchar(50) not null primary key,
    tag varchar(100) ,
    nick varchar(100),
    mencion varchar(100),
    rol varchar(100),
    imagenUrl varchar(200),
    nivel int,
    tareasEntregadas int,
    promedio double
);

create table Notas(
    id int not null primary key auto_increment,
    taskName varchar(100) ,
    note varchar(100),
    idUsuario int,
    FOREIGN KEY (id) REFERENCES Usuario(id)
);