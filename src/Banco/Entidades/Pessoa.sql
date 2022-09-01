CREATE TABLE Pessoa (
    idPessoa int PRIMARY KEY NOT NULL,
    PRIMARY KEY (idPessoa),
    idDocumento int NOT NULL,
    FOREIGN KEY (idDocumento) REFERENCES Documento(idDocumento),
    idContato int NOT NULL,
    FOREIGN KEY (idContato) REFERENCES Contato(idContato),
    idEndereco int NOT NULL,
    FOREIGN KEY (idEndereco) REFERENCES Endereco(idEndereco),
    nome varchar(255),
    sobrenome varchar(255),
    nascimento varchar(255)
);