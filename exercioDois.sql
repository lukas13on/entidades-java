CREATE DATABASE ESCOLA;

USE ESCOLA;

SET
    SQL_SAFE_UPDATES = 0;

SET
    FOREIGN_KEY_CHECKS = 0;

CREATE TABLE Professor(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL
);

CREATE TABLE Aluno(
    id INT NOT NULL PRIMARY KEY,
    idTurma INT NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    dataMatricula DATE NOT NULL
);

CREATE TABLE Turma(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    ano DATE NOT NULL
);

CREATE TABLE Aula(
    id INT NOT NULL PRIMARY KEY,
    idProfessor INT NOT NULL UNIQUE,
    nome VARCHAR(100),
    horario TIME
);

CREATE TABLE AulaAlunos(
    id INT NOT NULL PRIMARY KEY,
    idAula INT NOT NULL UNIQUE,
    idAluno INT NOT NULL UNIQUE
);

-- tabela associativa
CREATE TABLE TurmaProfessores(
    id INT NOT NULL PRIMARY KEY,
    idTurma INT NOT NULL UNIQUE,
    idProfessor int not null
);

ALTER TABLE
    Aluno
ADD
    CONSTRAINT fkAlunoTurma FOREIGN KEY (idTurma) REFERENCES Turma(id);

ALTER TABLE
    TurmaProfessores
ADD
    CONSTRAINT fkTPTurma FOREIGN KEY (idTurma) REFERENCES Turma(id);

ALTER TABLE
    TurmaProfessores
ADD
    CONSTRAINT fkTPProfessor FOREIGN KEY (idProfessor) REFERENCES Professor(id);

ALTER TABLE
    AulaAlunos
ADD
    CONSTRAINT fkAAAula FOREIGN KEY (idAula) REFERENCES Aula(id);

ALTER TABLE
    AulaAlunos
ADD
    CONSTRAINT fkAAAluno FOREIGN KEY (idAluno) REFERENCES Aluno(id);

-- Insert Aluno
INSERT INTO
    Aluno (
        id,
        idTurma,
        nome,
        idade,
        dataMatricula
    )
VALUES
    (1, 5, 'Carlos', 18, DATE('2022/01/20')),
    (2, 6, 'João', 21, DATE('2022/01/23'));

-- Insert Professor;
INSERT INTO
    Professor(id, nome, idade)
VALUES
    (3, 'Edson Pereira', 54),
    (4, 'Kauan Reymond', 25);

-- Insert Turma
INSERT INTO
    Turma(id, nome, ano)
VALUES
    (5, 'A', DATE('2022/12/30')),
    (6, 'B', DATE('2021/08/23'));

-- Insert Aula
INSERT INTO
    Aula(id, idProfessor, nome, horario)
VALUES
    (7, 3, 'Ciencia da computação', TIME('19:10:00')),
    (8, 4, 'Analise de sistemas', TIME('13:30:00'));

-- Update Aluno
UPDATE
    Aluno
SET
    nome = 'Carlos Andrade'
WHERE
    id = 1;

-- Update Professor
UPDATE
    Professor
SET
    nome = 'Kauan Lucas'
WHERE
    id = 4;

-- Update Turma
UPDATE
    Turma
SET
    nome = 'Boa noite cinderela'
WHERE
    id = 6;

-- Update Aula
UPDATE
    Aula
SET
    idProfessor = 4
WHERE
    id = 8;

-- Delete Aluno
DELETE FROM
    Aluno
WHERE
    id = 1;

-- Delete Aula
DELETE FROM
    Aula
WHERE
    id = 8;

-- Delete Professor
DELETE FROM
    Professor
WHERE
    id = 3;

-- Delete Turma
DELETE FROM
    Turma
WHERE
    id = 5;