create database consultorio_medico;

use projeto;
use consultorio_medico;
 create table if not exists administrador (
 ID int(10) not null auto_increment,
 senha varchar (5) not null,
 email varchar (30) not null,
 nome varchar (10) not null,
 telefone varchar(10),
 primary key (id)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS medicos (
  id int(10) NOT NULL AUTO_INCREMENT,
  crm int(11) NOT NULL,
  nome_medico varchar(50) NOT NULL,
  cpf varchar(50) NOT NULL,
  rg varchar(50) NOT NULL,
  telefone varchar(50) NOT NULL,
  endereco varchar(100) NOT NULL,
  sexo varchar(50) NOT NULL,
  PRIMARY KEY (id),
  KEY crm (crm)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `rg` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `convenio` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


CREATE TABLE IF NOT EXISTS `consultas` (
  `id_con` int(10) NOT NULL AUTO_INCREMENT,
  `id_med` int(10) NOT NULL,
  `id_pac` int(10) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  PRIMARY KEY (`id_con`),
  KEY `FK_consultas_paciente` (`id_pac`),
  KEY `FK_consultas_medicos` (`id_med`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS secretaria (
  id int(10) NOT NULL AUTO_INCREMENT,
  nome_secretaria varchar(50) NOT NULL,
  cpf varchar(50) NOT NULL,
  rg varchar(50) NOT NULL,
  telefone varchar(50) NOT NULL,
  endereco varchar(100) NOT NULL,
  sexo varchar(50) NOT NULL,
  senha varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


drop table administrador;
drop table medicos;
drop table paciente;
drop table consultas;

show tables;
Select * from Medicos;
Select * from Paciente;
Select * from secretaria;
Select * from consultas;

SHOW COLUMNS FROM secretaria;

drop table  secretaria;


SELECT 
  c.id_con,
  c.data,
  c.hora,
  m.nome_medico AS nome_do_medico,
  p.nome AS nome_do_paciente
FROM 
  consultas c
JOIN 
  medicos m ON c.id_med = m.id
JOIN 
  paciente p ON c.id_pac = p.id;
  
