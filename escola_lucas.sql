-- Criar o banco de dados – Escola
-- Lembrar de criar todos os detalhes – chave primárias – chave estrangeiras- tipos de dados;
-- Criar a tabela professor;
-- Criar a tabela aluno;
-- Criar a tabela turma;
-- Criar a tabela aula;
-- Aluno pode pertencer somente a uma turma;
-- Um turma pode ter vários alunos;
-- Um professor pode pertencer a várias turmas;
-- Uma turma pode ter vários professores;
-- Uma aula pode ter somente um professor;
-- Uma aula pode ter vários alunos;
CREATE DATABASE EscolaLucas;

use EscolaLucas;

CREATE TABLE Professor(
    idProfessor int primary key not null,
    nome varchar(255),
    sobrenome varchar(255)
);

CREATE TABLE Aluno(
    idAluno int primary key not null,
    idTurma int not null,
    idAula int not null,
    nome varchar(255),
    sobrenome varchar(255)
);

CREATE TABLE Turma(
    idTurma int primary key not null,
    nome varchar(255),
    sobrenome varchar(255)
);

CREATE TABLE TurmaProfessores(
    idTurmaProfessor int primary key not null,
    idTurma int not null,
    idProfessor int not null
);

CREATE TABLE Aula(
    idAula int primary key not null,
    idProfessor int not null,
    turno varchar(255) default "vespertino"
);

ALTER TABLE
    Professor
ADD
    CONSTRAINT relProfessorTurmaProfessores FOREIGN KEY (idTurmaProfessor) REFERENCES TurmaProfessores(idTurmaProfessor);

ALTER TABLE
    Aluno
ADD
    CONSTRAINT relAlunoTurma FOREIGN KEY (idTurma) REFERENCES Turma(idTurma);

ALTER TABLE
    Aluno
ADD
    CONSTRAINT relAlunoAula FOREIGN KEY (idAula) REFERENCES Aula(idAula);

ALTER TABLE
    Turma
ADD
    CONSTRAINT relTurmaTurmaProfessores FOREIGN KEY (idTurmaProfessor) REFERENCES TurmaProfessores(idTurmaProfessor);

ALTER TABLE
    TurmaProfessores
ADD
    CONSTRAINT relTPTurma FOREIGN KEY (idTurma) REFERENCES Turma(idTurma);

ALTER TABLE
    TurmaProfessores
ADD
    CONSTRAINT relTPProfessor FOREIGN KEY (idProfessor) REFERENCES Professor(idProfessor);

ALTER TABLE
    Aula
ADD
    CONSTRAINT relAulaProfessor FOREIGN KEY (idProfessor) REFERENCES Professor(idProfessor);