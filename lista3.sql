CREATE DATABASE Clinica;

USE Clinica;

CREATE TABLE Sala(
    idSala int primary key not null,
    numeroSala int unique not null,
    andar int unique not null,
    CHECK (
        numeroSala > 1
        AND numeroSala < 50
    ),
    CHECK (andar < 12)
);

CREATE TABLE Medicos(
    idMedico int primary key not null,
    crm varchar(15) unique not null,
    nome varchar(40) not null,
    idade int,
    especialidade char(20) not null default 'Ortopedia',
    cpf varchar(15) unique,
    dataAdmissao date,
    CHECK (idade > 23)
);

CREATE TABLE Pacientes(
    idPaciente int primary key not null,
    rg varchar(15) unique not null,
    nome varchar(40) not null,
    dataNascimento date,
    cidade char(30) default 'Itabuna',
    doenca varchar(40) not null,
    planoSaude varchar(40) not null default 'SUS'
);

CREATE TABLE Funcionarios(
    idFuncionario int primary key not null,
    matricula varchar(15) unique not null,
    nome varchar(40) not null,
    dataNascimento date not null,
    dataAdmissao date not null,
    cargo varchar(40) not null default 'Assistente Médico',
    salario float not null default '510.00'
);

CREATE TABLE Consultas(
    idConsulta int primary key not null,
    codigoConsulta int unique not null,
    dataHorario datetime,
    idPaciente int not null,
    idMedico int not null,
    CONSTRAINT fkIdPaciente FOREIGN KEY (idPaciente) REFERENCES Pacientes(idPaciente),
    CONSTRAINT fkIdMedico FOREIGN KEY (idMedico) REFERENCES Medicos(idMedico)
);