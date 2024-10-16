CREATE DATABASE herois;

USE herois;

CREATE TABLE super_herois (
	id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    apelido VARCHAR(255),
    superPoder VARCHAR(255),
    fraqueza VARCHAR(255),
    historiaDeOrigem TEXT,
    primeiraAparicao DATE
);