CREATE TABLE Documento(
    idDocumento int PRIMARY KEY NOT NULL,
    PRIMARY KEY (idDocumento),
    idPessoa int NOT NULL,
    FOREIGN KEY (idPessoa) REFERENCES Pessoa(idPessoa),
    tipo varchar(255),
    numero varchar(255)
);