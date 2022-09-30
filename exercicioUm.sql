CREATE DATABASE BIBLIOTECA_2;

USE BIBLIOTECA_2;

-- Livro: precisa fk
CREATE TABLE Livro(
    id INT NOT NULL PRIMARY KEY,
    idEditora INT NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    dataPublicacao DATE NOT NULL
);

-- Editora
CREATE TABLE Editora(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    dataFundacao DATE NOT NULL
);

-- Autor
CREATE TABLE Autor(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    dataNascimento DATE NOT NULL
);

-- Categoria
CREATE TABLE Categoria(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

-- associativa livro categoria: precis fk
CREATE TABLE LivroCategorias(
    id INT NOT NULL PRIMARY KEY,
    idLivro INT NOT NULL UNIQUE,
    idCategoria INT NOT NULL UNIQUE
);

-- associativa livro autor: precisa fk
CREATE TABLE LivroAutores(
    id INT NOT NULL PRIMARY KEY,
    idLivro INT NOT NULL UNIQUE,
    idAutor INT NOT NULL UNIQUE
);

-- associativa livro autor: precisa fk
CREATE TABLE LivroEditoras(
    id INT NOT NULL PRIMARY KEY,
    idLivro INT NOT NULL UNIQUE,
    idEditora INT NOT NULL UNIQUE
);

ALTER TABLE
    Livro
ADD
    CONSTRAINT FKLivroEditora FOREIGN KEY (idEditora) REFERENCES Editora(id);

ALTER TABLE
    LivroCategorias
ADD
    CONSTRAINT fkLCLivro FOREIGN KEY (idLivro) REFERENCES Livro(id);

ALTER TABLE
    LivroCategorias
ADD
    CONSTRAINT fkLCCategoria FOREIGN KEY (idCategoria) REFERENCES Categoria(id);

ALTER TABLE
    LivroAutores
ADD
    CONSTRAINT fkLALivro FOREIGN KEY (idLivro) REFERENCES Livro(id);

ALTER TABLE
    LivroAutores
ADD
    CONSTRAINT fkLAAutor FOREIGN KEY (idAutor) REFERENCES Autor(id);

ALTER TABLE
    LivroEditoras
ADD
    CONSTRAINT fkLELivro FOREIGN KEY (idLivro) REFERENCES Livro(id);

ALTER TABLE
    LivroEditoras
ADD
    CONSTRAINT fkLEEditora FOREIGN KEY (idEditora) REFERENCES Editora(id);

-- Insert Editora
INSERT INTO
    Editora(id, nome, dataFundacao)
VALUES
    (1, 'Abril', DATE('2007/10/20')),
    (2, 'Veja', DATE('2009/05/15'));

-- Insert Autor
INSERT INTO
    Autor(id, nome, dataNascimento)
VALUES
    (3, "Kleverson Chincoski", DATE('1990/06/21')),
    (4, "Hobert Stretso", DATE('2001/03/15'));

-- Insert Categoria
INSERT INTO
    Categoria(id, nome)
VALUES
    (5, 'Revista '),
    (6, 'Livro grande');

-- Insert Livro
INSERT INTO
    Livro(id, idEditora, nome, dataPublicacao)
VALUES
    (
        7,
        1,
        'Ciencia da computação',
        DATE('2005/06/01')
    ),
    (8, 2, 'Analise de sistemas', DATE('2010/02/25'));

-- Insert LivroCategoria
INSERT INTO
    LivroCategorias(id, idLivro, idCategoria)
VALUES
    (9, 7, 5),
    (10, 8, 6);

-- Insert LivroAutors
INSERT INTO
    LivroAutores(id, idLivro, idAutor)
VALUES
    (11, 7, 3),
    (12, 8, 4);

-- Insert LivroEditoras
INSERT INTO
    LivroEditoras(id, idLivro, idEditora)
VALUES
    (13, 7, 1),
    (14, 8, 2);

UPDATE
    Livro
SET
    nome = 'Engenharia da computação'
WHERE
    id = 7;

UPDATE
    Editora
SET
    nome = 'Maio'
WHERE
    id = 1;

UPDATE
    Autor
SET
    nome = 'Machado de cabral'
WHERE
    id = 3;

UPDATE
    Categoria
SET
    nome = 'Almanarque'
WHERE
    id = 5;

DELETE FROM
    Livro
WHERE
    id = 7;

DELETE FROM
    Editora
WHERE
    id = 1;

DELETE FROM
    Autor
WHERE
    id = 3;

DELETE FROM
    Categoria
WHERE
    id = 5;