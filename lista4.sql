CREATE DATABASE Lista4;

use Lista4;

CREATE TABLE Medicos(
    idMedico int primary key not null,
    crm varchar(15) unique not null,
    nome varchar(40) not null,
    idade int,
    especialidade char(20) not null default "Ortopedia",
    cpf varchar(15) unique not null,
    dataAdmissao date,
    CHECK (idade > 23),
);

CREATE TABLE Sala(
    idSala int primary key not null,
    idMedico int not null,
    numeroSala int unique not null,
    andar int unique not null,
    CONSTRAINT relSalaMedico FOREIGN KEY idMedico REFERENCES Medicos(idMedico)
);

CREATE TABLE Funcionarios(
    idFuncionario int primary key not null,
    matricula varchar(15) unique not null,
    nome varchar(40) not null,
    dataNascimento date not null,
    dataAdmissao date not null,
    cargo varchar(40) not null default "Assistente Médico",
    salario float not null default 510.00
);

CREATE TABLE Consultas(
    idConsulta int primary key not null,
    idPaciente int not null,
    idMedico int not null,
    codigoConsulta int unique not null,
    dataHorario datetime,
    CONSTRAINT relConsultaMedico FOREIGN KEY idMedico REFERENCES Medicos(idMedico),
    CONSTRAINT relConsultaPaciente FOREIGN KEY idPaciente REFERENCES Pacientes(idPaciente)
);

CREATE TABLE Pacientes(
    idPaciente int primary key not null,
    rg varchar(15) unique not null,
    nome varchar(40) not null,
    dataNascimento date,
    cidade char(30) default "Itabuna",
    doenca varchar(40) not null,
    planoSaude varchar(40) not null default "SUS"
);