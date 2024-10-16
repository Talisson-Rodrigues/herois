CREATE DATABASE herois;

USE herois;

CREATE TABLE super_heroi (
	id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    apelido VARCHAR(255),
    superPoder VARCHAR(255),
    fraqueza VARCHAR(255),
    historiaOrigem TEXT,
    primeiraAparicao DATE
);