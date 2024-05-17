create database db_crud;

use db_crud;

create table produtos(
	id serial,
    nome varchar(30),
    descricao varchar(40),
    marca varchar(15),
    modelo varchar(15),
    serialNumber varchar(15),
    quantidade int,
    categoria varchar(15),
    cor varchar(10),
    valor_varejo double precision,
    valor_atacado double precision,
    primary key (id)
);

select * from produtos;