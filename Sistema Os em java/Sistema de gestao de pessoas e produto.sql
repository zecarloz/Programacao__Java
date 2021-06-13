create database dbinfox;
create table tbusuarios(
	iduser int primary key,
    usuario varchar (50) not null,
    fone varchar(15),
    login varchar(15) not null unique,
    senha varchar(15) not null
);
describe tbusuarios;
-- create -> insert

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(1,'Jose de assis','9999-9999','joseassis','123456');
-- exibindo dados da tabela:
select*from tbusuarios;

insert into tbusuarios(iduser,usuario,fone,login,senha)
values(2,'Administrador','9999-9999','admin','admin');
insert into tbusuarios(iduser,usuario,fone,login,senha)
values(3,'Bil gates','9999-9999','bil','123456');

-- A linha abaixo faz o update na tabela
-- update
update tbusuarios set fone='8888-8888' where iduser=2;

-- aA linha abaixo deleta um registro na tabela
-- delete
delete from tbusuarios where iduser=3


