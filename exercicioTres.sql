USE ESCOLA;
DROP DATABASE ESCOLA;
CREATE DATABASE ESCOLA;
USE ESCOLA;
SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE instrutores (
  id INT NOT NULL PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  valor_hora INT UNSIGNED NULL,
  certificados VARCHAR(255) NULL
);

CREATE TABLE cursos (
  id INT NOT NULL PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  requisito VARCHAR(255) NULL,
  carga_horaria INT UNSIGNED NULL,
  preco DOUBLE UNSIGNED NULL

);
 
CREATE TABLE alunos (
  id INT NOT NULL PRIMARY KEY,
  cpf CHAR(11) NOT NULL,
  nome VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  fone CHAR(14) NOT NULL,
  data_nascimento DATE NULL
);
 
CREATE TABLE turmas (
  id INT NOT NULL PRIMARY KEY,
  instrutor_id INT NOT NULL,
  curso_id INT NOT NULL,
  data_inicio DATE NULL,
  data_final DATE NULL,
  carga_horaria INT UNSIGNED NULL,
  CONSTRAINT CURSO_TURMA_FK FOREIGN KEY (curso_id)
    REFERENCES cursos(id),
  CONSTRAINT INSTRUTOR_TURMA_FK FOREIGN KEY(instrutor_id)
    REFERENCES instrutores(id)
);
 
CREATE TABLE matriculas (
  id INT NOT NULL PRIMARY KEY,
  turma_id INT NOT NULL,
  aluno_id INT NOT NULL,
  data_matricula DATE NULL,
   CONSTRAINT ALUNO_MATRICULA_FK FOREIGN KEY(aluno_id)
    REFERENCES alunos(id),
  CONSTRAINT TURMA_MATRICULA_FK FOREIGN KEY(turma_id)
    REFERENCES turmas(id)
);

-- INSERT INTO INSTRUTORES;
INSERT INTO instrutores (id, nome, email, valor_hora, certificados)
VALUES
(1, 'Daniel', 'daniel@gmail.com', 10, "Padeiro"),
(2, 'Gerald', 'gerald@gmail.com', 15, "Super Sayajin"),
(3, 'Mark', 'mark@gmail.com', 25, "Pedreiro"),
(4, 'William', 'willian@gmail.com', 150, "Engenharia de Pesca" ),
(5,  'Richard', 'richard@gmail.com', 200, "Engenharia Mecatronica Cibernetica");

-- INSERT INTO CURSOS;
INSERT INTO cursos ( id, nome, requisito, carga_horaria, preco)
VALUES 
(6, "Banco de dados", "Ensino medio completo.", 12, 300),
(7, "Arquiteto de minecraft", "Ensino medio completo.", 30, 2500.40),
(8, "Sapateiro", "Ensino medio completo.", 25, 700),
(9, "Rinha de galo", "Ensino medio completo.", 40, 500),
(10, "Auxiliar de anao", "Ensino medio completo.", 20, 150);

-- INSERT INTO TURMAS;
INSERT INTO turmas (id, instrutor_id, curso_id, data_inicio, data_final, carga_horaria)
VALUES 
(11, 1, 6, '25/10/2022', '25/10/2023', 40),
(12, 2, 7, '13/10/2022', '15/03/2023', 120),
(13, 3, 8, '05/01/2022', '10/01/2023', 200),
(14, 4, 9,  '02/05/2022', '25/11/2023', 135),
(15, 5, 10, '25/04/2022', '25/06/2023', 30);

-- INSERT INTO ALUNOS;
INSERT INTO alunos (id, cpf, nome, email, fone, data_nascimento)
VALUES 
(21, 11324555692, "Pedro", "pedro@gmail.com", 443101900, '05/07/2002'),
(22, 11455789002, "Goku", "goku@gmail.com", 43998114260, '03/08/1997'),
(23,  11243387609, "Kuririn", "kuririn@gmail.com", 5591972423, '28/05/2005'),
(24, 11788998702, "Guts", "guts@gmail.com", 449991234322, '11/12/2002'),
(25, 12343223406, "Ashe", "ashe@gmail.com", 3455987223, '05/03/1998');

-- INSERT INTO MATRICULAS;
INSERT INTO matriculas (id, aluno_id, turma_id, data_matricula)
VALUES 
(16, 21, 11, '25/10/2022'),
(17, 22, 12, '23/10/2022'),
(18, 23, 13, '17/10/2022'),
(19, 24, 14, '05/10/2022'),
(20, 25, 15, '13/10/2022');

-- UPDATE
UPDATE  instrutores
SET nome = "Baianinho de maua"
WHERE id = 1;

UPDATE  instrutores
SET email = "baianinho@gmal.com"
WHERE nome = "Baianinho de maua";

UPDATE  cursos
SET nome = "Mecanico de hotweels"
WHERE id = 06;

UPDATE  cursos
SET carga_horaria = 40
WHERE nome = "Mecanico de hotweels";

UPDATE  turmas
SET instrutor_id = 4
WHERE id = 12 ;

UPDATE  turmas
SET instrutor_id = 5
WHERE id = 13 ;

-- DELETE;
DELETE FROM instrutores
WHERE id = 1;

DELETE FROM instrutores
WHERE nome = 'Mark';

DELETE FROM cursos
WHERE id = 7;

DELETE FROM cursos
WHERE nome = 'Sapateiro';

DELETE FROM alunos
WHERE id = 22;

DELETE FROM alunos
WHERE nome = 'Guts';

DELETE FROM turmas
WHERE id = 12;

DELETE FROM turmas
WHERE data_inicio = '25/04/2022';

DELETE FROM matriculas
WHERE id = 18;

DELETE FROM matriculas
WHERE data_matricula = '23/10/2022';