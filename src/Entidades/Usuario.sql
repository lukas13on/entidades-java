CREATE DATABASE banco;

use banco;

-- create
CREATE TABLE usuario(
    idUsuario int not null primary key auto_increment,
    acesso varchar(255) not null,
    senha varchar(255) not null,
    criadoPor int,
    alteradoPor int,
    dataCriado datetime,
    dataAlterado datetime,
    -- usuario.pessoa
    nome varchar(255),
    sobrenome varchar(255),
    nascimento date,
    -- usuario.documento
    documento varchar(255),
    numeroDoc varchar(255),
    -- usuario.contato
    email varchar(255),
    celular varchar(255),
    telefone varchar(255),
    -- usuario.endereco
    logradouro varchar(255),
    numeroLog varchar(255),
    cepLog varchar(255),
    estadoLog varchar(255),
    cidadeLog varchar(255)
);

-- insert
INSERT INTO
    usuario
SET
    acesso = 'lukas13on',
    senha = '123';