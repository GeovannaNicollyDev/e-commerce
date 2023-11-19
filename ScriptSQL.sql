create database db_eletronics;

use db_eletronics;

create table tb_usuarios (
	nome varchar(100),
    cpf varchar(11) primary key,
    senha varchar(100)
);

create table tb_produtos (
	nome varchar(100) primary key,
    descricao varchar(500),
    valor double,
    imagem VARCHAR(500)
);

create table tb_carrinho (
	nome varchar(100),
	foreign key (nome) references tb_produtos (nome),
    quantidade int,
    valor double
);

create table tb_administradores (
	nome varchar(100),
    usuario varchar(100) primary key,
    senha varchar(100)
);

select * from tb_usuarios;
select * from tb_administradores;
select * from tb_produtos; 
select * from tb_carrinho;

delete from tb_usuarios where cpf = "";
delete from tb_administradores where usuario = "";
delete from tb_produtos where nome = "";
delete from tb_carrinho where nome = "";