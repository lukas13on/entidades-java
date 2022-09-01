CREATE TABLE Contato(
    idContato int PRIMARY KEY NOT NULL,
    PRIMARY KEY (idContato),
    idPessoa int NOT NULL,
    FOREIGN KEY (idPessoa) REFERENCES Pessoa(idPessoa),
    email varchar(255),
    celular varchar(255),
    telefone varchar(255)
);