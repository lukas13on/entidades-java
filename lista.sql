CREATE DATABASE Lista02;

USE Lista02;

CREATE TABLE Alunos(
    codigo int,
    nome varchar(50),
    telefone varchar(50),
    cidade varchar(50)
);

DESC Alunos;

CREATE TABLE Alunos2(
    codigo int,
    nome varchar(200),
    telefone varchar(50),
    cidade varchar(100)
);

CREATE TABLE Funcionarios(
    codigo int primary key not null,
    nome varchar(255),
    telefone varchar(255),
    cidade varchar(255),
    estado varchar(255),
    cep varchar(255),
    rg varchar(255),
    cpf varchar(255),
    salario float
);

CREATE TABLE Fornecedores(
    nome varchar(255),
    endereco varchar(255),
    telefone varchar(255),
    cidade varchar(255),
    estado varchar(255),
    cep varchar(255),
    cnpj varchar(255),
    email varchar(255)
);

CREATE TABLE Livros(
    codigo int primary key not null,
    nome varchar(255),
    categoria varchar(255),
    resumo varchar(255),
    precocusto float,
    precovenda float
);

DESC Funcionarios;

DESC Fornecedores;

DESC Livros;

CREATE TABLE Estoque(
    codigo int primary key not null,
    nomedoproduto varchar(255),
    categoria varchar(255),
    quantidade int,
    fornecedor varchar(255)
);

CREATE TABLE Notas(
    codigo int primary key not null,
    nomedoaluno varchar(255),
    bimestre int
);

CREATE TABLE Caixa(
    codigo int primary key not null,
    data_caixa datetime,
    descricao varchar(255),
    debito decimal(10, 2),
    credito decimal(10, 2)
);

CREATE TABLE contasApagar(
    codigo int primary key not null,
    data_conta datetime,
    descricao varchar(255),
    valor decimal(10, 2),
    data_pagamento datetime
);

CREATE TABLE contasAReceber(
    codigo int primary key not null,
    data_conta datetime,
    descricao varchar(255),
    valor decimal(10, 2),
    data_recebimento datetime
);

CREATE TABLE Filmes(
    codigo int primary key not null,
    nome varchar(255),
    cantor varchar(255),
    ano int,
    quantidadedemusicas int
);

DROP TABLE Alunos2;

-- Comentado para o codigo executar
-- DESC Alunos2;
DROP TABLE Livros;

DROP TABLE contasApagar;

DROP TABLE contasAReceber;

DROP TABLE Filmes;

DESC Estoque;

DESC Notas;

DESC Caixa;

ALTER TABLE
    Alunos RENAME TO superAlunos;

DESC superAlunos;

ALTER TABLE
    Estoque RENAME TO Produtos;

ALTER TABLE
    Notas RENAME TO Aprovados;

ALTER TABLE
    Aprovados RENAME TO Notas;

-- DROP TABLE Dinheiro;
-- A tabela (dinheiro) nao foi iniciada em nenhum momento na lista de exercicios
DROP TABLE Notas;

ALTER TABLE
    superAlunos RENAME TO Alunos;

ALTER TABLE
    Alunos RENAME TO Estudantes;

ALTER TABLE
    Estudantes RENAME TO superEstudantes;

DESC superEstudantes;

DROP TABLE superEstudantes;

-- Comentado para o codigo executar
-- DESC superEstudantes;
-- DESC Alunos;
-- Tabela Alunos criada novamente para executar
CREATE TABLE Alunos(
    codigo int,
    nome varchar(50),
    telefone varchar(50),
    cidade varchar(50)
);

ALTER TABLE
    Alunos
ADD
    COLUMN estado varchar(255);

-- Apaga a tabela Caixa para cria-la novamente
DROP TABLE Caixa;

CREATE TABLE Caixa(
    codigo int primary key not null,
    data_caixa datetime,
    descricao varchar(255),
    debito decimal(10, 2),
    credito decimal(10, 2)
);

ALTER TABLE
    Caixa
ADD
    COLUMN observacao varchar(255),
ADD
    COLUMN cpf varchar(255);

DESC Caixa;

ALTER TABLE
    Caixa
ADD
    COLUMN saldo decimal(10, 2);

-- Fim