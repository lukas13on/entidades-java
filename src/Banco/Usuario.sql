CREATE DATABASE banco;

use banco;

-- create
CREATE TABLE Usuario(
    idUsuario int not null primary key auto_increment,
    acesso varchar(255) not null,
    senha varchar(255) not null,
    criadoPor int,
    alteradoPor int,
    dataCriado datetime,
    dataAlterado datetime,
    -- usuario.pessoa
    nomePessoa varchar(255),
    sobrenomePessoa varchar(255),
    nascimentoPessoa date,
    -- usuario.documento
    tipoDocumento varchar(255),
    numeroDococumento varchar(255),
    -- usuario.contato
    emailContato varchar(255),
    celularContato varchar(255),
    telefoneContato varchar(255),
    -- usuario.endereco
    logradouroEndereco varchar(255),
    numeroEndereco varchar(255),
    cepEndereco varchar(255),
    estadoEndereco varchar(255),
    cidadeEndereco varchar(255)
);

-- insert
INSERT INTO
    usuario
SET
    acesso = 'lukas13on',
    senha = '123';