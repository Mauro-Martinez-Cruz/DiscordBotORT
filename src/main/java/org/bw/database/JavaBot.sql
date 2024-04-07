create database javabot_sql;

create table Usuario(
    id int not null primary key,
    tag varchar(100) ,
    nick varchar(100),
    mencion varchar(100),
    rol varchar(100),
    imagenUrl varchar,
    nivel int,
    tareasEntregadas int,
    promedio int
);

create table Notas(
    id int not null primary key autoincrement,
    taskName varchar(100) ,
    note varchar(100),
    idUsuario int,
    FOREIGN KEY (id) REFERENCES Usuario(id)
);