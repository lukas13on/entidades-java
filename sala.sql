CREATE DATABASE EscolaLucas;

use EscolaLucas;

CREATE TABLE Professor(
    idProfessor int primary key not null,
    -- Um professor pode pertencer a várias turmas;
    -- Uma turma pode ter vários professores;
    nome varchar(255),
    sobrenome varchar(255),
    idTurmaProfessor int not null
);

CREATE TABLE Aluno(
    idAluno int primary key not null,
    -- Um turma pode ter vários alunos;
    idTurma int not null,
    -- Uma aula pode ter vários alunos;
    idAula int not null,
    nome varchar(255),
    sobrenome varchar(255)
);

CREATE TABLE Turma(
    idTurma int primary key not null,
    -- Um professor pode pertencer a várias turmas;
    -- Uma turma pode ter vários professores;
    idTurmaProfessor int not null,
    nome varchar(255),
    sobrenome varchar(255)
);

-- Um professor pode pertencer a várias turmas;
-- Uma turma pode ter vários professores;
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