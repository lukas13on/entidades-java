DROP DATABASE IF EXISTS Banco;

CREATE DATABASE Banco CHARACTER SET utf8 COLLATE utf8_general_ci;

USE Banco;

CREATE TABLE Pessoa(
    idPessoa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome varchar(255),
    sobrenome varchar(255),
    patrimonio float
);

CREATE TABLE Contato(
    idContato int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    idPessoa int NOT NULL,
    telefone varchar(255),
    celular varchar(255),
    CONSTRAINT FKidPessoa FOREIGN KEY (idPessoa) REFERENCES Pessoa(idPessoa)
);

desc Contato;

desc Pessoa;

-- Lucas
INSERT INTO
    Pessoa
SET
    nome = 'Lucas',
    sobrenome = 'Neitzke';

INSERT INTO
    Contato
SET
    telefone = '(45) 98820-0894',
    idPessoa = (
        SELECT
            idPessoa
        FROM
            Pessoa
        WHERE
            1
        ORDER BY
            idPessoa DESC
        LIMIT
            1
    );

INSERT INTO
    Contato
SET
    telefone = '(45) 3054-1647',
    idPessoa = (
        SELECT
            idPessoa
        FROM
            Pessoa
        WHERE
            1
        ORDER BY
            idPessoa DESC
        LIMIT
            1
    );

-- Giulia
INSERT INTO
    Pessoa
SET
    nome = 'Giulia',
    sobrenome = 'Beatriz';

INSERT INTO
    Contato
SET
    telefone = '(45) 11111-1111',
    idPessoa = (
        SELECT
            idPessoa
        FROM
            Pessoa
        WHERE
            1
        ORDER BY
            idPessoa DESC
        LIMIT
            1
    );

INSERT INTO
    Contato
SET
    telefone = '(45) 1111-1111',
    idPessoa = (
        SELECT
            idPessoa
        FROM
            Pessoa
        WHERE
            1
        ORDER BY
            idPessoa DESC
        LIMIT
            1
    );