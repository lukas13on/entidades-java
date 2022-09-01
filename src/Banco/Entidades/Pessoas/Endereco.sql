CREATE TABLE Endereco(
    idEndereco int PRIMARY KEY NOT NULL,
    PRIMARY KEY (idEndereco),
    idPessoa int NOT NULL,
    FOREIGN KEY (idPessoa) REFERENCES Pessoa(idPessoa),
    logradouro varchar(255),
    numero varchar(255),
    cep varchar(255),
    estado varchar(255),
    cidade varchar(255)
);