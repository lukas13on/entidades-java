CREATE DATABASE Lista02;

use Lista02;

CREATE TABLE Alunos(
    codigo int,
    nome varchar(50),
    telefone varchar(50),
    cidade varchar(50)
);

desc Alunos;

CREATE TABLE Alunos2(
    codigo int,
    nome varchar(200),
    telefone varchar(50),
    cidade varchar(100)
);

CREATE TABLE Funcionarios(
    codigo int PRIMARY KEY NOT NULL,
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
    codigo int PRIMARY KEY NOT NULL,
    nome varchar(255),
    categoria varchar(255),
    resumo varchar(255),
    precocusto float,
    precovenda float
);

desc Funcionarios;

desc Fornecedores;

desc Livros;

CREATE TABLE Estoque(
    codigo int PRIMARY KEY NOT NULL,
    nomedoproduto varchar(255),
    categoria varchar(255),
    quantidade int,
    fornecedor varchar(255)
);

CREATE TABLE Notas(
    codigo int PRIMARY KEY NOT NULL,
    nomedoaluno varchar(255),
    bimestre int
);

CREATE TABLE Caixa(
    codigo int PRIMARY KEY NOT NULL,
    data_caixa date
);